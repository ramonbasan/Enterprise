package br.com.fiap.loja.to;

import java.io.Serializable;

public class ProdutoTO implements Serializable{

	private int codProduto;
	private String nomeProduto;
	private double precoUnitario;
	private int qtdEstoque;

	//Contrutores
	public ProdutoTO() {
		super();
	}

	public ProdutoTO(int codProduto, String nomeProduto, double precoUnitario, int qtdEstoque) {
		super();
		this.codProduto = codProduto;
		this.nomeProduto = nomeProduto;
		this.precoUnitario = precoUnitario;
		this.qtdEstoque = qtdEstoque;
	}

	//Getters and Setters
	public int getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

}
