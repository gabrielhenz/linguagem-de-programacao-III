import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Executavel {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Aula1_4I");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();
		PessoaFisica fisica = new PessoaFisica("John", "123.456.789-10");
		PessoaJuridica juridica = new PessoaJuridica("IFSul", "10.729.992/0005-70");
		
		entityManager.persist(fisica);
		entityManager.persist(juridica);

		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();
	}
}
