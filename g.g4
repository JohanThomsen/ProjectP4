grammar g;

program: expressions '.' ('\n')? '¤';

expressions: expression '.' ('\n')? expressions
| expression;

expression: Id
| assign
| classdcl
//| methoddcl
//| methodcall
| ctrlstruc
| init
| math;

ctrlstruc: ctrlif ':' expressions;
//| while
//| for
//| switch

ctrlif: 'if' ctrlstrucparam 'is equal to' ctrlstrucparam
| 'if' ctrlstrucparam 'is less than' ctrlstrucparam
| 'if' ctrlstrucparam 'is more than' ctrlstrucparam;

ctrlstrucparam: Number
| Id
| expression;

classdcl: 'There can exist a'('n'?) Id ':' assigns;

//methoddcl:  'can' Id ':' expressions
//| Id 'can' Id 'with' expressions ':' expressions;

init: 'There is a'('n'?) (Id | INT | STRING) 'called' Id
| 'There is a'('n'?) (Id | INT | STRING);
//| 'upon action' methodcall;

assigns: assign ',' assigns
| assign;

assign: Id ('has'|'is') ('an'|'a')? expression //Make so its needs at least one of these, to avoid "Id expression" assignments
| Id ('has'|'is') ('an'|'a')? attributes;

attributes: String
| String 'and' attributes;

//methodcall: 'Do' Id
//| 'Do' Id 'with' expressions; //TODO Fix to just call

math: math mult='*' math    #mathMult
| math div='/' math         #mathDiv
| math add=('+' | '-') math #mathAdd
| '(' math ')'              #mathParenthesis
| Id                        #Id
| Number                    #Number
;



//Keywords:
INT: 'number' | 'Number';
STRING: 'text' | 'Text';

Id: [a-zA-Z]+;

//Type: ([a-zA-Z]+);

//Indent: '    ';

String: '"' [ a-zA-Z0-9]+ '"';

Number: [0-9]+ ('.' [0-9]+)?;

WS: (' '|'\t')+ -> channel(HIDDEN);