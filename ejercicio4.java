package Proyecto;

import java.util.Scanner;

public class ejercicio4 {
	
	//Ejercicio4 falta completar

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int nota1, nota2, nota3;
		
				
		System.out.println("Ingrese primer nota: ");
		nota1 = sc.nextInt();
		
		System.out.println("Ingrese segunda nota: ");
		nota2 = sc.nextInt();
		
		System.out.println("Ingrese tercer nota: ");
		nota3 = sc.nextInt();
		
		int resultado = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("El promedio del alumno es: " + resultado);
		
		sc.close();
		}

	}
