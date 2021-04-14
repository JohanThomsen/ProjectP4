grammar g;

program: expressions '.' EOF;

expressions: expression '.' expressions
| expression;

expression: Id
| assign
| classdcl
//| methoddcl
//| methodcall
| ctrlstruc
| init
| math
| bool;

ctrlstruc: 'if' expression ':' expressions ';' #ctrlif;
//| while
//| for
//| switch

classdcl: 'There can exist a'('n'?) Id ':' expressions;

//methoddcl:  'can' Id ':' expressions
//| Id 'can' Id 'with' expressions ':' expressions;

assign: Id ('has'|'is') ('an'|'a')? (Id | Number | math) //Make so its needs at least one of these, to avoid "Id expression" assignments
| Id ('has'|'is') ('an'|'a')? attributes;

init: 'There is a'('n'?) Id 'called' Id
| Id 'has' 'a'('n'?) Id 'called' Id
;
//| 'upon action' methodcall;

math: '(' math ')'          #mathParenthesis
| math mult='*' math        #mathMult
| math div='/' math         #mathDiv
| math add=('+' | '-') math #mathAdd
| Id                        #MathId
| Number                    #MathNumber
;

bool: '(' bool ')'                   #boolParanthesis
| bool 'is equal to' bool            #boolEquals
| bool 'is less than' bool           #boolLess
| bool 'is greater than' bool        #boolGreater
| bool 'is less or equal to' bool    #boolLE
| bool 'is greater or equal to' bool #boolGE
| bool 'contains' bool               #boolContains
| bool 'and' bool                    #boolAnd
| bool 'or' bool                     #boolOr
| 'not' bool                         #boolNot
| Id                                 #BoolId
| Number                             #BoolNumber
;


attributes: String
| String 'and' attributes;

//methodcall: 'Do' Id
//| 'Do' Id 'with' expressions; //TODO Fix to just call

Id: [a-zA-Z]+;

//Type: ([a-zA-Z]+);

//Indent: '    ';

String: '"' [ a-zA-Z0-9]* '"';

Number: [0-9]+ ('.' [0-9]+)?;

WS: (' '| '\t' | '\n' | '\r\n' )+ -> channel(HIDDEN);