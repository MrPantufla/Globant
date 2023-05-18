Algoritmo sin_titulo
	Definir matriz Como Entero
	Dimension matriz[3,3]
	
	rellenar(matriz)
	cout(matriz)
FinAlgoritmo

SubProceso rellenar(matriz)
	Definir i, j Como Entero
	
	Para i=0 Hasta 2 Hacer
		Para j=0 Hasta 2 Hacer
			matriz[i,j]=Aleatorio(1,10)
		FinPara
	FinPara
FinSubProceso

Subproceso cout(matriz)
	Definir i, j Como Entero
	
	Para i=0 Hasta 2 Hacer
		Para j=0 Hasta 2 Hacer
			Escribir sin saltar matriz[i,j] " "
		FinPara
		Escribir ""
	FinPara
FinSubProceso
	