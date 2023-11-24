grammar glc;

options {
    language=Java; // define a linguagem de saída 
}

@header {
	// imports
	import java.util.HashMap;
	import java.util.Map;
}

@members {
	Map<String, Double> vars = new HashMap<>(); // armazena as variáveis e seus valores
	String simbol = ""; // variável do simbolo atual
	String simbolTemp = "";	// variável temporária para a manipulação do simbolo atual
	String rel_op = "";	// operador relacional
	Double res_ae = 1.0; // resultado expressão aritmética
}

program	: statement+ // define o programa como um ou mais declarações
	;

// comandos
statement
	:	attribution
		SEMICOLON
	|	condition {
			res_ae = 1.0;
		}
	| 	iteration
	;

// atribuições de variáveis
attribution returns [ double v ]
	: VAR {
		simbol = $VAR.text;
	} 
	ASSIGNMENT_OP
	e = aritmetic_expression {
		$v = $e.v; 
		if(res_ae == 1) { 
			System.out.println(simbol + " = "  + $v); 
			vars.put(simbol, $v);
			//System.out.println(vars.toString());
		}
	}
;

// expressões aritméticas
aritmetic_expression returns [ double v ]
	: (
		CONST {
			$v = Double.parseDouble($CONST.text);
		} 
		| VAR {
			simbolTemp = $VAR.text;
			
			if(vars.get(simbolTemp) != null) {
				$v = vars.get(simbolTemp);
			} else {
				System.out.println("ERRO: Vari�vel " + simbolTemp + " n�o existe.");
			}
		}
	)
	(
		'*' e = aritmetic_expression {
			$v *= $e.v;
		}
		|'/' e = aritmetic_expression {
			if($e.v == 0) {
				System.out.println("ERRO: Divis�o por 0.");
			} else {
				$v /= $e.v;
			}
		}
		|'+' e = aritmetic_expression {
			$v += $e.v;
		}
		|'-' e = aritmetic_expression {
			$v -= $e.v;
		}
	)?
	|	'(' e = aritmetic_expression {$v = $e.v;} ')'
	;

// condicionais
condition
	: IF
	e = relational_expression {
		res_ae = $e.v;
	}
	THEN
	program {
		if(res_ae == 1) {
			res_ae = 0.0;
		} else {
			res_ae = 1.0;
		}
	} 
	(
		ELSE
		// em caso de uma 
		program
	)? {
		res_ae = 1.0;
	}
;

// loops
iteration
	: WHILE 
	e = relational_expression {
		res_ae = $e.v;
	}
	DO 
	program {
		res_ae = 1.0;
	}
;

// relacionais
relational_expression returns [ double v ]
	: 
	e = aritmetic_expression {
		res_ae = $e.v;
	}
	RELATIONAL_OP 
	e = aritmetic_expression {
		$v = $e.v; 
		
		if(rel_op.equals("=") && res_ae == $v) {
			$v = 1;
		} else if(rel_op.equals("<>") && res_ae != $v) {
			$v = 1;
		} else if(rel_op.equals("<") && res_ae < $v) {
			$v = 1;
		} else if(rel_op.equals(">") && res_ae > $v) {
			$v = 1;
		} else if(rel_op.equals("<") && res_ae <= $v) {
			$v = 1;
		} else if(rel_op.equals(">=") && res_ae >= $v) {
			$v = 1;
		} else {
			$v = 0;
		}		
	}
	;

// define os tokens para as palavras reservadas de condicional e loop
IF	: 'if' ; 		// if
THEN 	: 'then' ; 	// then
ELSE	: 'else' ; 	// else
WHILE	: 'while' ; // while
DO	: 'do' ; 		// do

// operadores relacionais
RELATIONAL_OP
	: '=' 			// igual
	| '<>' 			// diferente
	| '<' 			// menor que
	| '>' 			// maior que
	| '<=' 			// menor ou igual que
	| '>='			// maior ou igual que
	;

// atribuição
ASSIGNMENT_OP
	:	':=' ;

// ponto e vírgula, define o final de um comando
SEMICOLON
	: ';' ;

// constante numérica
CONST 	: ('0'..'9')+ ;

// variável
VAR  	: ('a'..'z'|'A'..'Z')+ ;

// ignora espaços em branco, quebra de linha e tabulação
WS  	: (' '		// espaço 
        | '\t'		// tab
        | '\r'		// return
        | '\n'		// nova linha
        ) { skip(); }
;
