Algoritmo sin_titulo
	Definir numero Como Entero
	leer numero
	
	Escribir esPrimo(numero)
FinAlgoritmo

Funcion retorno <- esPrimo(num)
	Definir retorno Como Logico
	Definir i Como Entero
	retorno=Verdadero
	
	Para i=2 Hasta num-1 Con Paso 1 Hacer
		Si(num%i==0) Entonces
			retorno=Falso
		FinSi
	FinPara

FinFuncion
	