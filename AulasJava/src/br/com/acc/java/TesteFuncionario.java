package br.com.acc.java;

public class TesteFuncionario {

	public static void main(String[] args) {
		FolhaPagamentoUtil fpu = new FolhaPagamentoUtil();
		
		Diretor d = new Diretor(1, "SAVIO", "financeiro", 2000 );
		System.out.println(fpu.calcularAumento(d));
		
		Gerente g = new Gerente(1, "SAVIO", "financeiro", 2000 );
		System.out.println(fpu.calcularAumento(g));
	}

}
