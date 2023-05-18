Algoritmo sin_titulo
	Definir num, i, count Como Entero
	leer num
	count=0
	
	Mientras num>0 Hacer
		num=Trunc(num/10)
		count=count+1
	FinMientras
	
	Escribir count
FinAlgoritmo
