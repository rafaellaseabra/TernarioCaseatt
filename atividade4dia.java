package estruturadecisao;

import java.util.Scanner;

public class atividade4dia {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String DIA;
		
	System.out.print ("informe o dia da semana!: ");
		DIA = ler.next();
		
		switch (DIA) {
		case "Domingo":
			System.out.println("Dia 1");
			break;
		case "Segunda":
			System.out.println("Dia 2");
			break;
		case "Terça":
			System.out.println("DIA 3");
			break;
		case "Quarta":
			System.out.println("Dia 4");
			break;
		case "Quinta":
			System.out.println("Dia 5");
			break;
		case "Sexta":
			System.out.println("Dia 6");
			break;
		case "Sabado":
			System.out.println("Dia 7");
			break;
			
			default:
				System.out.println ("--------DIA INVÁLIDO--------");
		}

	}

}
