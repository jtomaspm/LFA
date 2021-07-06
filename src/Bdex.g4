grammar Bdex;

program: operation* EOF
        ;


operation:
		createTable
		|tableOperation
    	|junction
    	|forOperation	
    	|newVarName
    	|extraction
		|print
    	;

tableOperation:
	 	VARNAME '.' delete							#topDel
		|VARNAME '.' numOp							#topNum
    	|VARNAME '.' setValue						#topSet
    	|VARNAME '.' read							#topRed
	;



numOp:  media
    	| add
    	| sum
    	| div
    	| mull
	;


media returns[String var = null]:
    'mediaColl' '(' STRING   ')'					#mediaColl
    |'mediaLine' '(' expr  ')'         	    			#mediaLine
    ;

sum returns[String var = null]:
    'sumColl' '(' STRING	')'					# tableOperationSumColl
    |'sumLine' '(' expr 	')'					# tableOperationSumLine
    ;

div returns[String var = null]:
    'divColl' '(' STRING  ')'                  			# tableOperationDivColl
    | 'divLine' '(' expr   ')'                			# tableOperationDivLine
    ;	

mull returns[String var = null]:
    'mullColl' '(' STRING  ')'                 			# tableOperationMullColl
    | 'mullLine' '(' expr  ')'             			# tableOperationMullLine
    ;

add:
	'addLine' '(' STRING (',' STRING)* ')'		#addLineStr
    	;

delete:
    'deleteLine' '(' expr ')'               			#deleteLine
    ;

extraction returns[String var = null]:
	'extract' '(' VARNAME ',' (VARNAME|STRING(','STRING)* ',' (INT (',' INT)*))')'	#extractVarnameOuStringOuINT
	;

createTable returns[String var = null]:
	'Table' VARNAME '=' STRING? (',' STRING)*		#creatTABLE
	| 'Table' VARNAME '=' VARNAME'.'junction 			#creatTableJunction
	|'Table' VARNAME '=' extraction					#creatTableExtraction
	|'Table' VARNAME '=' VARNAME'.'iteration						#creatTableIteration
	;


setValue:
	'setValue' '(' INT ',' STRING ',' STRING ')'	#setValueTable
	;

junction returns[String var = null]:
	'junctionTables' '(' VARNAME ',' VARNAME ')'		#juncTable
	;

read returns[String var = null]:
	'readColl' '(' CollName=STRING ')'			#readColl
	|'readLine' '(' LineIndex=expr ')'			#readLine
	|'readStr' '(' CollName=STRING ',' LineIndex=expr ')'	#readSTR
	;




iteration returns[String var = null]:
	'iteration' '(' STRING ',' STRING ')'					#iterationTableCollumnLine
	;


forOperation:
	'for' ('(')? (iterator=VARNAME  '=' startExpr=INT range=':' endExpr=INT) (')')? operation* 'endfor'	
	;

expr returns[String var = null]:
    expr op = ('*' | '/') expr        												# exprMultDivMod
    | expr op = ('+' | '-') expr   													# exprAddSub
    | '(' expr ')'                     												# exprParent
    | DOUBLE																#exprDouble
    | VARNAME															#exprVar
    | INT																#exprInt
    ;

newVarName returns[String var = null]:
	'number'  VARNAME '=' (expr|VARNAME'.'numOp)													#newVarNameDouble
	|'str'	VARNAME '=' STRING													#newVarNameString
	|'array' VARNAME '=' '{' STRING (',' STRING)* '}'										#newVarNameArray
	;

print:
	'print' '(' STRING ')'  	#printStr
	|'print' '(' expr ')'	  #printExpr
	;

VARNAME: [a-zA-Z]+[0-9]*;
STRING: '"' .*? '"';
INT: [0-9]+;
DOUBLE: INT ('.' INT)?;
WS: [ \t\n]+ -> skip;
COMMENT:  '//'  .*?  '\n '->skip;
ERROR: .;
