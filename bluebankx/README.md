## Listage dos endpionts da nossa API

> ## clientes-controller
- <font color="#1E90FF">**[GET]**</font> */clientes/{id}*<br>
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
- <font color="#FF6347">**[DELETE]**</font> */clientes/{id}*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/clientes/{id}

- <font color="#66CDAA">**[POST]**</font> */clientes/cadastrar*<br>
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

- <font color="#FF8C00">**[PUT]**</font> */clientes/editar*<br>
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

- <font color="#1E90FF">**[GET]**</font> */clientes/listar*<br>
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
- <font color="#1E90FF">**[GET]**</font> */contas/{id}*<br>
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

- <font color="#FF6347">**[DELETE]**</font> */contas/{id}*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/{id}

- <font color="#66CDAA">**[POST]**</font> */contas/cadastrar*<br>
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

- <font color="#FF8C00">**[PUT]**</font> */contas/editar*<br>
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
- <font color="#1E90FF">**[GET]**</font> */enderecos/{id}*<br>
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

- <font color="#FF6347">**[DELETE]**</font> */enderecos/{id}*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/{id}

- <font color="#66CDAA">**[POST]**</font> */enderecos/cadastrar*<br>
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

- <font color="#FF8C00">**[PUT]**</font> */enderecos/editar*<br>
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
- <font color="#1E90FF">**[GET]**</font> */transacao/{id}*<br>
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

- <font color="#FF6347">**[DELETE]**</font> */transacao/{id}*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/{id}

- <font color="#66CDAA">**[POST]**</font> */transacao/cadastrar*<br>
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

- <font color="#FF8C00">**[PUT]**</font> */transacao/editar*<br>
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

- <font color="#1E90FF">**[GET]**</font> */transacao/listartodos/{id}*<br>
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

- <font color="#1E90FF">**[GET]**</font> */transacao/listartodosdata/{id}&{dataInicio}&{dataFim}*<br>
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
- <font color="#1E90FF">**[GET]**</font> */*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/

- <font color="#4169E1">**[HEAD]**</font> */*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/

- <font color="#66CDAA">**[POST]**</font> */*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/

- <font color="#FF8C00">**[PUT]**</font> */*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/

- <font color="#FF6347">**[DELETE]**</font> */*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/

- <font color="#4682B4">**[OPTIONS]**</font> */*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/

- <font color="#00FFFF">**[PATCH]**</font> */*<br>
http://sqxt2-env.eba-k423m3gi.us-east-2.elasticbeanstalk.com/

