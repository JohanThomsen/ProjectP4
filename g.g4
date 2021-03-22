grammar g;

program: expressions 'xd';

expressions: expression '.' expressions
| expression;

expression: Id
| assign
| classdcl
| methoddcl
//| methodcall
| init
| math;

ctrlstruc: if;
//| while
//| for
//| switch

if: 'if' ctrlstrucparam 'is equal to' ctrlstrucparam
| 'if' ctrlstrucparam 'is less than' ctrlstrucparam
| 'if' ctrlstrucparam 'is more than' ctrlstrucparam;

ctrlstrucparam: Number
| Id
| expression;

classdcl: 'There can exist a'('n'?) Id ':' assigns;

methoddcl: 'can' Id Id ':' expressions;

init: 'There is a'('n'?) Id 'called' Id
| 'There is a'('n'?) Id
| 'upon action' methodcall;

assigns: assign ',' assigns
| assign;

assign: Id ('has'?) ('a'?'an'?) ('is'?) expression
| Id ('has'?) ('a'?) ('is'?) attributes;

attributes: String
|String 'and' attributes;

math: math mult='*' math  #mathMult
| math div='/' math       #mathDiv
| math add=('+' | '-') math #mathAdd
| Id                      #Id
| Number                  #Number
;

//methodcall: ('d'|'D')'o' Id expressions; //TODO Fix to just call

Id: [a-zA-Z]+;

//Type: ([a-zA-Z]+);

//Indent: '    ';

String: '"' [ a-zA-Z0-9]+ '"';

Number: [0-9]+ ('.' [0-9]+)?;

WS: (' '|'\t')+ -> channel(HIDDEN);