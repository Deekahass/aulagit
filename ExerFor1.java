import java.util.Scanner;

public class ExerFor1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int n1;
		int n2;
		
		System.out.println("Digite o primeiro intervalo: ");
		n1 = leia.nextInt();
		
		System.out.println("Digite o último intervalo:  ");
		n2 = leia.nextInt();
		
		if (n1 > n2) {
			System.out.println("interválo inválido! ");
		
		} 
		
		else { 
			System.out.println("no interválo entre " + n1 + " e " + n2);
		}
		for (int contar = n1; contar <= n2; contar ++) {
			if (contar % 3 == 0 & contar % 5 == 0) {
				System.out.println(contar + "é multiplo de 3 e 5");
			}
	  }

	}

}
