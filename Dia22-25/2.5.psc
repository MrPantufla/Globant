Algoritmo sin_titulo
	Definir matriz, n, i, j Como Entero
	Escribir "Ingresar numero de columnas"
	leer n
	Dimension matriz[3,n]
	
	Para i=0 Hasta n-1 Hacer
		Escribir "Ingresar 2 valores"
		Para j=0 Hasta 2 Hacer
			Si j==0 O j==1 Entonces
				leer matriz[i,j]
			SiNo
				matriz[i,j]=matriz[i,j-1]+matriz[i,j-2]
			FinSi
		FinPara
	FinPara
	
	Para i=0 Hasta n-1 Hacer
		Para j=0 Hasta 2 Hacer
			Si j==0 Entonces
				Escribir sin saltar matriz[i,j] "+"
			SiNo
				Si j==1 Entonces
					Escribir sin saltar matriz[i,j] "="
				SiNo
					Escribir matriz[i,j]
				FinSi
			FinSi
		FinPara
	FinPara
	
FinAlgoritmo