Algoritmo sin_titulo
	Definir n,i,j Como Entero
	leer n
	
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		Si i>0 Entonces
			Escribir ""
		FinSi
		Para j=0 Hasta n-1 Con Paso 1 Hacer
			Si i==0 O j==0 O i==n-1 O j==n-1 Entonces
				Escribir sin saltar "*"
			SiNo
				Escribir sin saltar " "
			FinSi
		Fin Para
	Fin Para
	Escribir ""
FinAlgoritmo
