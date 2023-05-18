Algoritmo sin_titulo
	Definir matriz, vector Como Caracter
	Definir fila, columna, i Como Entero
	fila=9
	columna=12
	dimension matriz[fila, columna], vector[fila]
	vector[0]="Vector"
	vector[1]="Matrix"
	vector[2]="Programa"
	vector[3]="Subprograma"
	vector[4]="Subproceso"
	vector[5]="Variable"
	vector[6]="Entero"
	vector[7]="Para"
	vector[8]="Mientras"
	
	
	inicializarMatriz(matriz, fila, columna)
	
	
	Para i=0 Hasta fila-1 Hacer
		agregarPalabra(matriz, i, vector[i])
	FinPara
	
	imprimirMatriz(matriz, fila, columna)
	acomodarPalabra(matriz, fila, columna)
	Escribir ""
	imprimirMatriz(matriz, fila, columna)
	
FinAlgoritmo

SubProceso inicializarMatriz(matriz, fila, columna)
	Definir i, j Como Entero
	Para i=0 Hasta fila-1 Hacer
		Para j=0 Hasta columna-1 Hacer
			matriz[i,j]="*"
		FinPara
	FinPara
FinSubProceso

SubProceso imprimirMatriz(matriz, fila, columna)
	Definir i, j Como Entero
	Para i=0 Hasta fila-1 Hacer
		Para j=0 Hasta columna-1 Hacer
			Escribir sin saltar matriz[i,j] " "
		FinPara
		Escribir ""
	FinPara
FinSubProceso

Subproceso agregarPalabra(matriz, fila, palabra)
	Definir j Como Entero
	Para j=0 Hasta Longitud(palabra)-1 Hacer
		matriz[fila,j]=Mayusculas(Subcadena(palabra,j,j))
	FinPara
FinSubProceso

Funcion retorno<-buscarR(matriz, fila)
	Definir i, retorno Como Entero
	Definir band Como Logico
	i=0
	band=Falso
	
	Mientras band==Falso Hacer
		Si matriz[fila, i]=="R" Entonces
			band=Verdadero
			retorno=i
		FinSi
		i=i+1
	FinMientras
FinFuncion

SubProceso acomodarPalabra(matriz, fila, columna)
	Definir i, j Como Entero
	Definir pos Como Entero
	Para i=0 Hasta fila-1 Hacer
		pos=5-buscarR(matriz, i)
		Para j=columna-1 Hasta 0 Con Paso -1 Hacer
			Si j-pos>=0 Entonces
				matriz[i,j]=matriz[i,j-pos]
			SiNo
				matriz[i,j]="*"
			FinSi
		FinPara
	FinPara
FinSubProceso

