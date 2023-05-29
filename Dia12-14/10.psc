Algoritmo sin_titulo
	Definir num Como Entero
	leer num
	
	Escribir "La suma es: " suma(num)
FinAlgoritmo

Funcion retorno <- suma(num)
	Definir retorno Como Entero
	retorno=0
	
	Mientras num>0 Hacer
		retorno=retorno+num%10
		num=TRUNC(num/10)
	FinMientras
FinFuncion

