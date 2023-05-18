Algoritmo sin_titulo
	Definir usuario, contrasenia, confirmacion Como Caracter
	Definir login Como Logico
	Definir i, opciones, saldo, botellas, b, al, count Como Entero
	login=falso
	saldo=0
	
	Limpiar Pantalla
	Escribir "Ingrese el usuario"
	leer usuario
	
	Si usuario=="Albus_D" Entonces
		Limpiar Pantalla
		Escribir "Ingrese la contraseña"
		Para i=0 Hasta 2 Con Paso 1 Hacer
			leer contrasenia
			Limpiar Pantalla
			Si contrasenia=="caramelosDeLimon" Entonces
				Login=verdadero
				i=2
			SiNo
				Si i==2 Entonces
					Escribir "Excedido el número de intentos. Finalizando el programa..."
				Sino 
					Escribir "La contraseña es incorrecta, ingresarla otra vez"
				FinSi
			FinSi
		Fin Para
	SiNo
		Escribir "El usuario ingrsado no existe"
	FinSi
	
	Mientras login==verdadero Hacer
		Limpiar Pantalla
		Escribir "Seleccione una opción:"
		Escribir "1- Ingresar botellas"
		Escribir "2- Consultar saldo"
		Escribir "3- Salir"
		
		leer opciones
		
		Segun opciones Hacer
			1:
				count=0
				Limpiar Pantalla
				Escribir "Ingresar cuantas botellas desea ingresar al sistema"
				
				leer botellas
				Para b=0 Hasta botellas-1 Con Paso 1 Hacer
					al=ALEATORIO(100,3000)
					
					Si al<500 Entonces
						count=count+50
					Sino
						Si al>500 Y al<1500 Entonces
							count=count+125
						Sino
							count=count+200
						Fin Si
					Fin Si
				Fin Para
				
				Limpiar Pantalla
				
				Escribir "El valor ofrecido por las botellas es: " count "$. Aceptas? Responder Y o N"
				leer confirmacion
				Limpiar Pantalla
				Si confirmacion=="Y" O confirmacion=="y" Entonces
					saldo=saldo+count
				SiNo
					Escribir "Devolviendo material"
					leer opciones
				FinSi
			2:
				Limpiar Pantalla
				Escribir "El saldo almacenado en la cuenta es: " saldo
				leer opciones
			3:
				Limpiar Pantalla
				login=falso
			De Otro Modo:
				Escribir "Numero ingresado incorrecto, volviendo al menu principal..."
		Fin Segun
	FinMientras
FinAlgoritmo
