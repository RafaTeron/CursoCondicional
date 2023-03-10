package Curso_exercicio04;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, pi = 3.14159;
		double tri, cir, tra, qua, ret;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		tri = (A * C) / 2;
		cir = pi * (C * C);
		tra = (A + B) * C / 2;
		qua = B + B + B + B;
		ret = A * B;
		
		System.out.printf("TRIANGULO : %.3f%n", tri);
		System.out.printf("CIRCULO : %.3f%n", cir);
		System.out.printf("TRAPEZIO : %.3f%n", tra);
		System.out.printf("QUADRADO : %.3f%n", qua);
		System.out.printf("RETANGULO : %.3f%n", ret);				
		
		sc.close();
		
	}

}
