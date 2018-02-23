package br.com.fiap.loja.view;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.fiap.loja.bo.EstoqueBO;
import br.com.fiap.loja.singleton.PropertySingleton;
import br.com.fiap.loja.to.ProdutoTO;

public class TerminalConsulta {

	private static final Logger log = LoggerFactory.getLogger(TerminalConsulta.class);

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);

		//Estanciar ESTOQUE BO
		EstoqueBO bo = new EstoqueBO();
		Properties p = PropertySingleton.getInstance();


		Calendar hoje = Calendar.getInstance();


		// Formatadores de dados;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		DecimalFormat df = new DecimalFormat("R$ #,###.00");


		String filial = PropertySingleton.getInstance().getProperty("filial");


		System.out.println	(filial	+ "		     		  " + sdf.format(hoje.getTime()));
		System.out.println("*********************************************************");
		int codigo;
		do {
			System.out.print("Codigo do produto: ");
			codigo =sc.nextInt();

			if (codigo != 0) {	
				ProdutoTO prod = bo.consultarProduto(codigo);

				if (codigo != 0) {
					
					if (prod != null) {
						System.out.println(prod.getNomeProduto());
						System.out.println(df.format(prod.getPrecoUnitario()));
						System.out.println(prod.getQtdEstoque());
					}else {
						System.out.println("Produto nao cadastardo");

					}
				}

			}

		}while(codigo !=0);
		System.out.println("FIm da aplicação");
		sc.close();

	}

}