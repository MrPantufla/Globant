Algoritmo sin_titulo
	Definir arr Como Real
	Dimension arr[10]
	Definir i, suma, resta, mul Como Entero
	suma=0
	resta=0
	mul=1
	
	Para i=0 Hasta 9 Con Paso 1 Hacer
		leer arr[i]
		suma=suma+arr[i]
		resta=resta-arr[i]
		mul=mul*arr[i]
	FinPara
	
	Escribir "La suma es: " suma
	Escribir "La resta es: " resta
	Escribir "La multiplicacion es: " mul
	
FinAlgoritmo
