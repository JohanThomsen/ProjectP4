grammar g;

program: statements EOF;

statements: statement statements
| statement
;

statement: expression
| classdcl 'then continue'
| methoddcl 'then continue'
| assign '.'
| init '.'
;

expression: Id
| methodcall '.'
| math '.'
| bool
| ctrlstruc 'then continue'
;

ctrlstruc: 'if' expression 'then do' statements  #ctrlif
| 'as long as' expression 'is true, do' statements #ctrlwhile
| 'repeat' Id 'from' math 'to' math statements #ctrlfor
//| switch
;

classdcl: 'There can exist a'('n'?) Id 'for which:' statements ;

methoddcl:  Id 'does' statements
| Id 'with' Id Id ('and' Id Id)* 'does' statements ;

assign: Id ('has'|'is') ('an'|'a')? (Id | Number | String | math ) //Make so its needs at least one of these, to avoid "Id expression" assignments
| Id ('has'|'is') ('an'|'a')? attributes;

init: 'There is a'('n'?) Id 'called' Id
| Id 'has' 'a'('n'?) Id 'called' Id
;

math: '(' math ')'          #mathParenthesis
| math '*' math        #mathMult
| math '/' math         #mathDiv
| math ('+' | '-') math         #mathAdd
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
| math                               #boolMath
;

attributes: String
| String 'and' attributes;

methodcall: 'do' Id
| 'do' Id 'with' Id(',' Id)*;


Id: [a-z_A-Z]+;

String: '"' [ a-zA-Z0-9]* '"';

Number: [0-9]+ ('.' [0-9]+)?;

WS: [ \t\r\n]+ -> channel(HIDDEN);