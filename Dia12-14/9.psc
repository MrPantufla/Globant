Algoritmo sin_titulo
	Definir nombre, turno, dia, festivo Como Caracter
	Definir horas Como Entero
	
	Escribir "Ingrese nombre"
	leer nombre
	Escribir "Ingrese dia de la semana"
	leer dia
	Escribir "Ingrese horas trabajadas"
	leer horas
	Escribir "Diurno (D) o nocturno(N)?"
	leer turno
	Escribir "Festivo? (Y o N)"
	leer festivo
	
	Escribir "El cobro de " nombre " del día " dia " es de: " trabajo(turno, horas, festivo)
FinAlgoritmo

Funcion retorno <- trabajo (turno, horas, festivo)
	Definir retorno Como Entero
	retorno=0
	
	Si (turno=="D" O turno=="d") Entonces
		retorno=horas*90
		Si festivo=="Y" O festivo=="y" Entonces
			retorno=(retorno+(retorno*0.1))
		FinSi
	SiNo
		retorno=horas*125
		Si festivo=="Y" O festivo=="y" Entonces
			retorno=(retorno+(retorno*0.15))
		FinSi
	FinSi
FinFuncion
	