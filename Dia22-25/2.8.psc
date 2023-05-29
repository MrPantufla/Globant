Algoritmo sin_titulo
	Definir matriz Como Caracter
	Definir i, j, count, total Como Entero
	Definir finalizar Como Logico
	finalizar=verdadero
	Dimension matriz[5,6]
	total=0
	
	llenarMatriz(matriz, total)
	Mientras finalizar==verdadero Hacer
		menu(matriz, total, finalizar)
	FinMientras
	
FinAlgoritmo

SubProceso menu(matriz, total, finalizar Por Referencia)
	Definir key, zona, aux, nombre Como Caracter
	Definir indice, i, j, count Como Entero
	Definir band Como Logico
	band=falso
	count=0
	Limpiar Pantalla
	Escribir "Seleccione una opción"
	Escribir "1- Total de ventas de una zona"
	Escribir "2- Total de ventas de un vendedor"
	Escribir "3- Total de ventas de todos los representantes"
	Escribir "4- Salir"
	
	leer key
	
	Segun key Hacer
		"1":
			Limpiar Pantalla
			Escribir "Escribir el nombre de la zona"
			leer zona
			Limpiar Pantalla
			Para j=0 Hasta 5 Hacer
				Si zona==matriz[0,j] o zona==Minusculas(matriz[0,j]) Entonces
					band=Verdadero
					Para i=1 Hasta 4 Hacer
						count=count+ConvertirANumero(matriz[i,j])
					FinPara
					Escribir "El total vendido en zona " matriz[0,j] " es de: " count
				FinSi
			FinPara
			
			Si band==falso Entonces
				Escribir "Zona ingresada incorrecta. Volviendo al menu..."
			FinSi
			
			Escribir ""
			Escribir "Presione enter para continuar"
			leer aux
			
		"2":
			Limpiar Pantalla
			Escribir "Ingrese un nombre: Ricardo-Juan-Joao-Pablo"
			leer nombre
			Limpiar Pantalla
			Para i=0 Hasta 4 Hacer
				Si nombre==matriz[i,0] o nombre==Minusculas(matriz[i,0]) Entonces
					band=Verdadero
					Para j=1 Hasta 5 Hacer
						Escribir "Zona " matriz[0,j] ": " matriz[i,j]
					FinPara
				FinSi
			FinPara
			
			Si band==falso Entonces
				Escribir "Nombre ingresado incorrecto. Volviendo al menu..."
			FinSi
			
			Escribir ""
			Escribir "Presione enter para continuar"
			leer aux
		"3":
			Escribir "El total de ventas de todos los representantes es: " total
			Escribir ""
			Escribir "Presione enter para continuar"
			leer aux
		"4":
			Finalizar=falso
		De Otro Modo:
	Fin Segun
FinSubProceso

Subproceso llenarMatriz(matriz, total Por Referencia)
	Definir i,j Como Entero
	Para i=0 Hasta 4 Hacer
		Para j=0 Hasta 5 Hacer
			matriz[i,j]=""
		FinPara
	FinPara
	
	Para i=0 Hasta 4 Hacer
		Para j=0 Hasta 5 Hacer
			Si i==0 Entonces
				Segun j Hacer
					1:
						matriz[i,j]="Norte"
					2:
						matriz[i,j]="Sur"
					3:
						matriz[i,j]="Este"
					4:
						matriz[i,j]="Oeste"
					5:
						matriz[i,j]="Centro"
					De Otro Modo:
				Fin Segun
			FinSi
			
			Si j==0 Entonces
				Segun i Hacer
					1:
						matriz[i,j]="Juan"
					2:
						matriz[i,j]="Ricardo"
					3:
						matriz[i,j]="Joao"
					4:
						matriz[i,j]="Pablo"
					De Otro Modo:
				Fin Segun
			FinSi
			
			Si j>0 Y i>0 Entonces
				matriz[i,j]=ConvertirATexto(aleatorio(1,5))
				total=total+ConvertirANumero(matriz[i,j])
			FinSi
		FinPara
	FinPara
FinSubProceso
