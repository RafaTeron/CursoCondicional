package curso_processamentoexercicios2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double π = 3.14159, R , A;
		R = sc.nextDouble();
		A = π * (R * R);
		
		System.out.printf("AREA : %.4f%n", + A);
		
		
		sc.close();

	
	}
}
