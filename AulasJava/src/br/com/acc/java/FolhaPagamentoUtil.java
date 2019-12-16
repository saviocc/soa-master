package br.com.acc.java;

public class FolhaPagamentoUtil {
	
	public double calcularAumento(Funcionario func) {
		double valor = 0;
		if( func instanceof Diretor ) {
			valor = func.salario * 1.37;
		} else if( func instanceof Gerente ) {
			valor = func.salario * 1.25;
		} else if( func instanceof Secretaria ) {
			valor = func.salario * 1.15;
	    } else if( func instanceof Engenheiro ) {
		   valor = func.salario * 1.175;
	    }
		return valor;
	}

}
