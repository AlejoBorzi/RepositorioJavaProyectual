package Proyecto;

import java.util.Scanner;

public class ejercicio1 {
	
	//Ejercicio1
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int numA, numB;
		
		System.out.println("Ingrese un n�mero entero: ");
		numA = sc.nextInt();
		
		System.out.println("Ingrese un otro n�mero entero: ");
		numB = sc.nextInt();
			
		int resultado = numA + numB;
			
		System.out.println("La suma es: " + resultado);
		resultado = numA - numB;
		System.out.println("La resta es: " + resultado);
		resultado = numA * numB;
		System.out.println("La multiplicacion es: " + resultado);
		resultado = numA / numB;
		System.out.println("La division es: " + resultado);
		
		sc.close();
		}	
	} 