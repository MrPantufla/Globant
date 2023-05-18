Algoritmo sin_titulo
	Definir max, min, dias, i Como Entero
	
	Escribir "Ingrese la cantidad de días"
	leer dias
	
	Para i=1 Hasta dias Con Paso 1 Hacer
		Escribir "Ingesar temperatura maxima y minima"
		leer max, min
		calcularMedia(max, min)
	FinPara
	
FinAlgoritmo

SubProceso calcularMedia(max, min)
	Escribir "La media es de " (max+min)/2
FinSubProceso
	