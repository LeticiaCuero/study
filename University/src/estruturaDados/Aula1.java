package estruturaDados;

import java.util.Locale;
import java.util.Scanner;

public class Aula1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
        System.out.println("1 - Vetor");
        System.out.println("2 - Matriz");
        System.out.println("3 - BD");
        System.out.println("4 - DB");
        int opcao = scn.nextInt();

        if (opcao == 1) {
            vetor(scn);
        } else if (opcao == 2) {
            matriz(scn);
        } else if (opcao == 3) {
            bd(scn);
        } else if (opcao == 4) {
            db(scn);
        }else {
            System.out.println("Invalido");
        }
		
		scn.close();
	}
	
		public static void vetor(Scanner scn) {
			
			int[] n = new int[8];
			
			for(int i = 0; i < n.length; i++) {
				System.out.println("Informe o " + i + " da sequencia");
				n[i] = scn.nextInt();
			}
			
			System.out.println("\nSequencia original:");
	        for (int i = 0; i < n.length; i++) {
	            System.out.println("Posição " + i + ": " + n[i]);
	        }
	        
			System.out.println("\nSequencia invertida:");
	        for (int a = n.length -1; a>= 0; a--) {
	            System.out.println("Posição " + a + ": " + n[a]);
	        }
			
		}
		
		public static void matriz(Scanner scn) {
			
			int [] v1 = new int[8];
			int [] v2 = new int[8];
			int [] v3 = new int[8];
			int[][] matriz = new int[8][3];
			
			System.out.println("Valores vetor 1:");
	        for (int i = 0; i < v1.length; i++) {
	            System.out.print("Posição " + i + ": ");
	            v1[i] = scn.nextInt();
	        }
	        System.out.println("Valores vetor 1:");
	        for (int i = 0; i < v2.length; i++) {
	            System.out.print("Posição " + i + ": ");
	            v2[i] = scn.nextInt();
	        }
	        System.out.println("Valores vetor 1:");
	        for (int i = 0; i < v3.length; i++) {
	            System.out.print("Posição " + i + ": ");
	            v3[i] = scn.nextInt();
	        }
	        
	        for (int i = 0; i < 8; i++) {
	            matriz[i][0] = v1[i];
	            matriz[i][1] = v2[i];
	            matriz[i][2] = v3[i];
	        }

	        for (int i = 0; i < matriz.length; i++) {
	            for (int a = 0; a < matriz[i].length; a++) {
	                System.out.print(matriz[i][a] + "\t");
	            }
	            System.out.println(); 
	        }
	        
		}
		
		public static void bd(Scanner scn) {
			int[] b = new int[8];
			
			for (int i = 0; i < 8; i++) {
		        System.out.print(i + " valor: ");
		        b[i] = scn.nextInt();
			}
			System.out.println();
			
			int d = 0;
			System.out.print("Binario: ");
		    for (int i = 0; i < 8; i++) {
		        d += b [i] * Math.pow(2, 7 - i);
		        System.out.print(b[i]);
		    }

		    System.out.println("\nDecimal: " + d);
		}
		
		public static void db(Scanner scn) {
			
		    System.out.print("Digite um número: ");
		    int n = scn.nextInt();

		    int[] b = new int[8];

		    for (int i = 7; i >= 0; i--) {
		        b[i] = n % 2;
		        n = n / 2;
		    }

		    System.out.print("Binario: ");
		    for (int i = 0; i < 8; i++) {
		        System.out.print(b[i]);
		    }
		}

}
