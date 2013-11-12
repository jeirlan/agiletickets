package loja;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.testng.Assert;

public class CarrinhoTest {
	
	@Test
	public void testPegaMenorPrecoCom1Produto() throws Exception{
		Produto p = new Produto("Bola", 15);
		Carrinho c = new Carrinho(p);
		double menorPreco = c.getMenorPreco();
		Assert.assertEquals(15.0, menorPreco);
	}

	@Test
	public void testPegaMenorPrecoComVariosProdutos() throws Exception {
		List<Produto> produtos = new ArrayList<>();
	    produtos.add(new Produto ("Bola", 10.50));
	    produtos.add(new Produto ("Boneca", 8.25));
	    
	    Carrinho c = new Carrinho(produtos);
	}
}
