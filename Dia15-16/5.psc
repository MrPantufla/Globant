Algoritmo sin_titulo
	Definir string Como Caracter
	leer string
	
	espaciado(string)
FinAlgoritmo

SubProceso espaciado(str)
	Definir i Como Entero
	Definir aux Como Caracter
	aux=""
	
	Para i=0 Hasta Longitud(str)-1 Con Paso 1 Hacer
		aux=Concatenar(aux,Subcadena(str,i,i))
		aux=Concatenar(aux," ")
	FinPara
	
	Escribir aux
FinSubProceso
