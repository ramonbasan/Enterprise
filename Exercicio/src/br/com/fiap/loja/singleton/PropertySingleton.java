package br.com.fiap.loja.singleton;

import java.io.IOException;
import java.util.Properties;

public class PropertySingleton {


		//Atributo est�tico que armazena a inst�ncia �nica
		private static Properties prop;

		private PropertySingleton( ) {}
			
		//M�todo est�tico que retorna a inst�ncia unica
		public static Properties getInstance() {
			if(prop ==null) {
				//Inicializa o objeto
				prop = new Properties();
				//Carrega o objeto com as configura��es do arquivo
				try {
					prop.load(PropertySingleton.class.getResourceAsStream("/loja.properties"));
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return prop;
		}
	}