Algoritmo sin_titulo
	Definir num Como Entero
	leer num
	
	Escribir digitosImpares(num)
FinAlgoritmo

Funcion retorno <- digitosImpares(num)
	Definir retorno Como Logico
	retorno=Verdadero
	
	Mientras num>0 Y retorno==Verdadero Hacer
		Si num%2==0 Entonces
			retorno=Falso
		FinSi
		num=TRUNC(num/10)
	FinMientras
	
FinFuncion
