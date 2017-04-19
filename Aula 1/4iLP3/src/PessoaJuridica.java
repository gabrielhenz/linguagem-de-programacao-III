import javax.persistence.Entity;

@Entity
public class PessoaJuridica extends Pessoa{
	private String cnpj;
	
	public PessoaJuridica(){}
	
	public PessoaJuridica(String nome, String cnpj){
		this.nome = nome;
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
