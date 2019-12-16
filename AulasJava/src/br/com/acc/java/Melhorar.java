package br.com.acc.java;

public class Melhorar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int quantidadePendecia = 0;
		String dadosBancarios = "5";
		
		if( dadosBancarios != null ) {
			if( dadosBancarios.compareTo("2") >= 0 && dadosBancarios.compareTo("4") <= 0 ) {
				quantidadePendecia++;
			}
		}

		System.out.println(quantidadePendecia);
	}

}
