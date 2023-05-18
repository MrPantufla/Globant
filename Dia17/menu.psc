Algoritmo DesafioGuia4
	menu()
FinAlgoritmo

SubProceso menu
	Definir accion Como Entero
	Definir teclaCualquiera Como Caracter
	
	Repetir
		/// Imprimir menu mientras accion sea distinto a 9
		Limpiar Pantalla
		Escribir "Seleccione una opción del menú"
		Escribir "1. Calcular muro de ladrillo"
		Escribir "2. Calcular viga de hormigón"
		Escribir "3. Calcular columnas de hormigón"
		Escribir "4. Calcular contrapisos"
		Escribir "5. Calcular techo"
		Escribir "6. Calcular pisos"
		Escribir "7. Calcular pintura"
		Escribir "8. Calcular iluminación"
		Escribir "9. Salir"
		Leer accion
		
		
		Segun accion Hacer
			1: calcularMuro()
			2: calcularViga()
			3: calcularColumna()
			4: calcularContrapisos()
			5: calcularTecho()
			6: calcularPisos()
			7: calcularPintura()
			8: calcularIluminacion()
			9: Escribir "Salir"
			De Otro Modo:
				Escribir "Opción no válida"
		Fin Segun
		
		Escribir "Presione Enter para continuar"
		Leer teclaCualquiera
	Mientras Que accion <> 9
	
FinSubProceso

Funcion superficie <- calcularSuperficie(a,b)
	Definir superficie Como Real
	superficie = a * b
FinFuncion


Funcion volumen <- calcularVolumen(a,b,c)
	Definir volumen Como Real
	volumen = a * b * c
FinFuncion


/// 1
SubProceso calcularMuro()
	Definir espesor, largo, alto, superficie, cemento, arena, ladrillos Como Real
	cemento = 0
	ladrillos = 0
	arena = 0
	Escribir "Selecciona el espesor del muro 20cm o 30cm" 
	Leer espesor
	Escribir "Ingresa el largo del muro"
	Leer largo
	Escribir "Ingresa el Alto del muro"
	Leer alto
	superficie = calcularSuperficie(largo,alto)
	Escribir "La superficie es: " superficie "m2"
	Escribir "Necesitaras los siguientes materiales: "
	
	Segun espesor Hacer
		20: 
			cemento = superficie * 10.9
			ladrillos = superficie * 90
			arena = superficie * 0.09
		30:
			cemento = superficie * 15.2
			ladrillos = superficie * 120
			arena = superficie * 0.115
		De Otro Modo:
			Escribir "Espesor no valido"
			calcularMuro()
	FinSegun
	
	Escribir cemento " Kgs de cemento"
	Escribir ladrillos " ladrillos"
	Escribir arena " m3 de arena"
	
FinSubProceso

/// 2
Funcion calcularViga ()
	Definir largo Como Real
	
	Escribir "Ingrese el largo (en metros) de la viga:"
	Leer largo
	
	Escribir ""
	Escribir "Para una viga de " largo " m, son necesarios:"
	Escribir " - " 9 * largo " kg de cemento"
	Escribir " - " 0.02 * largo " m3 de arena"
	Escribir " - " 0.02 * largo " m3 de piedra"
	Escribir " - " 4 * largo " m de hierro d = 8mm"
	Escribir " - " 3 * largo " m de hierro d = 4mm"
	Escribir ""
	
Fin Funcion

/// 3
SubProceso calcularColumna ()
	Definir largoColumna, cementoColumna, arenaColumna, piedraColumna, hierro10Columna, hierro4Columna Como Real
	
	Escribir "Ingrese el largo de la columna (en metros):"
	Leer largoColumna
	
	cementoColumna = 7.5 * largoColumna
	arenaColumna = 0.016 * largoColumna
	piedraColumna = 0.016 * largoColumna
	hierro10Columna = 6 * largoColumna
	hierro4Columna = 3 * largoColumna
	
	Escribir "Para la columna se necesitarán los siguientes materiales:"
	Escribir "Cemento: " cementoColumna " kg"
	Escribir "Arena: " arenaColumna " m3"
	Escribir "Piedra: " piedraColumna " m3"
	Escribir "Hierro del 10: " hierro10Columna " m"
	Escribir "Hierro del 4: " hierro4Columna " m"
	
FinSubProceso

/// 4
SubProceso calcularContrapisos()
	Definir espesor, ancho, largo, volumen Como Real
	Escribir  "Ingrese espesor, ancho y largo del contrapiso"
	Leer espesor, ancho, largo
	volumen = calcularVolumen(espesor,ancho,largo)
	Escribir "Cemento necesario: ", volumen * 105, " kgs"
	Escribir "Arena necesaria: ", volumen * 0,45, " m3"
	Escribir "Piedra necesaria: ", volumen * 0,9, " m3"
FinSubProceso

/// 5
SubProceso calcularTecho ()
	Definir area, espesorTecho, largoTecho, anchoTecho Como Real
	Escribir "Ingrese el espesor, largo y ancho del techo respectivamente"
	Leer espesorTecho, largoTecho, anchoTecho
	area = calcularSuperficie(largoTecho,anchoTecho)
	
	Escribir "Total de cemento a utilizar: ",33 * area, " Kg"
	Escribir "Total de arena a utilizar: ",0.072 * area," m3"
	Escribir "Total de piedra a utilizar: ",0.072 * area," m3"
	Escribir "Total de hierro del 8 a utilizar: ",7 * area," m"
	Escribir "Total de hierro del 6 a utilizar: ",4 * area," m"
FinSubProceso

/// 6 
SubProceso calcularPisos ()
	Definir ancho, largo Como Real
	Escribir "Ingrese el ancho"
	Leer ancho
	Escribir "Ingrese el largo"
	Leer largo
	Escribir "La superficie del piso es de " (ancho * largo) + ((ancho * largo) * 0.1) " m^2"
FinSubProceso

/// 7 
SubProceso calcularPintura()
	Definir superficie Como Real
	Escribir "Ingrese la superficie del muro: "
	Leer superficie
	
	Escribir "Se necesitan ", superficie / 6, " litros de pintura."
FinSubProceso

/// 8 
SubProceso calcularIluminacion ()
	Definir iluminacion, superficie, a, b Como Real
	Escribir "Ingresa alto y largo de la habitación"
	Leer a, b
	superficie = calcularSuperficie(a,b)
	iluminacion = superficie * 0.20	
	Escribir "La cantidad mínima de superficie de iluminación natural sería de ", iluminacion, "m2"
FinSubProceso