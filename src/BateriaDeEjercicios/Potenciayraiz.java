package BateriaDeEjercicios;
import java.util.*;
public class Potenciayraiz {

	public static void main(String[] args) {
    
  Scanner entrada = new Scanner(System.in);
      double num1=0;
      

      
      System.out.println("Introduzca su numero :");
      num1=entrada.nextInt();
      
      if(num1<0) {
    	  
    	  System.out.println("Error el numero es incorrecto");
    	  System.out.println("Fin del programa");
    	  
      }else if (num1>0){
    	  System.out.println("Del num1 su potencia es : "  + Math.pow(num1,4));
    	  System.out.println("y su raiz es :"+Math.sqrt(num1));
    	  
    	  
    	  }
    	  
    	  
      }

	}


