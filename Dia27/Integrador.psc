Algoritmo sin_titulo
	Definir n, i Como Entero
	Definir band Como Logico
	band=verdadero
	Definir muestra, matriz, diagonal_p, diagonal_i Como Caracter
	
	muestra="BCAADCCBABCCBABB"
	Escribir Longitud(muestra)
	Para i=0 Hasta Longitud(muestra)-1 Hacer
		Si Subcadena(muestra, i, i)<>"A" Y Subcadena(muestra, i, i)<>"B" Y Subcadena(muestra, i, i)<>"C" Y Subcadena(muestra, i, i)<>"D" Entonces
			band=falso
		FinSi
	FinPara
	
	Si band==Verdadero Entonces
		Si Longitud(muestra)==9 Entonces
		n=3
		SiNo
			Si Longitud(muestra)==16
				n=4
			SiNo
				n=37
			FinSi
		FinSi
		
		dimension matriz[n,n], diagonal_p[n], diagonal_i[n]
		
		llenarMatriz(matriz, n, diagonal_i, diagonal_p, muestra)
		Escribir validarMuestra(diagonal_i, diagonal_p, n)
		mostrarMatriz(matriz, n)
	Sino
		Escribir "Muestra incorrecta"
	FinSi
	
FinAlgoritmo

SubProceso llenarMatriz(matriz, n, diagonal_i, diagonal_p, muestra)
	Definir i, j, count Como Entero
	count=0
	Para i=0 Hasta n-1 Hacer
		Para j=0 Hasta n-1 Hacer
			matriz[i,j]=Subcadena(muestra,count,count)
			count=count+1
			Si i==j Entonces
				diagonal_p[i]=matriz[i,j]
			FinSi
			
			Si (i+j)==n-1 Entonces
				diagonal_i[i]=matriz[i,j]
			FinSi
		FinPara
	FinPara
FinSubProceso

Funcion retorno<-validarMuestra(diagonal_i, diagonal_p, n)
	Definir i Como Entero
	Definir band_p, band_i, retorno Como Logico
	band_p = Verdadero
	band_i = Verdadero
	Para i=0 Hasta n-2 Hacer
		Si diagonal_p[i]<>diagonal_p[i+1] Entonces
			band_p=Falso
		FinSi
		
		Si diagonal_i[i]<>diagonal_i[i+1] Entonces
			band_i=Falso
		FinSi
	FinPara
	
	Si band_i==Verdadero Y band_p==Verdadero Entonces
		retorno=Verdadero
	SiNo
		retorno=Falso
	FinSi
FinSubProceso

Subproceso mostrarMatriz(matriz, n)
	Definir i, j Como Entero
	Escribir ""
	Para i=0 Hasta n-1 Hacer
		Para j=0 Hasta n-1 Hacer
			Escribir sin saltar matriz[i,j] " "
		FinPara
		Escribir ""
	FinPara
FinSubProceso
	