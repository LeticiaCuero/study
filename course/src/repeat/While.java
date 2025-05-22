package repeat;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int option = 0;
		int contA = 0;
		int contG = 0;
		int contD = 0;
		
	
		while(option != 4) {
			System.out.println("Informe uma opção: \n1 - Álcool \n2 - Gasolina \n3 - Diesel \n4 - Fim");
			option = scn.nextInt();
					
			switch(option){
				
			case 1:
				contA = contA + 1;
				System.out.println("Registro concluido!");
				break;
	
			case 2:
				contG = contG + 1;
				System.out.println("Registro concluido!");
				break;
				
			case 3:
				contD = contD + 1;
				System.out.println("Registro concluido!");
				break;
				
			case 4:
				option = 4;
				System.out.println("MUITO OBRIGADO!\n");
				break;
			default:
                System.out.println("Opção inválida. Por favor, escolha uma opção de 1 a 4.");
					
			}
			
		}
		scn.close();
		System.out.println("Registros: \nÁlcool: " + contA + "\nGasolina: " + contG + "\nDiesel: " + contD);
	}
}
