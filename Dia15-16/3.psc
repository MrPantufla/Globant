Algoritmo sin_titulo
	Definir dividendo, divisor Como Entero
	
	Escribir "Ingresar dividendo y divisor" 
	leer dividendo, divisor
	
	modulo(dividendo, divisor)
FinAlgoritmo

SubProceso modulo(dividendo, divisor)
	Definir i, aux Como Entero
	i=0
	aux=dividendo
	
	Mientras aux>=divisor Hacer
		aux=aux-divisor
		i=i+1
	FinMientras
	
	Escribir dividendo "/" divisor ": " i " restas realizadas y el resto es " aux
FinSubProceso
