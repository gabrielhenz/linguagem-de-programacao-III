import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Executavel {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Aula1_4I");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Pessoa lucas = new Pessoa("Lucas Kauer");
		Pessoa gabriel = new Pessoa("Gabriel Henz");
		Endereco endereco = new Endereco("RS", "Sapucaia", 5);
		lucas.setEndereco(endereco);
		gabriel.setEndereco(endereco);
		
		entityManager.getTransaction().begin();
		entityManager.persist(lucas);
		entityManager.persist(gabriel);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
	}
}
