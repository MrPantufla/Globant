Algoritmo sin_titulo
	Definir i, j, matriz, f, c Como Entero
	
	Escribir "Ingresar filas y columnas"
	leer f,c
	Dimension matriz[f,c]
	
	Para i=0 Hasta f-1 Hacer
		Para j=0 Hasta c-1 Hacer
			matriz[i,j]=Aleatorio(1,100)
		FinPara
	FinPara
	
	Escribir "MATRIZ INICIAL"
	Para i=0 Hasta f-1 Hacer
		Para j=0 Hasta c-1 Hacer
			Escribir sin saltar matriz[i,j] " "
		FinPara
		Escribir ""
	FinPara
	
	Escribir "MATRIZ TRASPUESTA"
	Para i=0 Hasta f-1 Hacer
		Para j=0 Hasta c-1 Hacer
			Escribir sin saltar matriz[j,i] " "
		FinPara
		Escribir ""
	FinPara
FinAlgoritmo
