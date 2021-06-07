Algoritmo pseudocodigoEjercicio9
	Definir  t1, t2 , PromedioT, promedioT1, promedioT2 Como Real
	Hacer
		Escribir "Ingrese la temperatura T1";
		Leer t1;
		Escribir "Ingrese la temperatura T2";
		Leer t2;
		Si 5<=t1 y t1<=15 
			temp1=temp1+1
			t1T=t1T+t1
		FinSi
		Si 5<=t2 y t2<=15 Entonces
			temp2=temp2+1
			t2T=t2T+t2
		FinSi
	Hasta Que t1=0;
	promedioT1=t1T/temp1;
	promedioT2=t2T/temp2;
	PromedioT=(promedioT1+promedioT2)/2;
	Escribir "t1",temp1
	Escribir "t2",temp2
	Escribir "El promedio de lolas temperaturas que estan entre 5 y 15 es ",PromedioT;
FinAlgoritmo
