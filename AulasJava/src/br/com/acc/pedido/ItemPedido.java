package br.com.acc.pedido;

public class ItemPedido {
	private Produto produto;
	private double quantidade;
	private double precoVenda;
	
	public ItemPedido(Produto produto, double quantidade) {
		super();
		this.produto = produto;
		
		this.quantidade = quantidade;
		this.precoVenda = this.produto.getPreco();
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}
	

	public double subTotal() {
		return this.precoVenda * this.quantidade;
	}
	

}
