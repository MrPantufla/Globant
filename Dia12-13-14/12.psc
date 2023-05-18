Algoritmo sin_titulo
	Definir num Como Entero
	leer num
	
	Escribir fibonacci(num)
	
FinAlgoritmo

Funcion retorno <- fibonacci(num)
	Definir retorno, aux1, aux2, auxExtra, i Como Entero
	aux1=1
	aux2=1
	Si num==1 O num==2 Entonces
		retorno=1
	SiNo
		Para i=3 Hasta num Con Paso 1 Hacer
			retorno=aux1+aux2
			aux1=aux2
			aux2=retorno
		FinPara
	FinSi
FinFuncion
	