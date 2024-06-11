CREATE DATABASE atividade3;
USE atividade3;
  
CREATE TABLE listagem
  (
    Id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    Produtor VARCHAR(100),
    NomeEpisodio VARCHAR(100),
    NºEpisodio VARCHAR(100),
    Duraçao VARCHAR(100),
    URL_Repo VARCHAR(100)
  ); 

CREATE TABLE usuario 
(
	Id INT PRIMARY KEY AUTO_INCREMENT,
	Nome VARCHAR(30),
	Login VARCHAR(100),
	Senha VARCHAR(100),
    ConfirmeSenha VARCHAR(100),
	Tipo VARCHAR(30)
);

SELECT * FROM listagem; -- Exibe a tabela 'listagem'.
SELECT * FROM usuario; -- Exibe a tabela 'usuario'.