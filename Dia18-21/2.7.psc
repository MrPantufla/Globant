Algoritmo sin_titulo
	Definir vector, i Como Entero
	Dimension vector[4]
	Para i=0 Hasta 3 Con paso 1 Hacer
		leer vector[i]
	FinPara
	
	Escribir "El producto de los elementos del arreglo es: " producto(vector)
FinAlgoritmo

Funcion retorno<-producto(vector)
	Definir retorno, i, count Como entero
	retorno=1
	
	Para i=0 Hasta 3 Con paso 1 Hacer
		retorno=retorno*vector[i]
	FinPara
	
FinFuncion
	