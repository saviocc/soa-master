package br.com.acc.java;

import java.util.Scanner;

public class Collatz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int valor = 0;
		System.out.println("Digite um número qualquer");
		valor = sc.nextInt();
		System.out.println(valor);
		
		do {
			if(valor <= 1) {
				continue;
			}
			else if( valor % 2 == 0 ) {
				valor = valor / 2;
			}
			else {
				valor = (valor * 3 ) + 1;
			}
			System.out.println(valor);
		} while(valor > 0);
		
		System.out.println("Fim!");

	}

}
