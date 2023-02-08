package Condiçâo01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A, B, hora;
		A = sc.nextInt();
		B = sc.nextInt();
		
		
		if (A < B) {
			hora = B - A;
		}
		else {
			hora = 24 - A + B;
		}
		System.out.print("O JOGO DUROU " + hora + " HORA(S)");
		 
		
		
		sc.close();

	}

}
