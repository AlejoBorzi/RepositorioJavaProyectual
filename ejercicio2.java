package Proyecto;

import java.util.Scanner;

public class ejercicio2 {

	//Ejercicio2
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int numA, numB;
		
		System.out.println("Ingrese un número entero: ");
		
		numA = sc.nextInt();
		System.out.println("Ingrese un otro número entero: ");
		numB = sc.nextInt();
		
		if (numA > numB){ 
			System.out.println("numA es mayor con " + numA);
		}
		if (numA < numB){
			System.out.println("numB es mayor con " + numB);
		}	
		if (numA == numB){
			System.out.println("numA y numB son iguales con " + numA);
		}	
		sc.close();
		}
	}




