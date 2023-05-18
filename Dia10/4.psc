Algoritmo sin_titulo
	Definir i, j, k  Como Entero
	
	Para i=1 Hasta 5 Con Paso 1 Hacer
		
		k=1
		
		Si i>1 Entonces
			Escribir ""
		FinSi
		
		Escribir sin saltar "!" i " = "
		
		Para j=1 Hasta i Con paso 1 Hacer
			
			Escribir sin saltar j
			
			Si j<i Entonces
				Escribir sin saltar "*"
			FinSi
			
			k=k*j
			
		FinPara
		
		Escribir sin saltar " = " k
	FinPara
	Escribir ""
FinAlgoritmo
