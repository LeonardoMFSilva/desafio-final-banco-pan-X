-- INSERT INTO `blue_bank`.`cliente_model` (`cpf`, `data_nascimento`, `email`, `nome`, `patrimonio`, `profissao`, `renda`, `telefone`) VALUES ('123456789', '1921-02-02', 'yuri@mail.com', 'Yuri', '20000000', 'Dev Banco Pan', '3500', '4002-8922');

CREATE SCHEMA `blue_bank_x` ;

USE `blue_bank_x`;
CREATE TABLE `blue_bank_x`.`clientes`(
	`id` INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY(id),
    `cpf` VARCHAR(11) NOT NULL unique,
    `data_nascimento` DATE NOT NULL,
    `email` VARCHAR(60) NOT NULL,
    `nome` VARCHAR(120) NOT NULL,
    `patrimonio` DECIMAL NOT NULL,
    `profissao` VARCHAR(60) NOT NULL,
    `renda` DECIMAL NOT NULL,
    `telefone` VARCHAR(15) NOT NULL,
    `conta_model_id` INT NOT NULL REFERENCES `contas`(`id`),
    -- `transacao_model_id` INT NOT NULL REFERENCES `trasacoes`(`id`),
    `endereco_model_id` INT NOT NULL REFERENCES `contas`(`id`)
);

USE `blue_bank_x`;
CREATE TABLE `blue_bank_x`.`contas`(
	`id` INT NOT NULL auto_increment,
    PRIMARY KEY(id),
    `credito` DECIMAL NOT NULL unique,
    `credito_total` DECIMAL NOT NULL,
    `nome` VARCHAR(120) NOT NULL,
    `num_conta` VARCHAR(10) NOT NULL,
    `saldo` DECIMAL NOT NULL,
    `tipo` VARCHAR(2) NOT NULL
);

USE `blue_bank_x`;
CREATE TABLE `blue_bank_x`.`transacoes`(
	`id` INT NOT NULL auto_increment,
    PRIMARY KEY(id),
    `cliente_destino` VARCHAR(10) NOT NULL unique,
    `cliente_origem` VARCHAR(10) NOT NULL,
    `data_hora_transacao` DATETIME NOT NULL,
    `tipo_transacao` VARCHAR(3) NOT NULL,
    `valor` DECIMAL NOT NULL
);

USE `blue_bank_x`;
CREATE TABLE `blue_bank_x`.`enderecos`(
	`id` INT NOT NULL auto_increment,
    PRIMARY KEY(id),
    `bairro` VARCHAR(50) NOT NULL unique,
    `cep` VARCHAR(8) NOT NULL,
    `cidade` VARCHAR(60) NOT NULL,
    `complemento` VARCHAR(60) NOT NULL,
    `logradouro` VARCHAR(120) NOT NULL,
    `numero` VARCHAR(10) NOT NULL,
    `UF` VARCHAR(2) NOT NULL
);