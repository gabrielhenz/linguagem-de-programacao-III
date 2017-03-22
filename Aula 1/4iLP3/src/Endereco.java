import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Endereco {
	private String logradouro;
	@Column(name="ENDERECO")
	private String nome;
	private int numero;
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Endereco() {
		
	}
	public Endereco(String logradouro, String nome, int numero) {
		super();
		this.logradouro = logradouro;
		this.nome = nome;
		this.numero = numero;
	}
	
	
	
}
