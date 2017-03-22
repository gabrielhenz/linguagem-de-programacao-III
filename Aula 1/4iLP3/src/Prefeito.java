import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Prefeito {
	@EmbeddedId
	private Cidade id;
	private String nome;
	public Cidade getId() {
		return id;
	}
	public void setId(Cidade id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Prefeito(){}
	public Prefeito(Cidade id, String nome){
		this.nome=nome;
		this.id=id;
		
	}
}
