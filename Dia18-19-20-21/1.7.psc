Algoritmo sin_titulo
	Definir arregloa, arreglob, n Como Entero
	
	Escribir "Ingrese el tamaño de los arreglos"
	leer n
	Dimension arregloa[n]
	Dimension arreglob[n]
	
	llenar(arregloa, arreglob, n)
	Escribir buscar(arregloa, arreglob, n)
	
FinAlgoritmo

SubProceso llenar(arregloA Por Referencia, arregloB Por Referencia, n)
	Definir i Como Entero
	
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		arregloA[i]=Aleatorio(1,10)
		arregloB[i]=Aleatorio(1,10)
	FinPara
FinSubProceso

Funcion retorno<-buscar(arregloA, arregloB, n)
	Definir retorno Como Logico
	Definir i Como Entero
	retorno=verdadero
	
	Para i=0 Hasta n-1 Con paso 1 Hacer
		Si arregloA[i]<>arregloB[i] Entonces
			retorno=falso
		FinSi
	FinPara
FinFuncion
	