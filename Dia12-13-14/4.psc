Algoritmo sin_titulo
	Definir word, char Como Caracter
	leer word, char
	
	Escribir letraEncontrada(word, char)
FinAlgoritmo

Funcion retorno <- letraEncontrada (palabra, letra)
	Definir retorno,i Como Entero
	retorno=0
	Para i=0 Hasta (Longitud(palabra)-1) Con Paso 1 Hacer
		Si letra==Subcadena(palabra,i,i) Entonces
			retorno=retorno+1
		FinSi
	Fin Para
FinFuncion
	