Algoritmo sin_titulo
	
	convertir()
	
FinAlgoritmo

Subproceso convertir()
	Definir char, string Como Caracter
	string=""
	char="a"
	Mientras char <> "." Hacer
		leer char
		char=Minusculas(char)
		Segun char Hacer
			"a":
				string=Concatenar(string, "@")
			"e":
				string=Concatenar(string, "#")
			"i":
				string=Concatenar(string, "$")
			"o":
				string=Concatenar(string, "%")
			"u":
				string=Concatenar(string, "*")
			De Otro Modo:
				string=Concatenar(string,char)
		Fin Segun
	FinMientras
	
	Escribir string
FinSubProceso
	