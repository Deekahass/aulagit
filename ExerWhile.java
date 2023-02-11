import java.util.Scanner;

public class ExerWhile {

	public static void main(String[] args) {
	  Scanner leia = new Scanner (System.in);
	  
	  int idadeMenor = 0;
	  int idadeMaior50 = 0;
	  int idade = 0;
	  
	  while ( idade >= 0) {
	      System.out.println("Digite sua idade ");
		  idade = leia.nextInt();
		  
		if (idade < 23 && idade > 0) {
			idadeMenor ++;
		}	else if (idade > 50) {
			idadeMaior50 ++;
		}	
	  }
		leia.close();
       System.out.printf("total de pessoas menores de 21 anos: %d", idadeMenor);
       System.out.printf("\ntotal de pessoas maiores de 50 anos: %d " , idadeMaior50);
        
       
	}
     
}
