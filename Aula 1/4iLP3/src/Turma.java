import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Turma {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String nome;
	
	@OneToMany(mappedBy="turma")
	private List<AlunoTurma> alunos;
	
	public Turma(){}
	
	public Turma(String nome){
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

	public List<AlunoTurma> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<AlunoTurma> alunos) {
		this.alunos = alunos;
	}
	
}
