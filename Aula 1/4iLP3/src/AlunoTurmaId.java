import java.io.Serializable;

import javax.persistence.Entity;

public class AlunoTurmaId implements Serializable{
	
	private int aluno;
	private int turma;
	
	public AlunoTurmaId(){}
	
	public int getAluno() {
		return aluno;
	}
	public void setAluno(int aluno) {
		this.aluno = aluno;
	}
	public int getTurma() {
		return turma;
	}
	public void setTurma(int turma) {
		this.turma = turma;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + aluno;
		result = prime * result + turma;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof AlunoTurmaId))
			return false;
		AlunoTurmaId other = (AlunoTurmaId) obj;
		if (aluno != other.aluno)
			return false;
		if (turma != other.turma)
			return false;
		return true;
	}
	
}
