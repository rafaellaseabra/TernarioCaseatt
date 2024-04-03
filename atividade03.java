package estruturadecisao;

import java.util.Scanner;

public class atividade03 {

	public static void main(String[] args) {
		double numero;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("---Informe um valor---");
		numero = ler.nextDouble();
		
		String mensagem = numero %5 == 0? "*O numero é multiplo de 5* ": "*O número não é multiplo de 5!*";
		System.out.println(mensagem); 

	}

}
