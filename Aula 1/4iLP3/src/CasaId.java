import java.io.Serializable;

public class CasaId implements Serializable{
	private int proprietario;
	private int inquilino;
	
	
	
	public int getProprietario() {
		return proprietario;
	}
	public void setProprietario(int proprietario) {
		this.proprietario = proprietario;
	}
	public int getInquilino() {
		return inquilino;
	}
	public void setInquilino(int inquilino) {
		this.inquilino = inquilino;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + inquilino;
		result = prime * result + proprietario;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CasaId other = (CasaId) obj;
		if (inquilino != other.inquilino)
			return false;
		if (proprietario != other.proprietario)
			return false;
		return true;
	}

	
	
	
}
