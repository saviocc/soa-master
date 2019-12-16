package br.com.acc.pedido;

public enum FormaPagamentoEnum {
	DINHEIRO("Dinheiro"),
	CREDITO("Cartão de crédito"),
	CHEQUE("Cheque"),
	BOLETO("Boleto"),
	DEBITO("Cartão de débito");
	
	public String descricaoFormaPagamento;

	private FormaPagamentoEnum(String descricao) {
		descricaoFormaPagamento = descricao;
	}
	
	public String getDescricaoFormaPagamento() {
		return descricaoFormaPagamento;
	}
}
