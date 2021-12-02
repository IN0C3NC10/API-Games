<!-- Título -->
<h1 align="center" id="title">API Games :video_game:</h1>

<!-- Descrição -->
<p align="justify">
  Esta é uma API bem simples desenvolvida com fins de estudo, não apenas do SpringBoot como também a metodologia Rest. Para emular o real uso, fora usado "Games" como objeto a ser adquirido pela API, onde é possível realizar as operações de um CRUD se baseando em um objeto com "nome e categoria"(name, category).
</p>


<!-- Shield -->
<p>
	<img src="https://img.shields.io/badge/Made%20with-Spring Boot-6DB33F?style=for-the-badge&logo=spring&logoColor=6DB33F" title="Feito com SpringBoot" alt="Feito com SpringBoot"></img>
  <img src="https://img.shields.io/badge/Used-Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=FF6C37" title="Utilizado o Postman" alt="Utilizado o Postman"></img>
  <!--<img src="https://img.shields.io/badge/Status-Working-F08705?style=for-the-badge" title="Status do Projeto: Trabalhando" alt="Projeto em Andamento"></img>-->
  <img src="https://img.shields.io/badge/Status-Done-blue?style=for-the-badge" title="Status do Projeto: Concluído" alt="Projeto Concluído"></img>
</p>


<!-- Tecnologias -->
<h2 align="left" id="tecnologias">Tecnologias</h2>

As seguintes ferramentas foram usadas na construção do projeto:

- [Spring](https://spring.io/)

Plugins:

- Spring Data JPA
- Validation
- Spring Web
- Spring Boot DevTools
- H2 Database
- SpringFox - Swagger


<!-- Pré-Requisitos -->
<h2 align="left" id="pre">Pré-Requisitos</h2>

Antes de começar vale lembrar, é necessário possuir o [Java](https://www.java.com/pt-BR/) instalado e o [Maven](https://maven.apache.org/download.cgi) baixado em sua máquina e como estamos trabalhando com uma API precisamos de alguma forma fazer as requisições, então deixo o [Postman](https://www.postman.com/downloads/) como recomendação. É bacana também você possuir um editor para trabalhar com o código, fica a dica o [VSCode](https://code.visualstudio.com/download).


<!-- Features -->
<h2 align="left" id="conteúdo">Funcionalidades</h2>

- [x] Find All - Get("/api/games");
- [x] Create - Post("/api/games");
- [x] Find by Id - Get("/api/games/{id}");
- [x] Find by Name - Get("/api/games/name/{param}");
- [x] Find by Category - Get("/api/games/category/{param}");
- [x] Update - Put("/api/games/{id}");
- [x] Delete - Delete("/api/games/{id}");
- [x] Docs - Get("/swagger-ui/");


<!-- Executando o programa -->
<h2 align="left" id="run">Rodando a aplicação</h2>

```bash
# 1. Clone este repositório
$ git clone https://github.com/IN0C3NC10/API-Games.git

# 2. Abra o projeto no seu editor de preferência

# 3. Crie o arquivo "application.properties" em "./src/main/resources/"

# 4. Nele contém algumas configurações como porta, configurações do banco e etc, segue os dados presentes no meu:
      # ..porta da aplicação
      server.port=8088
      # ..habilita o console do H2 e a rota é o path
      spring.h2.console.enabled=true
      spring.h2.console.path=/h2-console
      # ..as informações do banco de dados H2
      spring.datasource.url=jdbc:h2:mem:testdb
      spring.datasource.username=sa
      spring.datasource.password=
      spring.datasource.driver-class-name=org.h2.Driver
      # ..exibe no console o sql de criação da tabela
      spring.jpa.show-sql=true
      spring.jpa.properties.hibernate.format_sql=true
      spring.jpa.defer-datasource-initialization=true

# 5. Selecione o arquivo principal e o execute.

# Obs. Utilize o Postman para realizar as "tarefas".
#      A rota para acessar o console do H2 é "/h2-console".
#      Vale citar que sempre que iniciar o projeto, todo o conteúdo anterior é deletado e os 2 objetos na "main" são inseridos.

#BeHappy!
```

<!-- Autor -->
<h2 align="left" id="autor">Autor</h2>
<p>
	<a href="https://github.com/IN0C3NC10">
		<img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/73368174?v=4" width="100px;" alt="autor-image" title="IN0C3NC10"/>
	</a>
	<br />
	Feito com ❤️ por <strong>Bruno Inocencio</strong>!
</p>

<p align="left">
  <!-- Outlook -->
  <a href="mailto:bruno.inocencio@fatec.sp.gov.br" alt="Outlook" target="_blank">
    <img height="35" src="https://img.shields.io/badge/Outlook-00001a?style=for-the-badge&logo=microsoft-outlook&logoColor=0078D4" />
  </a>
  <!-- Linkedin -->
  <a href="https://cutt.ly/nQlVjQV" alt="Linkedin" target="_blank">
    <img height="35" src="https://img.shields.io/badge/-LinkedIn-00001a?style=for-the-badge&logo=linkedin&logoColor=%230077B5" />
  </a>
  <!-- GitHub -->
  <a href="https://github.com/IN0C3NC10" alt="GitHub" target="_blank">
    <img height="35" src="https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white" />
  </a>
</p>
