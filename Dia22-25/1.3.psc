Algoritmo sin_titulo
	Definir matriz, f, c, i ,j Como Entero
	
	Escribir "Ingresar filas y columnas de la matriz"
	leer f,c
	Dimension matriz[f,c]
	
	llenarmatriz(matriz, f-1, c-1)
	suma(matriz, f-1, c-1)
	
FinAlgoritmo

SubProceso llenarmatriz(matriz, f, c)
	Definir i, j Como Entero
	
	Para i=0 Hasta f Hacer
		Para j=0 Hasta c Hacer
			matriz[i,j]=Aleatorio(1,10)
		FinPara
	FinPara
FinSubProceso

Subproceso suma (matriz, f, c)
	Definir i, j, sum Como Entero
	sum=0
	
	Para i=0 Hasta f Hacer
		Para j=0 Hasta c Hacer
			sum=sum+matriz[i,j]
			Escribir sin saltar matriz[i,j] " "
		FinPara
		Escribir ""
	FinPara
	
	Escribir "La suma de todos los elementos de la matriz es: " sum
FinSubProceso
	