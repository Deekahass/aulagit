import java.util.Scanner;

public class ExerDoWhile1 {

	public static void main(String[] args) {
		 Scanner leia = new Scanner (System.in);
		 
		 int numero;
		 int somaPositivos = 0;
		 
		  do {
			 System.out.println("Digite o número");
			 numero = leia.nextInt();
			 
		 if (numero > 0 ) {
		 
		somaPositivos += numero;

			  }  
		   
		  }  while (numero != 0);
		         System.out.println("Soma dos numeros positivos é: " + somaPositivos); 
		  
	   }
   }
	
