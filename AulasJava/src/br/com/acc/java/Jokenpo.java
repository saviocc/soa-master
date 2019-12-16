package br.com.acc.java;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Jokenpo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] opcoes = {"1-Pedra", "2-Papel", "3-Tesoura"};
		
		System.out.println("Jogaador 1");
		System.out.println("Escolha uma opção:");
		for (int i = 0; i < opcoes.length; i++) {
			System.out.println(opcoes[i]);
		}
		Scanner sc = new Scanner(System.in);
		int opc1 = sc.nextInt();
		
		System.out.println("Jogaador 2");
		System.out.println("Escolha uma opção:");
		for (int i = 0; i < opcoes.length; i++) {
			System.out.println(opcoes[i]);
		}
		int opc2 = sc.nextInt();
		
		if( opc1 == opc2 ) {
			System.out.println("Empate!");
		}
		else if( opc1 == 1 && opc2 == 3 ) {
			System.out.println("Jogador 1 venceu!!");
		}
		else if( opc1 == 3 && opc2 == 2 ) {
			System.out.println("Jogador 1 venceu!!");
		}
		else if( opc1 == 2 && opc2 == 1 ) {
			System.out.println("Jogador 1 venceu!!");
		}
		else if( opc1 == 3 && opc2 == 1 ) {
			System.out.println("Jogador 2 venceu!!");
		}
		else if( opc1 == 2 && opc2 == 3 ) {
			System.out.println("Jogador 2 venceu!!");
		}
		else if( opc1 == 1 && opc2 == 2 ) {
			System.out.println("Jogador 2 venceu!!");
		}
	}

}
