# INSTRUÇÕES 
CRUD pure JS

Criar um sistema que adicione uma pessoa em uma tabela e que seja possível remove-la também.

FRONTEND
Você pode utilizar somente HTML CSS e Javascript puro, não podem ser usuados frameworks.

Para isso você precisa apenas de campos de texto (inputs) um botão e uma tabela.

Essa tabela deverá conter todos os dados de uma pessoa: nome, e-mail, telefone, profissão. 
Ao final de cada linha da tabela adicione um botão “remover”, ao clicar nele a linha deverá ser removida da tabela.
Essa ação deverá ser comandada pelo seu código em Javascript e cordenada com o backend.

Veja abaixo uma foto do que se espera:

![javascript-puro](https://user-images.githubusercontent.com/11966183/163838488-186296b6-10f9-4e68-83b6-b5bb248d207e.jpg)

BACKEND

Você deve utilizar JAVA crirar o RESTfull endpoint de insert (POST) e de remoção (DELETE).

Utilizar Spring ou Quarkus, mas não utlizar JPA ou Hibernate.

Deve salvar em um banco de dados SQL

SUGESTÕES:

Usar o Gson ou Jackson para serializar objetos JSON
