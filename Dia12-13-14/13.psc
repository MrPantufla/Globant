Algoritmo sin_titulo
	Definir numOriginal como Entero
	leer numOriginal
	
	Escribir esCapicua(numOriginal)
FinAlgoritmo

Funcion retorno <- esCapicua (numOriginal)
	Definir retorno Como Logico
    Definir numReverso, aux Como Entero
	Definir modulo Como Entero
	aux=numOriginal
    retorno=Falso
    numReverso = 0
	
    Mientras aux > 0 Hacer
        numReverso = (numReverso * 10) + (aux % 10)
        aux = TRUNC(aux/10)
    Fin Mientras
	
    Si numReverso == numOriginal Entonces
        retorno=Verdadero
    Fin Si
FinFuncion


