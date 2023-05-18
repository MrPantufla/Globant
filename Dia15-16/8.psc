Algoritmo sin_titulo
	Definir dia, mes, anio Como Entero
	leer dia, mes, anio
	
	diaAnterior(dia, mes, anio)
FinAlgoritmo

Subproceso diaAnterior(dia, mes, anio)
	Si dia==1 Entonces
		mes=mes-1
		dia=30
	SiNo
		Si mes==1 Entonces
			anio=anio-1
			mes=12
		FinSi
		dia=dia-1
	FinSi
	
	Escribir dia "/" mes "/" anio
FinSubProceso
	