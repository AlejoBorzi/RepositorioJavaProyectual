package Proyecto;

import java.util.Scanner;

public class Ejercicio9 {

	// Ejercicio 9, 10 y 11
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese varios numeros enteros, y un numero negativo para finalizar");
		
		long acumulador = 0;
		int maximo = 0;
		int numA;
		int minimo;
		
						
		numA = sc.nextInt();
		
		minimo = numA;
		
		while (numA >= 0)
		{
			
			acumulador = acumulador + numA;
			
			if (numA > maximo)
			{
				maximo = numA;
			}
			
					
			if (numA < minimo)
			{
				minimo = numA;
			}
			
			numA = sc.nextInt();
		}
		
		System.out.println("La suma es: " + acumulador);
		System.out.println("El maximo es: " + maximo);
		System.out.println("El minimo es: " + minimo);
		}
		
	

}

	

// Metodo con "do"
//		do
//		{	
//			numA = sc.nextInt();
//			if(numA >0)
//			{
//			acumulador = acumulador + numA;
//			}
//		} while (numA >= 0);
//			
//			System.out.println("La suma es: " + acumulador);
//		
		

