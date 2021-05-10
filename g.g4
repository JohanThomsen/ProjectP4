grammar g;

program: statements EOF;

statements: statement statements
| statement
;

statement: expression
| classdcl ('then'|'Then') 'continue'
| methoddcl ('then'|'Then') 'continue'
| assign '.'?
| init '.'
| Break '.'
;

expression: Id
| methodcall '.'
| math '.'
| bool
| ctrlstruc ('then'|'Then') 'continue'
;

ctrlstruc: ('if'|'If') expression 'then do' statements  #ctrlif
| ('as'|'As') 'long as' expression 'is true, do' statements #ctrlwhile
| ('repeat'|'Repeat') Id 'from' math 'to' math statements #ctrlfor
//| switch
;

classdcl: ('there'|'There') 'can exist a'('n'?) Id 'for which:' statements ;

methoddcl:  Id 'does' statements
| Id 'with' Id Id ('and' (Id Id)+)? 'does' statements ;

assign: Id ('has'|'is') ('an'|'a')? (Id | Number | String | expression) //Make so its needs at least one of these, to avoid "Id expression" assignments
| Id ('has'|'is') ('an'|'a')? attributes;

init: 'There is a'('n'?) Id 'called' Id
| Id 'has' 'a'('n'?) Id 'called' Id
;

math: '(' math ')'          #mathParenthesis
| math '*' math             #mathMult
| math '/' math             #mathDiv
| math ('+' | '-') math     #mathAdd
| Id                        #MathId
| Number                    #MathNumber
;

bool: '(' bool ')'                      #boolParanthesis
| bool 'is equal to' bool               #boolEquals
| (Id|String) 'is equal to' (Id|String) #stringEquals
| bool 'is less than' bool              #boolLess
| bool 'is greater than' bool           #boolGreater
| bool 'is less or equal to' bool       #boolLE
| bool 'is greater or equal to' bool    #boolGE
| bool 'contains' bool                  #boolContains
| bool 'and' bool                       #boolAnd
| bool 'or' bool                        #boolOr
| 'not' bool                            #boolNot
| math                                  #boolMath
| Id                                    #BoolId
| Number                                #BoolNumber
;

attributes: String
| String 'and' attributes;

methodcall: ('do'|'Do') Id
| ('do'|'Do') Id 'with' (Id(',' Id)* | String(',' String)* | math(',' math)*);


Id: [a-z_A-Z]+;

String: '"' [ a-zA-Z0-9]* '"';

Number: [0-9]+ ('.' [0-9]+)?;

Break: ('Break loop'|'break loop');

LineComment: '//' ~[\r\n]* -> channel(HIDDEN);

BlockComment: '/*' .*? '*/' -> channel(HIDDEN);

WS: [ \t\r\n]+ -> channel(HIDDEN);