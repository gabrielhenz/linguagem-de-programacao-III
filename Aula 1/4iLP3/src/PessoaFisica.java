import javax.persistence.Entity;

@Entity
public class PessoaFisica extends Pessoa {
	private String cpf;
	
	public PessoaFisica(){}
	
	public PessoaFisica(String nome, String cpf){
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
