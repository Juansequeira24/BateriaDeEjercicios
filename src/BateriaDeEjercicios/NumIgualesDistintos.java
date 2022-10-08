package BateriaDeEjercicios;

import java.util.Scanner;

public class NumIgualesDistintos {

	public static void main(String[] args) {
		
  try (Scanner lector = new Scanner(System.in)) {
	int  num1,num2,num3;

	
	System.out.println("Dime el numero 1:");
	num1=lector.nextInt();
	
	System.out.println("Dime el numero 2:");
	num2=lector.nextInt();
	
	
	
	
	if(num1<=num2 & num1>=num2) {

	    num3=num1+num2;
		System.out.println("Iguales");
		
	}else {
		System.out.println("Distintos");
	}
}
	

	}

}
