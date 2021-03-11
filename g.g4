grammar g;

program: declares 'xd';

declares: declare declares
| declare;

declare: inits
| assigns
| classdcls
| methoddcl;

ctrlstruc: 'if' ctrlstrucparam 'is equal to' ctrlstrucparam
| 'if' ctrlstrucparam 'is less than' ctrlstrucparam
| 'if' ctrlstrucparam 'is more than' ctrlstrucparam;

ctrlstrucparam: Number
| Id
| math;

classdcls: classdcl classdcls
| classdcl;

classdcl: 'There can exist a' Id ':' declares
| 'There can exist an' Id ':' declares;

methoddcl: 'can' Id Id ':' bodies;

bodies: body bodies
| ;

body: Id 'is' Id '-' Id
| Id 'is' Id ' + ' Id
| ctrlstruc ':'
| methodcall;

inits: init inits
| init;

init: 'There is a'('n'?) Id 'called' Id
| 'There is a'('n'?) Id
| 'upon action' methodcall;

assigns: assign '.' assigns
| assign;

assign: 'which' ('has'?) ('a'?) ('is'?) Id
| 'which' ('has'?) ('a'?) ('is'?) String;

math: Number WS '-' WS Number
| Number WS '+' WS Number
| Number WS '*' WS Number
| Number WS '/' WS Number;

methodcall: Id Id; //TODO Fix to just call

Id: ([a-zA-Z]+);

//Type: ([a-zA-Z]+);

//Indent: '    ';

String: '"' [ a-zA-Z0-9]+ '"';

Number: [0-9]+ ('.' [0-9]+)?;

WS: (' '|'\t')+ -> channel(HIDDEN);