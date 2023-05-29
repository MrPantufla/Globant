Algoritmo sin_titulo
	
	Escribir login()
	
FinAlgoritmo

Funcion retorno <- login()
	Definir retorno, band Como Logico
	Definir user, password Como Caracter
	Definir count, i Como Entero
	retorno=falso
	
	Para i=0 Hasta 2 Con Paso 1 Hacer
		Escribir "Ingrese usuario"
		leer user 
		Escribir "Ingrese contraseña"
		leer password
		Si user=="usuario1" Y password=="asdasd" Entonces
			retorno=Verdadero
			i=2
		FinSi
	FinPara
FinFuncion
