Algoritmo sin_titulo
	Definir matriz, vector, i, j, multiplicacion Como Entero
	Dimension matriz[3,3]
	Dimension vector[3]
	Dimension multiplicacion[3]
	
	Para i=0 Hasta 2 Hacer
		vector[i]=Aleatorio(1,10)
		multiplicacion[i]=0
		Para j=0 Hasta 2 Hacer
			matriz[i,j]=Aleatorio(1,10)
		FinPara
	FinPara
	
	
	Escribir "Matriz:"
	Para i=0 Hasta 2 Hacer
		Para j=0 Hasta 2 Hacer
			Escribir Sin Saltar matriz[i,j] " "
		FinPara
		Escribir ""
	FinPara
	
	Escribir ""
	Escribir "Vector:"
	Para i=0 Hasta 2 Hacer
		Escribir sin saltar vector[i] " "
	FinPara
	
	Escribir ""
	Escribir ""
	
	Para i=0 Hasta 2 Hacer
		Para j=0 Hasta 2 Hacer
			multiplicacion[i]=multiplicacion[i]+matriz[i,j]*vector[j]
		FinPara
	FinPara
	
	Escribir "Multiplicacion:"
	Para i=0 Hasta 2 Hacer
		Escribir sin saltar multiplicacion[i] " "
	FinPara
FinAlgoritmo
