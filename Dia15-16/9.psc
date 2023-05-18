Algoritmo sin_titulo
	Definir frase Como Caracter
	leer frase
	
	quitarVocal(frase)
FinAlgoritmo

Subproceso quitarVocal(frase)
	Definir i, countA, countE, countI, countO, countU Como Entero
	Definir aux Como Caracter
	countA=0
	countE=0
	countI=0
	countO=0
	countU=0
	
	Para i=0 Hasta Longitud(frase)-1 Con Paso 1 Hacer
		aux=Subcadena(frase,i,i)
		Segun aux Hacer
			"a" o "A":
				countA=countA+1
			"e" o "E":
				countE=countE+1
			"i" o "I":
				countI=countI+1
			"o" o "O":
				countO=countO+1
			"u" o "U":
				countU=countU+1
			De Otro Modo:
				
		Fin Segun
	FinPara
	
	Para i=0 Hasta Longitud(frase)-1 Con Paso 1 Hacer
		Si NO(countA>1 Y (Subcadena(frase,i,i)=="a" O Subcadena(frase,i,i)=="A")) Entonces
			Si NO(countE>1 Y (Subcadena(frase,i,i)=="e" O Subcadena(frase,i,i)=="E")) Entonces
				Si NO(counti>1 Y (Subcadena(frase,i,i)=="i" O Subcadena(frase,i,i)=="I")) Entonces
					Si NO(countO>1 Y (Subcadena(frase,i,i)=="o" O Subcadena(frase,i,i)=="O")) Entonces
						Si NO(countU>1 Y (Subcadena(frase,i,i)=="u" O Subcadena(frase,i,i)=="U")) Entonces
							Escribir sin saltar Subcadena(frase,i,i)
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	FinPara
FinSubProceso
	