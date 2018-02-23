package br.com.fiap.loja.bo;

import br.com.fiap.loja.to.ProdutoTO;

public class EstoqueBO{

	public ProdutoTO consultarProduto(int codProduto) {

		ProdutoTO to = null;

		switch (codProduto) {

		case 401:
			to = new ProdutoTO(401, "Camiseta Masculina", 50, 10);
			break;	

		case 402:
			to = new ProdutoTO(402, "Camiseta Feminina", 40, 20);
			break;
			
		}
		return to;

	}

}
