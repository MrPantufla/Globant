Algoritmo sin_titulo
	Definir matriz, i, j Como Entero
	Dimension matriz[5,15]
	
	Para i=0 Hasta 4 Hacer
		Para j=0 Hasta 14 Hacer
			Si (i==0 O i==4 O j==0 O J==14) Entonces
				matriz[i,j]=1
			SiNo
				matriz[i,j]=0
			FinSi
		FinPara
	FinPara
	
	Para i=0 Hasta 4 Hacer
		Para j=0 Hasta 14 Hacer
			Escribir sin saltar matriz[i,j] " "
		FinPara
		Escribir ""
	FinPara
FinAlgoritmo
