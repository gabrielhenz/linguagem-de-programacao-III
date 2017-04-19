import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Aluno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String nome;
	
//	@ManyToMany
//	@JoinTable(
//			name="aluno_turma", 
//			joinColumns=@JoinColumn(name="ALUNO_ID"),
//			inverseJoinColumns=@JoinColumn(name="TURMA_ID")
//	)
//	private List<Turma> turmas;
	
	@OneToMany(mappedBy="aluno")
	private List<AlunoTurma> turmas;
	
	public Aluno(){
		super();
	}
	
	public Aluno(String nome){
		super();
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<AlunoTurma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<AlunoTurma> turmas) {
		this.turmas = turmas;
	}

//	public List<Turma> getTurmas() {
//		return turmas;
//	}
//
//	public void setTurmas(List<Turma> turmas) {
//		this.turmas = turmas;
//	}
}
