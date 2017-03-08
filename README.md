# Aula de Linguagem de Programação III
Repositório GIT para ajudar os colegas do IFSUL nas atividades da matéria de Linguagem de Programação III.

Atalhos:

- [Configuração do Ambiente](#configuração-do-ambiente)

# Configuração do Ambiente
Passo a passo da configuração do ambiente:

- Fazer o download da última versão do [Hibernate](http://hibernate.org/orm/) e do [MySQL Connector](https://dev.mysql.com/downloads/connector/j/);
- Descompactar o arquivo do Hibernate (no linux: abrir o terminal e executar o comando `unzip NOME_DO_ARQUIVO`);
- Abrir o eclipse e ir em `File` ->  `New` -> `JPA Project`.

Ao abrir a modal `New JPA Project`:

- Informar o `Project Name`;
- Alterar o `Target runtime` para `java-8-oracle`;
- Clicar em `Next`;
- Clicar em `Next`;
- Clicar em `Manage Libraries`.

Ao Abrir a modal `Preferences(Filtered)`:
- Clicar em `New`;
- Informar o `User library name` (sugestão: hibernate);
- Selecionar a `library` criada e clicar em `Add External JARs...` ;
- Navegar até a pasta que contêm o hibernate descompactado (algo como: `~\hibernate-release-x.x.x.Final`);
- Selecionar todos os arquivos `.jar`dentro do caminho `\lib\required`;
- Clicar em `enter`.

Repetir o processo novamente para o MySQL Connector:
- Clicar em `New`;
- Informar o `User library name` (sugestão: mysql);
- Selecionar a `library` criada e clicar em `Add External JARs...` ;
- Navegar até a pasta que contêm o MySQL Connector;
- Selecionar o arquivo do MySQL Connector (`mysql-connector-java-x.x.xx-bin.jar`);
- Clicar em `enter`.

Feito isto:
- Clicar em OK na modal `Preferences(Filtered)`;
- Selecionar as duas bibliotecas criadas em JPA Implementation;
- Selecionar a opção `Discover annotated classes automatically` em `Persistent class management`
    para as classes criadas serem adicionadas automaticamente no `persistence.xml`;
- Clicar em `finish` e está pronto o sorvetinho.

## Persistence.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<persistence version="2.1" xmlns="http://xmlns.jcp.org/xml/ns/persistence" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence http://xmlns.jcp.org/xml/ns/persistence/persistence_2_1.xsd">
    <persistence-unit name="Aula1_4I" transaction-type="RESOURCE_LOCAL">
        <provider>org.hibernate.jpa.HibernatePersistenceProvider</provider>   
        <class>Pessoa</class>
        <properties>
            <property name="javax.persistence.jdbc.driver" value="com.mysql.jdbc.Driver"/>
            <property name="javax.persistence.jdbc.user" value="root"/>
            <property name="javax.persistence.jdbc.password" value="ifsul2017"/>
            <property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/4i"/>
            <property name="hibernate.dialect" value="org.hibernate.dialect.MySQL5InnoDBDialect"/>
            <property name="hibernate.show_sql" value="true"/>
            <property name="hibernate.format_sql" value="true"/>
            <property name="hibernate.use_sql_comments" value="false"/>
            <property name="hibernate.hbm2ddl.auto" value="update"/>       
        </properties>
        </persistence-unit>
</persistence>
``` 

## Classe Pessoa

```java
import javax.persistence.*;

@Entity
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Basic
	private String nome;
	
	@Embedded
	private Endereco endereco;

	public Pessoa() { }
	
	public Pessoa(String nome, Endereco endereco){
		super();
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public Pessoa(Long id, String nome, Endereco endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}

```


## Classe Executavel

```java
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Executavel {
	
    public static void main(String[] args) {
    	
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Aula1_4I");
        EntityManager em = emf.createEntityManager();
       
        Endereco end = new Endereco("Travessa", "Germano Von Hohendorff", 109);
        
        Pessoa henz = new Pessoa("Gabriel Henz", end);
        Pessoa kauer = new Pessoa("Lucas Kauer", end);
       
        em.getTransaction().begin();
	
        em.persist(henz);
	em.persist(kauer);
	
        em.getTransaction().commit();
	
        em.close();
        emf.close();
    }
    
}
```


## Classe Embutida Endereco
```java
import javax.persistence.Embeddable;

@Embeddable
public class Endereco {
	
	private String logradouro;
	private String nome_logradouro;
	private int numero;
	
	public Endereco() { }
	
	public Endereco(String logradouro, String nome_logradouro, int numero){
		this.logradouro = logradouro;
		this.nome_logradouro = nome_logradouro;
		this.numero = numero;
	}
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNomeLogradouro() {
		return nome_logradouro;
	}
	public void setNomeLogradouro(String nome_logradouro) {
		this.nome_logradouro = nome_logradouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
}

```
## Banco de Dados

Criar o banco de dados antes de rodar a classe `Executavel`.
O nome do BD deve ser igual ao informado na tag 
```xml 
<property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/4i"/>
```
onde o nome do BD deve ser passado como ultimo parametro, depois da porta em value="jdbc:mysql://localhost:3306/**4i**".
```sql
CREATE DATABASE 4i;
```
