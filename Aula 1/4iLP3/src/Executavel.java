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
		
		Aluno aluno = new Aluno("John");
		Aluno aluno2 = new Aluno("Doe");
		
		Turma turma = new Turma("4i");
		Turma turma2 = new Turma("4k");
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		List<Turma> turmas = new ArrayList<Turma>();
		
		alunos.add(aluno);
		alunos.add(aluno2);
		
		turmas.add(turma);
		turmas.add(turma2);
		
		aluno.setTurmas(turmas);
		aluno2.setTurmas(turmas);
		turma.setAlunos(alunos);
		turma2.setAlunos(alunos);
		
		entityManager.persist(aluno);
		entityManager.persist(aluno2);
		entityManager.persist(turma);
		entityManager.persist(turma2);
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
	}
}
