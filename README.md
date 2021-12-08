# Desafio Final BlueBank Grupo X
## Membros
- **Leonardo Silva**<br>
:octocat: https://github.com/LeonardoMFSilva/<br>
:blue_book: https://www.linkedin.com/in/leeosilva/<br>
- **Marcus Vinicius Santos de Oliveira**<br>
:octocat: https://github.com/Marvin99SO<br>
:blue_book: https://www.linkedin.com/in/marcus-vinicius-santos-de-oliveira-1430a21b4/<br>
- **Maria Júlia Alencar Muniz**<br>
:octocat: https://github.com/mariajuliamuniz<br>
:blue_book: https://www.linkedin.com/in/mariajuliamuniz1/<br>
- **Yuri Jivago Xavier Diniz**<br>
:octocat: https://github.com/yurijivago<br>
:blue_book: https://www.linkedin.com/in/yuri-jivago-xavier-diniz-49aa97bb/<br>

---

## O Desafio ##
O banco fictício **BlueBank** está construindo uma nova plataforma e precisa de uma API para gerenciar as transações. Utilize suas novas habilidades com Java, Banco de Dados e AWS.
O sistema deve permitir cadastro de novos clientes, incluindo dados pessoais e dados para contato. O cliente deve ser atrelado a uma conta bancária e registrar histórico de transações entre as contas.

### Entrega Mínima ###
1. Metodologias Ágeis:<br>
  a. Kanban com todas as tarefas organizadas e responsáveis definidos.<br><br>
  
2. Back-end:<br>
  a. Cadastro de clientes<br>
  b. Listagem de clientes<br>
  c. Atualização de clientes<br>
  d. Deletar clientes<br>
  e. Histórico de transações entre contas<br><br>
  
3. Banco de Dados:<br>
  a. Tabelas bem estruturadas e populadas com valores para testes.<br>
  b. O Banco deve ser entregue em script SQL junto ao repositório.<br><br>
  
4. Gerais:<br>
  a. O código deve ser entregue em um repositório no Github.<br>
  b. A API deve ser disponibilizada em ambiente AWS com EC2 e em Beanstalk.<br>
  c. A aplicação deve ter um pipeline em Jenkins ou no Aws Build.<br>
  d. A aplicação precisa ser configurada no API Gateway da AWS.<br>
  e. A aplicação precisa ter no mínimo um endpoint de SNS para cadastro de emails e verificação automática.<br>
  f. A aplicação precisa ter no mínimo um Lambda.<br>
  g. Liste os endpoints no README.md<br>

### Entrega Opcional ###
Testes automatizados, podem ser testes unitários ou testes de integração.


> ### Como parte dos requisitos para o desafio final do Pan Academy, temos a listagem dos endpoints da nossa API no arquivo README.md que encontra-se no diretório raiz da aplicação:
---

## Listagem dos endpoints da nossa API

> ## clientes-controller
- **[GET]** */clientes/{id}*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/clientes/{id}

- **[DELETE]** */clientes/{id}*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/clientes/{id}

- **[POST]** */clientes/cadastrar*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/clientes/cadastrar

- **[PUT]** */clientes/editar*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/clientes/editar

- **[GET]** */clientes/listar*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/clientes/listar

> ## contas-controller
- **[GET]** */contas/{id}*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/{id}

- **[DELETE]** */contas/{id}*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/{id}

- **[POST]** */contas/cadastrar*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/cadastrar

- **[PUT]** */contas/editar*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/editar

> ## enderecos-controller
- **[GET]** */enderecos/{id}*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/{id}

- **[DELETE]** */enderecos/{id}*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/{id}

- **[POST]** */enderecos/cadastrar*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/cadastrar

- **[PUT]** */enderecos/editar*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/editar

> ## transacao-controller
- **[GET]** */transacao/{id}*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/{id}


- **[DELETE]** */transacao/{id}*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/{id}

- **[POST]** */transacao/cadastrar*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/cadastrar


- **[PUT]** */transacao/editar*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/editar


- **[GET]** */transacao/listartodos/{id}*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/listartodos/{id}


- **[GET]** */transacao/listartodosdata/{id}&{dataInicio}&{dataFim}*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/listartodosdata/{id}&{dataInicio}&{dataFim}

> ## home-controller
- **[GET]** */*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/

- **[HEAD]** */*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/

- **[POST]** */*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/

- **[PUT]** */*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/

- **[DELETE]** */*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/

- **[OPTIONS]** */*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/

- **[PATCH]** */*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/
