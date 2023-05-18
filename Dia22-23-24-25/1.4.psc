Algoritmo sin_titulo
	Definir matriz Como Entero
	Dimension matriz[5,5]
	
	rellenar(matriz)
	cout(matriz)
FinAlgoritmo

SubProceso rellenar(matriz)
	Definir i, j Como Entero
	
	Para i=0 Hasta 4 Hacer
		Para j=0 Hasta 4 Hacer
			Si i<>j Entonces
				matriz[i,j]=Aleatorio(1,10)
			SiNo
				matriz[i,j]=0
			FinSi
		FinPara
	FinPara
FinSubProceso

SubProceso cout(matriz)
	Definir i, j Como Entero
	Para i=0 Hasta 4 Hacer
		Para j=0 Hasta 4 Hacer
			Escribir Sin Saltar matriz[i,j] " "
		FinPara
		Escribir ""
	FinPara
FinSubProceso
	