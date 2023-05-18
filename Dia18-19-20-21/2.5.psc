Algoritmo sin_titulo
	Definir vector, char, aux, string Como Caracter
	Definir i, pos, cercano, posicionCercana Como Entero
	Dimension vector[20]
	cercano=19
	posicionCercana=19
	
	Escribir "Ingresar una frase"
	leer string
	Para i=0 Hasta 19 Con paso 1 Hacer
		vector[i]=Subcadena(string,i,i)
	FinPara
	
	Escribir "Ingresar caracter a meter en el arreglo"
	leer char
	Escribir "Ingresar la posicion"
	leer pos
	
	Si vector[pos]==" " O vector[pos]=="" Entonces
		vector[pos]=char
	Sino
		Para i=0 Hasta 19 Con paso 1 Hacer
			Si (vector[i]==" " O vector[i]=="") Y (ABS(pos-i)<cercano) Entonces
				cercano=pos-i
				posicionCercana=i
			FinSi
		FinPara
		
		Si posicionCercana<pos Entonces
			Para i=0 Hasta pos Con paso 1 Hacer
				vector[i]=vector[i+1]
			FinPara
		SiNo
			Para i=19 Hasta pos Con Paso -1 Hacer
				vector[i]=vector[i-1]
			FinPara
		FinSi
		
		vector[pos]=char
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
