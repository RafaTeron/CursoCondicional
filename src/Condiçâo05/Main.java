package Condiçâo05;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int produto = sc.nextInt();
		int quantidade = sc.nextInt();
		
		double total;
		if (produto == 1) {
			total = quantidade * 4.0;
		}
		else if (produto == 2) {
			total = quantidade * 4.5;
		}
		else if (produto == 3) {
			total = quantidade * 5.0;
		}
		else if (produto == 4) {
			total = quantidade * 2.0;
		}
		else {
			total = quantidade * 1.5;
		}
		System.out.printf("Total : %.2f%n", total);
		
		sc.close();

	}

}
