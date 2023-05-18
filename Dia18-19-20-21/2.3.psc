Algoritmo sin_titulo
	Definir vectora Como Caracter
	Definir n, i, vectorb Como Entero
	Escribir "Ingresar tamaño del vector"
	leer n
	Dimension vectora[n]
	Dimension vectorb[n]
	
	Escribir "Ingrese los datos a almacenar"
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		leer vectora[i]
		vectorb[i]=Longitud(vectora[i])
	FinPara
	
FinAlgoritmo
