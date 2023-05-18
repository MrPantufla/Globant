Algoritmo sin_titulo
	Definir a,b Como Entero
	leer a,b
	swap(a,b)

	Escribir "El nro 1 ahora es " a " y el nro 2 ahora es "
FinAlgoritmo

Subproceso swap(n1 Por Referencia, n2 Por Referencia)
	Definir aux Como Entero
	aux=n1
	n1=n2
	n2=aux
FinSubProceso
	