import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Celular {
	@Id
	@GeneratedValue
	private int id;
	
	@OneToMany(mappedBy = "celular")
	private List<Chamada> chamadas;
	
	private String numero;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Chamada> getChamadas() {
		return chamadas;
	}
	public void setChamadas(List<Chamada> chamadas) {
		this.chamadas = chamadas;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public Celular(){}
	
	
	public Celular(List<Chamada> chamadas, String numero) {
		super();
		this.chamadas = chamadas;
		this.numero = numero;
	}

}
