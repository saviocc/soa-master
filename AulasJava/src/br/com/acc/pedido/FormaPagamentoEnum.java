package br.com.acc.pedido;

public enum FormaPagamentoEnum {
	DINHEIRO("Dinheiro"),
	CREDITO("Cart�o de cr�dito"),
	CHEQUE("Cheque"),
	BOLETO("Boleto"),
	DEBITO("Cart�o de d�bito");
	
	public String descricaoFormaPagamento;

	private FormaPagamentoEnum(String descricao) {
		descricaoFormaPagamento = descricao;
	}
	
	public String getDescricaoFormaPagamento() {
		return descricaoFormaPagamento;
	}
}
