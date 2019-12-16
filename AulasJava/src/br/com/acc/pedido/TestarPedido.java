package br.com.acc.pedido;

public class TestarPedido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto p = new Produto(1,"Bola", 10, 50);
		
		ItemPedido ip = new ItemPedido(p, 2);
		
		Pedido pd = new Pedido( 1, "Dinheiro" );
		pd.itens.add(ip);
		
		System.out.println(pd.totalizar());
		
	}

}
