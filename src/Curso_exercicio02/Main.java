package Curso_exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int Funci, Hr, NUMBER;
		double Valor, SALARY;
		Funci = sc.nextInt();
		Hr = sc.nextInt();
		Valor = sc.nextDouble();
		NUMBER = Funci;
		SALARY = Hr * Valor;
		
		System.out.println("NUMBER : " + NUMBER);
		System.out.printf("SALARY :%.2f%n ", + SALARY);
		
		sc.close();

	}

}
