Algoritmo sin_titulo
	Definir i, j, mayor, count, mayorDelDia, productoMayor Como Entero
	Definir matriz, diaproducto, nombreproducto Como caracter
	Dimension matriz[8,7]
	mayor=0
	
	Para i=0 Hasta 7 Hacer
		Para j=0 Hasta 6 Hacer
			matriz[i,j]=""
		FinPara
	FinPara
	
	Para i=0 Hasta 7 Hacer
		count=0
		Para j=0 Hasta 6 Hacer
			Si i==0 Entonces
				Segun j Hacer
					1:
						matriz[i,j]="Lunes"
					2:
						matriz[i,j]="Martes"
					3:
						matriz[i,j]="Miercoles"
					4:
						matriz[i,j]="Jueves"
					5:
						matriz[i,j]="Viernes"
					6:
						matriz[i,j]="Total producto"
					De Otro Modo:
				Fin Segun
			FinSi
			
			Si j==0 Entonces
				Segun i Hacer
					1:
						matriz[i,j]="Producto1"
					2:
						matriz[i,j]="Producto2"
					3:
						matriz[i,j]="Producto3"
					4:
						matriz[i,j]="Producto4"
					5:
						matriz[i,j]="Producto5"
					6:
						matriz[i,j]="Total semana"
					7:
						matriz[i,j]="Producto más vendido"
					De Otro Modo:
				Fin Segun
			FinSi
			
			Si j>0 Y i>0 Y j<6 Y i<6 Entonces
				matriz[i,j]=ConvertirATexto(Aleatorio(1,20))
				count=count+ConvertirANumero(matriz[i,j])
				matriz[i,6]=ConvertirATexto(count)
			FinSi
		FinPara
	FinPara
	
	Para j=0 Hasta 6 Hacer
		count=0
		mayorDelDia=0
		Para i=0 Hasta 7 Hacer
			Si j>0 Y i>0 Y j<7 Y i<6 Entonces
				count=count+ConvertirANumero(matriz[i,j])
				matriz[6,j]=ConvertirATexto(count)
				
				Si ConvertirANumero(matriz[i,j])>mayor Y j<6 Entonces
					mayor=ConvertirANumero(matriz[i,j])
					diaproducto=matriz[0,j]
					nombreproducto=matriz[i,0]
				FinSi
				
				Si ConvertirANumero(matriz[i,j])>mayorDelDia Y i<6 Entonces
					mayorDelDia=ConvertirANumero(matriz[i,j])
					matriz[7,j]=ConvertirATexto(i)
				FinSi
			FinSi
		FinPara
	FinPara
	
	Para i=0 Hasta 7 Hacer
		Para j=0 Hasta 6 Hacer
			Mientras Longitud(matriz[i,j])<22 Hacer
				matriz[i,j]=Concatenar(matriz[i,j]," ")
			FinMientras
		FinPara
	FinPara
	
	Para i=0 Hasta 7 Hacer
		Para j=0 Hasta 6 Hacer
			Escribir sin saltar matriz[i,j] " "
		FinPara
		Escribir ""
	FinPara
	Escribir "El producto más vendido de la semana es " nombreproducto ", el día " diaproducto " por una cantidad de " mayor
	
FinAlgoritmo
