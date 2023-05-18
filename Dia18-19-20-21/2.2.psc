Algoritmo sin_titulo
	Definir n, vector, i, suma Como Entero
	Escribir "Ingresar tamaño del vector" 
	leer n
	Dimension vector[n]
	suma=0
	
	Escribir "Ingresar valores para el vector"
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		leer vector[i]
		suma=suma+vector[i]
	FinPara
	
	Escribir "El promedio es: " suma/i
FinAlgoritmo
