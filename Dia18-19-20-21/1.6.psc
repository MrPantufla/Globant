Algoritmo sin_titulo
	Definir vector, char, string Como Caracter
	Definir i, pos Como Entero
	Dimension vector[20]
	
	Escribir "Ingresar una frase"
	leer string
	
	Para i=0 Hasta 19 Con paso 1 Hacer
		vector[i]=Subcadena(string,i,i)
	FinPara
	
	Escribir "Ingresar caracter a intentar meter en el arreglo"
	leer char
	Escribir "Ingresar la posicion"
	leer pos
	
	Si vector[pos]=="" o vector[pos]==" " Entonces
		vector[pos]=char
	SiNo
		Escribir "Esa posición no se encuentra vacía"
	FinSi
	
	Escribir "Resultado final: "
	
	Para i=0 Hasta 19 Con paso 1 Hacer
		Si vector[i]=="" Entonces
			Escribir sin saltar " "
		Sino
			Escribir sin saltar vector[i]
		FinSi
	FinPARA
FinAlgoritmo
