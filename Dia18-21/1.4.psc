Algoritmo sin_titulo
	Definir vectora, vectorb, vectorc, n, enter Como Entero
	Definir llenoa, llenob, llenoc Como Logico
	llenoa=Falso
	llenob=Falso
	llenoc=Falso
	Definir opcion Como Caracter
	opcion="j"
	Escribir "Ingresar tamaño de los vectores"
	leer n
	Dimension vectora[n]
	Dimension vectorb[n]
	Dimension vectorc[n]
	Limpiar Pantalla
	
	Mientras opcion<>"F" y opcion<>"f" Hacer
		Limpiar Pantalla
		Escribir "Ingrese la letra correspondiente"
		Escribir "A: Llenar Vector A"
		Escribir "B: Llenar Vector B"
		Escribir "C: Llenar Vector C con la suma de los vectores A y B"
		Escribir "D: Llenar Vector C con la resta de los vectores B y A"
		Escribir "E: Mostrar un vector"
		Escribir "F: Salir"
		leer opcion
		opcion=Minusculas(opcion)
		
		Segun opcion Hacer
			"a":
				Limpiar Pantalla
				llenar(vectora, n, llenoa)
			"b":
				Limpiar Pantalla
				llenar(vectorb, n , llenob)
			"c":
				Limpiar Pantalla
				llenarSumaC(vectora, vectorb, vectorc, n, llenoc)
			"d":
				Limpiar Pantalla
				llenarRestaC(vectora, vectorb, vectorc, n, llenoc)
			"e":
				Limpiar Pantalla
				mostrarArreglo(n, vectora, vectorb, vectorc, llenoa, llenob, llenoc)
			"f":	
			De Otro Modo:
				Escribir "Opcion ingresada incorrecta"
		Fin Segun
		
		Si opcion<>"f" Entonces
			Escribir "Presione Enter para continuar"
			leer enter
		FinSi
	FinMientras
FinAlgoritmo

SubProceso llenar(arreglo Por Referencia, n, lleno Por Referencia)
	Definir i Como Entero
	
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		arreglo[i]=Aleatorio(-100,100)
	FinPara
	
	lleno=verdadero
	Escribir "Arreglo A llenado correctamente"
FinSubProceso

SubProceso llenarSumaC(vectora, vectorb, vectorc Por Referencia, n, llenoc Por Referencia)
	Definir i Como Entero
	
	Para i=0 Hasta n-1 Con paso 1 Hacer
		vectorc[i]=vectora[i]+vectorb[i]
	FinPara
	
	llenoc=Verdadero
FinSubProceso

SubProceso llenarRestaC(vectora, vectorb, vectorc Por Referencia, n, llenoc Por Referencia)
	Definir i Como Entero
	
	Para i=0 Hasta n-1 Con paso 1 Hacer
		vectorc[i]=vectora[i]-vectorb[i]
	FinPara
	
	llenoc=Verdadero
FinSubProceso

Subproceso mostrarArreglo(n, vectora, vectorb, vectorc, llenoa, llenob, llenoc)
	Definir i Como Entero
	Definir opcion Como Caracter
	Dimension vectorAuxiliar[n]
	
	Escribir "Ingresar que arreglo mostrar"
	leer opcion
	
	opcion=Minusculas(opcion)
	
	Segun opcion Hacer
		"a":
			Si llenoa==verdadero Entonces
				Para i=0 Hasta n-1 Con Paso 1 Hacer
					Escribir vectora[i]
				FinPara
			SiNo
				Escribir "El arreglo A se encuentra vacío"
			FinSi
		"b":
			Si llenob==verdadero Entonces
				Para i=0 Hasta n-1 Con Paso 1 Hacer
					Escribir vectorb[i]
				FinPara
			SiNo
				Escribir "El arreglo B se encuentra vacío"
			FinSi
		"c":
			Si llenoc==verdadero Entonces
				Para i=0 Hasta n-1 Con Paso 1 Hacer
					Escribir vectorc[i]
				FinPara
			SiNo
				Escribir "El arreglo C se encuentra vacío"
			FinSi
		De Otro Modo:
			Escribir "No existe el arreglo " opcion
	Fin Segun
	
FinSubProceso
