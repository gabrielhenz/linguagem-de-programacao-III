import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Executavel {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("4iLP3");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Pessoa lucas = new Pessoa("Lucas Kauer");
		Pessoa gabriel = new Pessoa("Gabriel Henz");
		
		entityManager.getTransaction().begin();
		entityManager.persist(lucas);
		entityManager.persist(gabriel);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
	}
}
