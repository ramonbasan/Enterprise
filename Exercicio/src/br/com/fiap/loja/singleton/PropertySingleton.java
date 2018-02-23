package br.com.fiap.loja.singleton;

import java.io.IOException;
import java.util.Properties;

public class PropertySingleton {


		//Atributo estático que armazena a instância única
		private static Properties prop;

		private PropertySingleton( ) {}
			
		//Método estático que retorna a instância unica
		public static Properties getInstance() {
			if(prop ==null) {
				//Inicializa o objeto
				prop = new Properties();
				//Carrega o objeto com as configurações do arquivo
				try {
					prop.load(PropertySingleton.class.getResourceAsStream("/loja.properties"));
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return prop;
		}
	}