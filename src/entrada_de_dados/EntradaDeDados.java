package entrada_de_dados;

import java.util.Scanner;

public class EntradaDeDados {
	public static void main(String[] args) {	
		Scanner sc = new Scanner (System.in);
		String nome ; 
		System.out.println("Digite uma palavra e Enter");
		nome = sc.next ();
		
		System.out.println("Você digitou " + nome);
		sc.close ();
	}
}
