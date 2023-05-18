Algoritmo sin_titulo
	Definir vector, aux, n, i Como Entero
	Escribir "Ingresar tamaño del vector"
	leer n
	Dimension vector[n]
	
	Escribir ""
	Escribir "Ingresar los valores para llenar el vector" 
	Para i=0 Hasta n-1 Con paso 1 Hacer
		leer vector[i]
		
		Si i==0 Entonces
			aux=vector[i]
		FinSi
		
		Si vector[i]>aux Entonces
			aux=vector[i]
		FinSi
	FinPara
	
	Escribir "El valor más grande del vector es " aux
FinAlgoritmo
