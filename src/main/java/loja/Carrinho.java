package loja;

import java.util.Collections;
import java.util.List;

public class Carrinho {

	private Produto p;
	private  List<Produto> produtos;

	public Carrinho(Produto p) {
		this.p = p;
	}

	public Carrinho(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public double getMenorPreco() {
//		Collections.sort(produtos);
	//	return produtos.get(0).getPreco();
		return p.getPreco();
	}

}
