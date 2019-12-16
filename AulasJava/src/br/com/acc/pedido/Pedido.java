package br.com.acc.pedido;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	int numero;
	FormaPagamentoEnum formaPagto;
	List<ItemPedido> itens = new ArrayList<>();
	
	public Pedido(int numero, FormaPagamentoEnum formaPagto) {
		super();
		this.numero = numero;
		this.formaPagto = formaPagto.BOLETO;
		}
	
	public double totalizar() {
		double total = 0;

		for (ItemPedido itemPedido : itens) {
			total += itemPedido.subTotal();
		}
		
		return total;
	}
}
