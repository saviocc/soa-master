package br.com.acc.java;

public class Produto {
	String nome;
	double preco;
	int quantidade;
	
	public Produto(String nome, double preco, int quantidade) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public double valorTotal() {
		double total = 0;
		total = this.preco * this.quantidade;
		
		if( this.quantidade > 10 && this.quantidade <= 20 ) {
			total = total * 0.9;
		} else if( this.quantidade > 20 && this.quantidade <= 50 ) {
			total = total * 0.8;
		} else if( this.quantidade > 50 ) {
	    	total = total * 0.75;
	    }
		
		return total;
	}
	

}
