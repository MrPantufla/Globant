Algoritmo sin_titulo
	Definir palabra Como Caracter
	Definir band Como Logico
	band=falso
	
	
	Mientras band==falso Hacer
		leer palabra
		Si Longitud(palabra)>3 Entonces
			Escribir "Ingrese un numero de HASTA 3 digitos"
		SiNo
			band=Verdadero
		FinSi
	FinMientras
	
	Escribir convertirAEntero(palabra)
FinAlgoritmo

Funcion retorno <- convertirAEntero(char)
	Definir retorno Como Entero
	retorno=ConvertirANumero(char)
FinFuncion
	