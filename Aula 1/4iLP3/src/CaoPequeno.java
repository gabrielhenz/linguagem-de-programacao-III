import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CAO_PEQUENO");
public class CaoPequeno extends Cao{
	
	private String latidoFino;
	
	public CaoPequeno(){}
	
	public CaoPequeno(String nome, String latidoFino){
		this.nome = nome;
		this.latidoFino = latidoFino;
	}

	public String getLatidoFino() {
		return latidoFino;
	}

	public void setLatidoFino(String latidoFino) {
		this.latidoFino = latidoFino;
	}
}
