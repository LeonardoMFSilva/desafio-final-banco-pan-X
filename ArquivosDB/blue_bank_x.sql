#Criando o banco de dados
CREATE SCHEMA `bluebankx` ;

#Utilizando o banco
USE `bluebankx`;

#Criando as tabelas
#Edereço
CREATE TABLE `bluebankx`.`enderecos`(
	`id` BIGINT NOT NULL auto_increment,
    PRIMARY KEY(id),
    `bairro` VARCHAR(50) NOT NULL unique,
    `cep` VARCHAR(8) NOT NULL,
    `cidade` VARCHAR(60) NOT NULL,
    `complemento` VARCHAR(60) NOT NULL,
    `logradouro` VARCHAR(120) NOT NULL,
    `numero` VARCHAR(10) NOT NULL,
    `UF` VARCHAR(2) NOT NULL
);

#Conta
CREATE TABLE `bluebankx`.`contas`(
	`id` BIGINT NOT NULL auto_increment,
    PRIMARY KEY(id),
    `credito` DECIMAL NOT NULL unique,
    `credito_total` DECIMAL NOT NULL,
    `nome` VARCHAR(120) NOT NULL,
    `num_conta` VARCHAR(10) NOT NULL,
    `saldo` DECIMAL NOT NULL,
    `tipo` VARCHAR(2) NOT NULL
);

#Clientes
CREATE TABLE `bluebankx`.`clientes` (
  `id` BIGINT NOT NULL,
  `cpf` VARCHAR(14) NOT NULL,
  `data_nascimento` DATE NOT NULL,
  `email` VARCHAR(60) NOT NULL,
  `nome` VARCHAR(120) NOT NULL,
  `patrimonio` DECIMAL NOT NULL,
  `renda` DECIMAL NOT NULL,
  `senha` VARCHAR(15) NOT NULL,
  `telefone` VARCHAR(16) NOT NULL,
  `conta_model_id` BIGINT NOT NULL,
  `endereco_model_id` BIGINT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `cpf_UNIQUE` (`cpf` ASC) VISIBLE,
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE,
  INDEX `endereco_fk_idx` (`endereco_model_id` ASC) VISIBLE,
  INDEX `conta_fk_idx` (`conta_model_id` ASC) VISIBLE,
  CONSTRAINT `endereco_fk`
    FOREIGN KEY (`endereco_model_id`)
    REFERENCES `bluebankx`.`enderecos` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `conta_fk`
    FOREIGN KEY (`conta_model_id`)
    REFERENCES `bluebankx`.`contas` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);

#Transações
CREATE TABLE `bluebankx`.`transacoes` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `data_hora_transacao` DATE NOT NULL,
  `tipo_transacao` VARCHAR(255) NOT NULL,
  `valor` DECIMAL NOT NULL,
  `cliente_destino` BIGINT NOT NULL,
  `cliente_origem` BIGINT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `cliente_origem_fk_idx` (`cliente_origem` ASC) VISIBLE,
  INDEX `cliente_destino_fk_idx` (`cliente_destino` ASC) VISIBLE,
  CONSTRAINT `cliente_origem_fk`
    FOREIGN KEY (`cliente_origem`)
    REFERENCES `bluebankx`.`clientes` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `cliente_destino_fk`
    FOREIGN KEY (`cliente_destino`)
    REFERENCES `bluebankx`.`clientes` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);