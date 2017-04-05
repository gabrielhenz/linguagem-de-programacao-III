import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@IdClass(AlunoTurmaId.class)
public class AlunoTurma {
	
	@Id
	@ManyToOne
	@JoinColumn(name="ALUNO_ID")
	private Aluno aluno;
	
	@Id
	@ManyToOne
	@JoinColumn(name="TURMA_ID")
	private Turma turma;
	
	@Temporal(TemporalType.DATE)
	private Date data;
	
	public AlunoTurma(){}

	public AlunoTurma(Aluno aluno, Turma turma, Date data) {
		super();
		this.aluno = aluno;
		this.turma = turma;
		this.data = data;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
