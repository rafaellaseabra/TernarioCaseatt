package estruturadecisao;

import java.util.Scanner;

public class attSalario1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int  tempo ;
		double salario, bonus, bonus2;
		
		System.out.println("Informe seu salario aqui:");
		salario = ler.nextInt();
		
		System.out.println ("Informe seu tempo na empresa:");
		tempo = ler.nextInt();
		
		bonus = salario * 0.05;
		bonus2 = salario * 0.07;
		
		if (tempo <= 3) {
			System.out.println("O seu bônus é de:" + bonus);
		}
		else {
			System.out.println("O seu bônus é de:!"+ bonus2 );
		}
		ler.close();

	}

}
