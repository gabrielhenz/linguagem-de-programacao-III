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
- Selecionar a opção `Discover annotated classes automatically` em `Persistent class management`;
- Clicar em `finish` e está pronto o sorvetinho.
