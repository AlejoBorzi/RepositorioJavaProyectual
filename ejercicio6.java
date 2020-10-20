package Proyecto;

import java.util.Scanner;

public class ejercicio6 {
		
	//Ejercicio6 error en mes 2
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		short mes;
		
		System.out.println("Ingrese un mes");
		mes = (short) sc.nextInt();
			
		if ((mes < 1)|| (mes >12)){
			System.out.println("No es un mes valido, ingrese un numero entre 1 y 12");
		}
				
		if (mes == 2){
			System.out.println("El mes tiene 28 dias");
		}
		
		if ((mes == 4)||(mes == 6)||(mes == 9)||(mes == 11)){
			System.out.println("El mes tiene 30 dias");
		}
		
		else{
			System.out.println("El mes tiene 31 dias");
		}
		sc.close();
		}
	}
			