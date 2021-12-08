## Listage dos endpionts da nossa API

> ## clientes-controller
- **[GET]** */clientes/{id}*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/clientes/{id}
```
{
  "contaModel": {
    "credito": 0,
    "creditoTotal": 0,
    "id": 0,
    "nome": "string",
    "numConta": "string",
    "saldo": 0,
    "tipo": "string"
  },
  "cpf": "string",
  "dataNasc": "string",
  "email": "string",
  "enderecoModel": {
    "bairro": "string",
    "cep": "string",
    "cidade": "string",
    "complemento": "string",
    "id": 0,
    "logradouro": "string",
    "numero": 0,
    "uf": "AC"
  },
  "id": 0,
  "nome": "string",
  "patrimonio": 0,
  "profissao": "string",
  "renda": 0,
  "telefone": "string"
}
```
- **[DELETE]** */clientes/{id}*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/clientes/{id}

- **[POST]** */clientes/cadastrar*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/clientes/cadastrar
```
{
  "bairro": "string",
  "cep": "string",
  "cidade": "string",
  "complemento": "string",
  "cpf": "string",
  "credito": 0,
  "creditoTotal": 0,
  "dataNasc": "string",
  "email": "string",
  "logradouro": "string",
  "nome": "string",
  "nomePreferencial": "string",
  "numero": 0,
  "patrimonio": 0,
  "profissao": "string",
  "renda": 0,
  "saldo": 0,
  "senha": "string",
  "telefone": "string",
  "tipo": "string",
  "uf": "AC"
}
```

- **[PUT]** */clientes/editar*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/clientes/editar
```
{
  "contaModel": {
    "credito": 0,
    "creditoTotal": 0,
    "id": 0,
    "nome": "string",
    "numConta": "string",
    "saldo": 0,
    "tipo": "string"
  },
  "cpf": "string",
  "dataNasc": "string",
  "email": "string",
  "enderecoModel": {
    "bairro": "string",
    "cep": "string",
    "cidade": "string",
    "complemento": "string",
    "id": 0,
    "logradouro": "string",
    "numero": 0,
    "uf": "AC"
  },
  "id": 0,
  "nome": "string",
  "patrimonio": 0,
  "profissao": "string",
  "renda": 0,
  "telefone": "string"
}
```

- **[GET]** */clientes/listar*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/clientes/listar
```
[
  {
    "contaModel": {
      "credito": 0,
      "creditoTotal": 0,
      "id": 0,
      "nome": "string",
      "numConta": "string",
      "saldo": 0,
      "tipo": "string"
    },
    "cpf": "string",
    "dataNasc": "string",
    "email": "string",
    "enderecoModel": {
      "bairro": "string",
      "cep": "string",
      "cidade": "string",
      "complemento": "string",
      "id": 0,
      "logradouro": "string",
      "numero": 0,
      "uf": "AC"
    },
    "id": 0,
    "nome": "string",
    "patrimonio": 0,
    "profissao": "string",
    "renda": 0,
    "telefone": "string"
  }
]
```

> ## contas-controller
- **[GET]** */contas/{id}*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/{id}
```
{
  "credito": 0,
  "creditoTotal": 0,
  "id": 0,
  "nome": "string",
  "numConta": "string",
  "saldo": 0,
  "tipo": "string"
}
```

- **[DELETE]** */contas/{id}*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/{id}

- **[POST]** */contas/cadastrar*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/cadastrar
```
{
  "credito": 0,
  "creditoTotal": 0,
  "id": 0,
  "nome": "string",
  "numConta": "string",
  "saldo": 0,
  "tipo": "string"
}
```

- **[PUT]** */contas/editar*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/editar
```
{
  "credito": 0,
  "creditoTotal": 0,
  "id": 0,
  "nome": "string",
  "numConta": "string",
  "saldo": 0,
  "tipo": "string"
}
```

> ## enderecos-controller
- **[GET]** */enderecos/{id}*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/{id}
```
{
  "bairro": "string",
  "cep": "string",
  "cidade": "string",
  "complemento": "string",
  "id": 0,
  "logradouro": "string",
  "numero": 0,
  "uf": "AC"
}
```

- **[DELETE]** */enderecos/{id}*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/{id}

- **[POST]** */enderecos/cadastrar*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/cadastrar
```
{
  "bairro": "string",
  "cep": "string",
  "cidade": "string",
  "complemento": "string",
  "id": 0,
  "logradouro": "string",
  "numero": 0,
  "uf": "AC"
}
```

- **[PUT]** */enderecos/editar*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/editar
```
{
  "bairro": "string",
  "cep": "string",
  "cidade": "string",
  "complemento": "string",
  "id": 0,
  "logradouro": "string",
  "numero": 0,
  "uf": "AC"
}
```

> ## transacao-controller
- **[GET]** */transacao/{id}*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/{id}
```
{
  "clienteDestinoTransacao": {
    "contaModel": {
      "credito": 0,
      "creditoTotal": 0,
      "id": 0,
      "nome": "string",
      "numConta": "string",
      "saldo": 0,
      "tipo": "string"
    },
    "cpf": "string",
    "dataNasc": "string",
    "email": "string",
    "enderecoModel": {
      "bairro": "string",
      "cep": "string",
      "cidade": "string",
      "complemento": "string",
      "id": 0,
      "logradouro": "string",
      "numero": 0,
      "uf": "AC"
    },
    "id": 0,
    "nome": "string",
    "patrimonio": 0,
    "profissao": "string",
    "renda": 0,
    "telefone": "string"
  },
  "clienteOrigemTransacao": {
    "contaModel": {
      "credito": 0,
      "creditoTotal": 0,
      "id": 0,
      "nome": "string",
      "numConta": "string",
      "saldo": 0,
      "tipo": "string"
    },
    "cpf": "string",
    "dataNasc": "string",
    "email": "string",
    "enderecoModel": {
      "bairro": "string",
      "cep": "string",
      "cidade": "string",
      "complemento": "string",
      "id": 0,
      "logradouro": "string",
      "numero": 0,
      "uf": "AC"
    },
    "id": 0,
    "nome": "string",
    "patrimonio": 0,
    "profissao": "string",
    "renda": 0,
    "telefone": "string"
  },
  "dataHoraTransacao": "2021-12-08T05:52:30.062Z",
  "id": 0,
  "tipoTransacao": "BO",
  "valor": 0
}
```

- **[DELETE]** */transacao/{id}*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/{id}

- **[POST]** */transacao/cadastrar*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/cadastrar
```
{
  "clienteDestinoTransacao": {
    "contaModel": {
      "credito": 0,
      "creditoTotal": 0,
      "id": 0,
      "nome": "string",
      "numConta": "string",
      "saldo": 0,
      "tipo": "string"
    },
    "cpf": "string",
    "dataNasc": "string",
    "email": "string",
    "enderecoModel": {
      "bairro": "string",
      "cep": "string",
      "cidade": "string",
      "complemento": "string",
      "id": 0,
      "logradouro": "string",
      "numero": 0,
      "uf": "AC"
    },
    "id": 0,
    "nome": "string",
    "patrimonio": 0,
    "profissao": "string",
    "renda": 0,
    "telefone": "string"
  },
  "clienteOrigemTransacao": {
    "contaModel": {
      "credito": 0,
      "creditoTotal": 0,
      "id": 0,
      "nome": "string",
      "numConta": "string",
      "saldo": 0,
      "tipo": "string"
    },
    "cpf": "string",
    "dataNasc": "string",
    "email": "string",
    "enderecoModel": {
      "bairro": "string",
      "cep": "string",
      "cidade": "string",
      "complemento": "string",
      "id": 0,
      "logradouro": "string",
      "numero": 0,
      "uf": "AC"
    },
    "id": 0,
    "nome": "string",
    "patrimonio": 0,
    "profissao": "string",
    "renda": 0,
    "telefone": "string"
  },
  "dataHoraTransacao": "2021-12-08T05:52:50.272Z",
  "id": 0,
  "tipoTransacao": "BO",
  "valor": 0
}
```

- **[PUT]** */transacao/editar*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/editar
```
{
  "clienteDestinoTransacao": {
    "contaModel": {
      "credito": 0,
      "creditoTotal": 0,
      "id": 0,
      "nome": "string",
      "numConta": "string",
      "saldo": 0,
      "tipo": "string"
    },
    "cpf": "string",
    "dataNasc": "string",
    "email": "string",
    "enderecoModel": {
      "bairro": "string",
      "cep": "string",
      "cidade": "string",
      "complemento": "string",
      "id": 0,
      "logradouro": "string",
      "numero": 0,
      "uf": "AC"
    },
    "id": 0,
    "nome": "string",
    "patrimonio": 0,
    "profissao": "string",
    "renda": 0,
    "telefone": "string"
  },
  "clienteOrigemTransacao": {
    "contaModel": {
      "credito": 0,
      "creditoTotal": 0,
      "id": 0,
      "nome": "string",
      "numConta": "string",
      "saldo": 0,
      "tipo": "string"
    },
    "cpf": "string",
    "dataNasc": "string",
    "email": "string",
    "enderecoModel": {
      "bairro": "string",
      "cep": "string",
      "cidade": "string",
      "complemento": "string",
      "id": 0,
      "logradouro": "string",
      "numero": 0,
      "uf": "AC"
    },
    "id": 0,
    "nome": "string",
    "patrimonio": 0,
    "profissao": "string",
    "renda": 0,
    "telefone": "string"
  },
  "dataHoraTransacao": "2021-12-08T05:53:09.374Z",
  "id": 0,
  "tipoTransacao": "BO",
  "valor": 0
}
```

- **[GET]** */transacao/listartodos/{id}*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/listartodos/{id}
```
[
  {
    "clienteDestinoTransacao": {
      "contaModel": {
        "credito": 0,
        "creditoTotal": 0,
        "id": 0,
        "nome": "string",
        "numConta": "string",
        "saldo": 0,
        "tipo": "string"
      },
      "cpf": "string",
      "dataNasc": "string",
      "email": "string",
      "enderecoModel": {
        "bairro": "string",
        "cep": "string",
        "cidade": "string",
        "complemento": "string",
        "id": 0,
        "logradouro": "string",
        "numero": 0,
        "uf": "AC"
      },
      "id": 0,
      "nome": "string",
      "patrimonio": 0,
      "profissao": "string",
      "renda": 0,
      "telefone": "string"
    },
    "clienteOrigemTransacao": {
      "contaModel": {
        "credito": 0,
        "creditoTotal": 0,
        "id": 0,
        "nome": "string",
        "numConta": "string",
        "saldo": 0,
        "tipo": "string"
      },
      "cpf": "string",
      "dataNasc": "string",
      "email": "string",
      "enderecoModel": {
        "bairro": "string",
        "cep": "string",
        "cidade": "string",
        "complemento": "string",
        "id": 0,
        "logradouro": "string",
        "numero": 0,
        "uf": "AC"
      },
      "id": 0,
      "nome": "string",
      "patrimonio": 0,
      "profissao": "string",
      "renda": 0,
      "telefone": "string"
    },
    "dataHoraTransacao": "2021-12-08T05:53:45.311Z",
    "id": 0,
    "tipoTransacao": "BO",
    "valor": 0
  }
]
```

- **[GET]** */transacao/listartodosdata/{id}&{dataInicio}&{dataFim}*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/listartodosdata/{id}&{dataInicio}&{dataFim}
```
[
  {
    "clienteDestinoTransacao": {
      "contaModel": {
        "credito": 0,
        "creditoTotal": 0,
        "id": 0,
        "nome": "string",
        "numConta": "string",
        "saldo": 0,
        "tipo": "string"
      },
      "cpf": "string",
      "dataNasc": "string",
      "email": "string",
      "enderecoModel": {
        "bairro": "string",
        "cep": "string",
        "cidade": "string",
        "complemento": "string",
        "id": 0,
        "logradouro": "string",
        "numero": 0,
        "uf": "AC"
      },
      "id": 0,
      "nome": "string",
      "patrimonio": 0,
      "profissao": "string",
      "renda": 0,
      "telefone": "string"
    },
    "clienteOrigemTransacao": {
      "contaModel": {
        "credito": 0,
        "creditoTotal": 0,
        "id": 0,
        "nome": "string",
        "numConta": "string",
        "saldo": 0,
        "tipo": "string"
      },
      "cpf": "string",
      "dataNasc": "string",
      "email": "string",
      "enderecoModel": {
        "bairro": "string",
        "cep": "string",
        "cidade": "string",
        "complemento": "string",
        "id": 0,
        "logradouro": "string",
        "numero": 0,
        "uf": "AC"
      },
      "id": 0,
      "nome": "string",
      "patrimonio": 0,
      "profissao": "string",
      "renda": 0,
      "telefone": "string"
    },
    "dataHoraTransacao": "2021-12-08T05:54:00.595Z",
    "id": 0,
    "tipoTransacao": "BO",
    "valor": 0
  }
]
```


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

