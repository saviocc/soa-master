package br.com.acc.java;

public class Ordem {

	public static void main(String[] args) {
		int[] valores = {5,66,7,90,123,45,65,675,1};
		boolean trocou = true;
		int aux;
		
		while( trocou ) {
			trocou = false;
			for (int i = 0; i < valores.length - 1; i++) {
				if(valores[i] > valores[i+1]) {
					aux = valores[i];
					valores[i] = valores[i+1];
					valores[i+1] = aux;
					trocou = true;
				}
				
			}
		}
		
		for (int i : valores) {
			System.out.println(i);
		}
		
		
		

	}

}
