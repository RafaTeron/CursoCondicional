package Curso_exercicio03;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int np, np2;
		double vp, vp2, valor;
		
		np = sc.nextInt();
		vp = sc.nextDouble();
		
		
		np2 = sc.nextInt();
		vp2 = sc.nextDouble();
		
		valor =  vp * np + vp2 * np2;
		
		System.out.printf("Valor total : %.2f%n", valor);
		
		
		
		sc.close();
	}

}
