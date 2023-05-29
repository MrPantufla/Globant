Algoritmo sin_titulo
	Definir vector, i Como Entero
	Dimension vector[5]
	
	Para i=0 Hasta 4 Con paso 1 Hacer
		leer vector[i]
	FinPara
	
	Escribir "La diferencia entre el mayor y el menor es: " diferencia(vector)
FinAlgoritmo

Funcion retorno<-diferencia(vector)
	Definir retorno, mayor, menor, i Como Entero
	mayor=vector[0]
	menor=vector[0]
	
	Para i=0 Hasta 4 Con paso 1 Hacer
		Si vector[i]>mayor Entonces
			mayor=vector[i]
		FinSi
		
		Si vector[i]<menor Entonces
			menor=vector[i]
		FinSi
	FinPara
	
	retorno=mayor-menor
FinFuncion
	