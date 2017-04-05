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

		Aluno a1 = new Aluno("John");
		Aluno a2 = new Aluno("Doe");
		
		Turma t1 = new Turma("4i");
		Turma t2 = new Turma("4k");
		
		List<AlunoTurma> ats = new ArrayList<AlunoTurma>();
		AlunoTurma at1 = new AlunoTurma(a1, t1, new Date());
		AlunoTurma at2 = new AlunoTurma(a2, t2, new Date());
		
		ats.add(at1);
		ats.add(at2);
		
		a1.setTurmas(ats);
		a2.setTurmas(ats);
		t1.setAlunos(ats);
		t2.setAlunos(ats);
		
		entityManager.persist(a1);
		entityManager.persist(a2);
		entityManager.persist(t1);
		entityManager.persist(t2);
		entityManager.persist(at1);
		entityManager.persist(at2);
		

		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();
	}
}
