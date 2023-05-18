Algoritmo sin_titulo
	Definir matriz1, matriz2 Como Entero
	Dimension matriz1[3,3]
	Dimension matriz2[3,3]
	
	rellenarMatriz(matriz1)
	rellenarMatriz(matriz2)
	mostrarMatriz(matriz1)
	mostrarMatriz(matriz2)
	multiplicarMatrices(matriz1, matriz2)
	
FinAlgoritmo

Subproceso rellenarMatriz(matriz)
	Definir i, j Como Entero
	
	Para i=0 Hasta 2 Hacer
		Para j=0 Hasta 2 Hacer
			matriz[i,j]=Aleatorio(1,10)
		FinPara
	FinPara 
	
FinSubProceso

Subproceso mostrarMatriz(matriz)
	Definir i, j Como Entero
	
	Para i=0 Hasta 2 Hacer
		Para j=0 Hasta 2 Hacer
			Escribir sin saltar matriz[i,j] " "
		FinPara
		Escribir ""
	FinPara
 	Escribir "------"
	
FinSubProceso

Subproceso multiplicarMatrices(matriz1, matriz2)
	Definir i,j,k, matriz3 Como Entero
	Dimension matriz3[3,3]
	
	Para i=0 Hasta 2 Hacer
		Para j=0 Hasta 2 Hacer
			matriz3[i,j]=0
		FinPara
	FinPara
	
	Para i=0 Hasta 2 Hacer
        Para j=0 Hasta 2 Hacer
            Para k=0 Hasta 2 Hacer
               matriz3[i,j] = matriz3[i,j] + matriz1[i,k] * matriz2[k,j]
            FinPara
        FinPara
    FinPara
	
	Para i=0 Hasta 2 Hacer
		Para j=0 Hasta 2 Hacer
			Escribir sin saltar matriz3[i,j] " "
		FinPara
		Escribir ""
	FinPara
FinSubproceso

	