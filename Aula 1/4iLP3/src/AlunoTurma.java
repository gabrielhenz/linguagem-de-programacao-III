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
	@JoinColumn(name="aluno_id")
	private Aluno aluno;
	
	@Id
	@ManyToOne
	@JoinColumn(name="turma_id")
	private Turma turma;
	
	@Temporal(TemporalType.DATE)
	private Date date;

	public AlunoTurma() { }
		
	public AlunoTurma(Aluno aluno, Turma turma, Date date){
		this.aluno = aluno;
		this.turma = turma;
		this.date = date;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
