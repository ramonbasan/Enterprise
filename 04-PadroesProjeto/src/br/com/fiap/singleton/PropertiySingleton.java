package br.com.fiap.singleton;

import java.io.IOException;
import java.util.Properties;

public class PropertiySingleton {

	//Atributo estático que armazena a instância única
	private static Properties prop;

	private PropertiySingleton( ) {}
		
	//Método estático que retorna a instância unica
	public static Properties getInstance() {
		if(prop ==null) {
			//Inicializa o objeto
			prop = new Properties();
			//Carrega o objeto com as configurações do arquivo
			try {
				prop.load(PropertiySingleton.class.getResourceAsStream("/propriedades.properties"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return prop;
	}
}
