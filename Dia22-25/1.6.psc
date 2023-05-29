Algoritmo sin_titulo
	Definir matriz, n, i, j, fila, columna, diagonal,diagonalInversa, suma Como Entero
	Definir band, nueve Como Logico
	band=verdadero
	nueve=verdadero
	suma=0
	
	Escribir "Ingresar tamaño de matriz"
	leer n 
	Dimension matriz[n,n]
	Dimension fila[n]
	Dimension columna[n]
	diagonal=0
	diagonalInversa=0
	
	Para i=0 Hasta n-1 Hacer
		fila[i]=0
		columna[i]=0
	FinPara
	
	Para i=0 Hasta n-1 Hacer
		Para j=0  Hasta n-1 Hacer
			leer matriz[i,j]
			
			fila[i]=fila[i]+matriz[i,j]
			columna[j]=columna[j]+matriz[i,j]
			
			Si i==j Entonces
				diagonal=diagonal+matriz[i,j]
			FinSi
			
			Si i+j==(n-1) Entonces
				diagonalInversa=diagonalInversa+matriz[i,j]
			FinSi
			
			Si matriz[i,j]>9 Entonces
				nueve=falso
			FinSi
		FinPara
	FinPara
	
	Si nueve==verdadero Entonces
		Para i=0 Hasta n-2 Hacer
			Si fila[i]<>fila[i+1] Entonces
				band=falso
				i=n-2
			FinSi
			
			Si columna[i]<>columna[i+1] Entonces
				band=falso
				i=n-2
			FinSi
		FinPara
		
		Si band==verdadero Entonces
			Si fila[0]<>columna[0] Entonces
				band=falso
				Si band==Verdadero
					Si diagonal<>fila[0] Entonces
						band=falso
						Si band==Verdadero Entonces
							Si diagonal<>diagonalInversa Entonces
								band=falso
							FinSi
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
		
		Si band=Verdadero Entonces
			Escribir "La suma es: " diagonal
		SiNo
			Escribir "No se trata de una matriz magica"
		FinSi
	SiNo
		Escribir "Existe un valor incorrecto en la matriz"
	FinSi
	
FinAlgoritmo
