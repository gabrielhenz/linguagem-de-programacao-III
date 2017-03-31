import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Executavel {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Aula1_4I");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		Celular c = new Celular(new ArrayList<Chamada>(), "(51) 98765-4320");
		
		Chamada c1 = new Chamada(c, 30);
		Chamada c2 = new Chamada(c, 45);
		
		c.getChamadas().add(c1);
		c.getChamadas().add(c2);
		
		
		entityManager.persist(c1);
		entityManager.persist(c2);
		entityManager.persist(c);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
	}
}
