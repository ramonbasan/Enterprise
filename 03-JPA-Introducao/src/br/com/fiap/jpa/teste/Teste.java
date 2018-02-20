package br.com.fiap.jpa.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import br.com.fiap.jpa.entity.Cliente;
import br.com.fiap.jpa.entity.Sexo;
import br.com.fiap.jpa.entity.Status;

public class Teste {

	public static void main(String[] args) {
		
		// Usar nome arquivo Persistence
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = fabrica.createEntityManager();
		
	/*
		Carro carro = new Carro(
				"Celta", 2010, "1.0", "GM", "DDD-9875",
				new GregorianCalendar(2010, Calendar.JANUARY, 2), 
				false, false, null, Transmissao.MANUAL);
	*/
//---------------------------------------------------------------------------------------
		Cliente cliente = new Cliente(
				"Ramon", new GregorianCalendar(1987, Calendar.NOVEMBER, 11), 
				123456, Sexo.MASCULINO, null, Status.ATIVO);
		
//---------------------------------------------------------------------------------------
		em.getTransaction().begin(); // Inicia uma Transação
		
		em.persist(cliente);
		//em.persist(carro);
		
		em.getTransaction().commit(); // Realiza commit
		em.close();
		fabrica.close();
		

	}

}
