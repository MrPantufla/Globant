Algoritmo sin_titulo
	Definir n, arr, i, buscar Como Entero
	Definir band  Como Logico
	band=Falso
	
	Escribir "Ingresar tama�o del arreglo" 
	leer n
	Dimension arr[n]
	
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		leer arr[i]
	FinPara
	
	Escribir "Ingrese un numero a buscar"
	leer buscar 
	
	Para i=0 Hasta n-1 Con paso 1 Hacer
		Si buscar==arr[i] Entonces
			Escribir "El numero " buscar " se encuentra en la posici�n " i
			band=Verdadero
		FinSi
	FinPara
	
	Si band==Falso Entonces
		Escribir "El numero " buscar " no se encuentra en el arreglo"
	FinSi
	
FinAlgoritmo
