package br.com.fiap.teste;

import java.util.Properties;

import br.com.fiap.singleton.PropertiySingleton;

public class Teste {

	public static void main(String[] args) {
		Properties p = PropertiySingleton.getInstance();
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("login"));
		
	}

}
