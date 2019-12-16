package br.com.acc.pedido;

public class Produto {
	private final long codigo;
	private String descricao;
	private double preco;
	private double saldo;
	
	public Produto(long codigo, String descricao, double preco, double saldo) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
		this.saldo = saldo;
	}

	public long getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}
