package estruturadecisao;

import java.util.Scanner;

public class ativedadeconverter {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int DIA;
		
	System.out.print ("informe o NÚMERO que represente o dia da semana!: ");
		DIA = ler.nextInt();
		
		switch (DIA) {
		case 1:
			System.out.println("DOMINGO");
			break;
		case 2:
			System.out.println("SEGUNDA");
			break;
		case 3:
			System.out.println("TERÇA");
			break;
		case 4:
			System.out.println("QUARTA");
			break;
		case 5:
			System.out.println("QUINTA");
			break;
		case 6:
			System.out.println("SEXTA");
			break;
		case 7:
			System.out.println("SÁBADO");
			break;
			
			default:
				System.out.println ("--------DIA INVÁLIDO--------");
		}
		
		
		
		
		
		
		

	}

}
