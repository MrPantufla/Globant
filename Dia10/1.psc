Algoritmo sin_titulo
	Definir n, sueldo, ventas, cobro, comision, i Como Entero
	Escribir "Ingresar n de vendedores"
	leer n
	
	Para i=1 Hasta n Con Paso 1 Hacer
		Escribir "DATOS DEL VENDEDOR" i
		Escribir "Ingresar sueldo"
		leer sueldo
		Escribir "Ingresar cant ventas"
		leer ventas
		Escribir "Ingresar cobro por venta"
		leer cobro
		comision=ventas*cobro*0.1
		Escribir "El extra por comisión es: " comision
		Escribir "El total a pagar es: " sueldo+comision
		Escribir ""
	FinPara
FinAlgoritmo
