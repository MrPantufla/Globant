Algoritmo sin_titulo
	Definir matriz, i, j, n, aux, aux2 Como Entero
	Definir band Como Logico
	band=falso
	Dimension matriz[5,5]
	
	Para i=0 Hasta 4 Hacer
		Para j=0 Hasta 4 Hacer
			matriz[i,j]=Aleatorio(1,10)
		FinPara
	FinPara
	
	Escribir "Ingresar numero a buscar" 
	leer n
	
	Para i=0 Hasta 4 Hacer
		Para j=0 Hasta 4 Hacer
			Si matriz[i,j]==n Entonces
				aux=i
				aux2=j
				i=4
				j=4
				band=verdadero
			FinSi
		FinPara
	FinPara
	
	Si band==verdadero Entonces
		Escribir "El numero " n " se encuentra en las coordenadas " aux "," aux2
	SiNo
		Escribir "El numero ingresado no se encuentra en la matriz"
	FinSi
FinAlgoritmo
