grammar importBdex;

program:
	stat* EOF
	;
	
stat:
	importar
	|exportar
	;
	
importar:
	'importar' '(' STRING ')'
	;

exportar:
	'exportar' '(' STRING ')'
	;
	
VARNAME: [a-zA-Z]+[0-9]*;
STRING: '"' .*? '"';
INT: [0-9]+;
DOUBLE: INT ('.' INT)?;
WS: [ \t\n]+ -> skip;
COMMENT:  '//'  .*?  '\n '->skip;
ERROR: .;
