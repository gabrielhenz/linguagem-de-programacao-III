import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Chamada {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="celular_id")
	private Celular celular;
	private long duracao;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Celular getCelular() {
		return celular;
	}
	public void setCelular(Celular celular) {
		this.celular = celular;
	}
	public long getDuracao() {
		return duracao;
	}
	public void setDuracao(long duracao) {
		this.duracao = duracao;
	}
	
	public Chamada(){}
	
	public Chamada(Celular celular, long duracao){
		super();
		this.celular = celular;
		this.duracao = duracao;
	}
}
