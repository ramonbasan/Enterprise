package br.com.fiap.loja.singleton;

import java.io.IOException;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PropertySingleton {

	private static final Logger log = LoggerFactory.getLogger(PropertySingleton.class);


	//Atributo estático que armazena a instância única
	private static Properties prop;

	private PropertySingleton( ) {}

	//Método estático que retorna a instância unica
	public static Properties getInstance() {
		log.debug("Recuperando o objeto propriedades");
		if(prop ==null) {
			//Inicializa o objeto
			prop = new Properties();
			//Carrega o objeto com as configurações do arquivo
			try {
				log.info("Carregando as propriedades do sistema");
				prop.load(PropertySingleton.class.getResourceAsStream("/loja.properties"));
			} catch (IOException e) {
				e.printStackTrace();
				log.error("Propriedades não foram carregadas");
			}
		}
		return prop;
	}
}