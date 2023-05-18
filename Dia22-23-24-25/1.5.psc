Algoritmo sin_titulo
	Definir i, j Como Entero
	Definir palabra, matriz Como Caracter
	Dimension matriz[3,3]
	Escribir "Ingresar una palabra de 9 caracteres"
	leer palabra
	
	Para i=0 Hasta 2 Hacer
		Para j=0 Hasta 2 Hacer
			matriz[i,j]=Subcadena(palabra,(i*3)+j,(i*3)+j)
		FinPara
	FinPara
	
	Para i=0 Hasta 2 Hacer
		Para j=0 Hasta 2 Hacer
			Escribir sin saltar matriz[i,j] " "
		FinPara
		Escribir ""
	FinPara
FinAlgoritmo
