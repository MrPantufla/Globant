Algoritmo sin_titulo
	Definir numero Como Entero
	leer numero
	
	Escribir sumaDeDivisores(numero)
FinAlgoritmo

Funcion retorno <- sumaDeDivisores (num)
	Definir retorno, i Como Entero
	retorno=0
	Para i=1 Hasta num-1 Con Paso 1 Hacer
		Si (num%i==0) Entonces
			retorno=retorno+i
		FinSi
	FinPara
FinFuncion
	