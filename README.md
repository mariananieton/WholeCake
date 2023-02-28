# WholeCake

Uma API para sistema de vendas de doces.

## Endpoints

- Usuários
    - [cadastrar](#cadastrar-usuários)
    - [apagar](#apagar-usuário)
    - [listar todos](#listar-todos-os-usuários)
    - [alterar](#alterar-usuário)
    - [pesquisar por id](#pesquisar-usuário-por-id)
    - [pesquisar por nome](#pesquisar-usuário-por-nome)
- Pedidos
    - [cadastrar](#cadastrar-pedidos)
    - [apagar](#apagar-pedido)
    - [listar todos](#listar-todos-os-pedidos)
    - [alterar](#alterar-pedido)
    - [pesquisar por id](#pesquisar-pedido-por-id)
    - [pesquisar por numero](#pesquisar-pedido-por-número)
- Produtos
    - [cadastrar](#cadastrar-produtos)
    - [apagar](#apagar-produto)
    - [listar todos](#listar-todos-os-produtos)
    - [alterar](#alterar-produto)
    - [pesquisar por id](#pesquisar-produto-por-id)
    - [pesquisar por nome](#pesquisar-produto-por-nome)

---

### Cadastrar Usuários

`POST` /wholecake/api/usuario

**Campos da Requisição**

| campo | tipo | obrigatório | descrição 
|-------|------|:-------------:|---
|nome | texto | sim | o nome completo do usuário
|username | texto | sim | o username do usuário
|senha| texto | sim | a senha do usuário
|data_nascimento | data | sim | a data de nascimento do usuário
|email_id | int | sim | o id de um email previamente cadastrado
|endereco_id | int | sim | o id de um endereco previamente cadastrado

**Exemplo de Payload**

```js
{
    nome: 'Mariana Nieton Borges',
    username: 'mariananieton',
    senha: 'senha',
    data_nascimento: 1999-05-11,
    email_id: 1,
    endereco_id: 1
}
```

**Códigos de Respostas**

| código | descrição
|-|-
| 201 | usuário cadastrado com sucesso
| 400 | campos inválidos
| 401 | não autorizado
| 403 | não autorizado

----

### Apagar Usuário

`DELETE` wholecake/api/usuario/{id}

**Campos da Requisição**

| campo | tipo | obrigatório | descrição 
|-------|------|:-------------:|---
|usuario_id | int | sim | o id do usuário


**Exemplo de Payload**

```js
{
    usuario_id: 1
}
```

**Códigos de Respostas**

| código | descrição
|-|-
| 200 | usuário removido com sucesso
| 401 | não autorizado
| 403 | não autorizado
| 404 | usuário não encontrado

----

### Listar todos os Usuários

`GET` /wholecake/api/usuario

**Exemplo de corpo de resposta**

```js
{
    nome: 'Mariana Nieton Borges',
    username: 'mariananieton',
    data_nascimento: '1999-05-11',
    email {
        email_id: 1,
        descricao: "mariana@fiap.com.br"
    },
    endereco {
        endereco_id: 1,
        logradouro: "Rua dos Doces",
        numero: 250,
        bairro: "Parque Pudim",
        cidade: "Santo André",
        estado: "SP",
        pais: "Brasil",
        complemento: ""
    }
}
{
    nome: 'Erik Hakamada',
    username: 'erikhakamada',
    data_nascimento: '1997-03-10',
    email {
        email_id: 2,
        descricao: "erik@fiap.com.br"
    },
    endereco {
        endereco_id: 2,
        logradouro: "Rua dos Salgados",
        numero: 1001,
        bairro: "Parque da Coxinha",
        cidade: "São Paulo",
        estado: "SP",
        pais: "Brasil",
        complemento: "Apto 36"
    }
}
```

**Códigos de Respostas**

| código | descrição
|-|-
| 200 | usuários retornados com sucesso
| 400 | campos inválidos
| 401 | não autorizado
| 403 | não autorizado

----

### Alterar Usuário

`PUT` /wholecake/api/usuario/{id}

**Campos da Requisição**

| campo | tipo | obrigatório | descrição 
|-------|------|:-------------:|---
|usuario_id | int | sim | o id do usuário
|nome | texto | não | o nome completo do usuário
|username | texto | não | o username do usuário
|senha| texto | não | a senha do usuário
|data_nascimento | data | não | a data de nascimento do usuário
|email_id | int | não | o id de um email previamente cadastrado
|endereco_id | int | não | o id de um endereco previamente cadastrado

**Exemplo de Payload**

```js
{
    usuario_id: 1,
    nome: 'Isabela',
    username: 'is_abela_258',
    senha: 'senha123',
    data_nascimento: 1999-08-25,
    email_id: 3,
    endereco_id: 3
}
```

**Códigos de Respostas**

| código | descrição
|-|-
| 200 | o usuário existe e foi atualizado com sucesso
| 400 | campos inválidos
| 401 | não autorizado
| 403 | não autorizado
| 404 | não existe usuário com o id informado

----

### Pesquisar Usuário por Id

`GET` /wholecake/api/usuario/{id}

**Campos da Requisição**

| campo | tipo | obrigatório | descrição 
|-------|------|:-------------:|---
|usuario_id | int | sim | o id do usuário

**Exemplo de Payload**

```js
{
    usuario_id: 2
}
```

**Exemplo de corpo de resposta**

```js
{
    nome: 'Erik Hakamada',
    username: 'erikhakamada',
    data_nascimento: '1997-03-10',
    email {
        email_id: 2,
        descricao: "erik@fiap.com.br"
    },
    endereco {
        endereco_id: 2,
        logradouro: "Rua dos Salgados",
        numero: 1001,
        bairro: "Parque da Coxinha",
        cidade: "São Paulo",
        estado: "SP",
        pais: "Brasil",
        complemento: "Apto 36"
    }
}
```

**Códigos de Respostas**

| código | descrição
|-|-
| 200 | o usuário existe e foi retornado com sucesso
| 400 | campos inválidos
| 401 | não autorizado
| 403 | não autorizado
| 404 | não existe usuário com o id informado

----

### Pesquisar Usuário por Nome

`GET` /wholecake/api/usuario/{nome}

**Campos da Requisição**

| campo | tipo | obrigatório | descrição 
|-------|------|:-------------:|---
|nome | texto | sim | o nome do usuário

**Exemplo de Payload**

```js
{
    nome: 'Mariana Nieton Borges'
}
```

**Exemplo de corpo de resposta**

```js
{
    nome: 'Mariana Nieton Borges',
    username: 'mariananieton',
    data_nascimento: '1999-05-11',
    email {
        email_id: 1,
        descricao: "mariana@fiap.com.br"
    },
    endereco {
        endereco_id: 1,
        logradouro: "Rua dos Doces",
        numero: 250,
        bairro: "Parque Pudim",
        cidade: "Santo André",
        estado: "SP",
        pais: "Brasil",
        complemento: ""
    }
}
```

**Códigos de Respostas**

| código | descrição
|-|-
| 200 | o usuário existe e foi retornado com sucesso
| 400 | campos inválidos
| 401 | não autorizado
| 403 | não autorizado
| 404 | não existe usuário com o nome informado

----

### Cadastrar Pedidos

`POST` /wholecake/api/pedido

**Campos da Requisição**

| campo | tipo | obrigatório | descrição 
|-------|------|:-------------:|---
|numero | int | sim | o número do pedido
|produto_id | int | sim | o id do produto selecionado
|usuario_id| int | sim | o id do usuário que fez o pedido
|data_pedido | data | sim | a data em que foi feito o pedido
|data_encomenda | data | sim | a data da encomenda do pedido
|forma_pagamento | texto | sim | a forma de pagamento do pedido
|valor_total | float | sim | o valor total do pedido

**Exemplo de Payload**

```js
{
    numero: 1075,
    produto_id: 1,
    usuario_id: 1,
    data_pedido: 2023-02-28,
    data_encomenda: 2023-03-10,
    forma_pagamento: 'Cartão de Crédito',
    valor_total: 220.00
}
```

**Códigos de Respostas**

| código | descrição
|-|-
| 201 | pedido cadastrado com sucesso
| 400 | campos inválidos
| 401 | não autorizado
| 403 | não autorizado

----

### Apagar Pedido

`DELETE` wholecake/api/pedido/{id}

**Campos da Requisição**

| campo | tipo | obrigatório | descrição 
|-------|------|:-------------:|---
|pedido_id | int | sim | o id do pedido


**Exemplo de Payload**

```js
{
    pedido_id: 1
}
```

**Códigos de Respostas**

| código | descrição
|-|-
| 200 | pedido removido com sucesso
| 401 | não autorizado
| 403 | não autorizado
| 404 | pedido não encontrado

----

### Listar todos os Pedidos

`GET` /wholecake/api/pedido

**Exemplo de corpo de resposta**

```js
{
    numero: 1075,
    produto {
        produto_id: 1,
    },
    usuario {
        nome: 'Mariana Nieton Borges',
    username: 'mariananieton',
    data_nascimento: '1999-05-11',
        email {
            email_id: 1,
            descricao: "mariana@fiap.com.br"
        },
        endereco {
            endereco_id: 1,
            logradouro: "Rua dos Doces",
            numero: 250,
            bairro: "Parque Pudim",
            cidade: "Santo André",
            estado: "SP",
            pais: "Brasil",
            complemento: ""
        }
    },
    data_pedido: 2023-02-28,
    data_encomenda: 2023-03-10,
    forma_pagamento: 'Cartão de Crédito',
    valor_total: 220.00
}
{
    numero: 2266,
    produto {
        produto_id: 2,
    },
    usuario {
    nome: 'Erik Hakamada',
    username: 'erikhakamada',
    data_nascimento: '1997-03-10',
        email {
            email_id: 2,
            descricao: "erik@fiap.com.br"
        },
        endereco {
            endereco_id: 2,
            logradouro: "Rua dos Salgados",
            numero: 1001,
            bairro: "Parque da Coxinha",
            cidade: "São Paulo",
            estado: "SP",
            pais: "Brasil",
            complemento: "Apto 36"
        }
    },
    data_pedido: 2023-03-05,
    data_encomenda: 2023-04-22,
    forma_pagamento: 'PIX',
    valor_total: 360.00
}
```

**Códigos de Respostas**

| código | descrição
|-|-
| 200 | pedidos retornados com sucesso
| 400 | campos inválidos
| 401 | não autorizado
| 403 | não autorizado

----

### Alterar Pedido

`PUT` /wholecake/api/pedido/{id}

**Campos da Requisição**

| campo | tipo | obrigatório | descrição 
|-------|------|:-------------:|---
|pedido_id | int | sim | o id do pedido
|data_encomenda | data | sim | a data da encomenda do pedido

**Exemplo de Payload**

```js
{
    pedido_id: 1,
    data_encomenda: 2023-05-11,
}
```

**Códigos de Respostas**

| código | descrição
|-|-
| 200 | o pedido existe e foi atualizado com sucesso
| 400 | campos inválidos
| 401 | não autorizado
| 403 | não autorizado
| 404 | não existe pedido com o id informado

----

### Pesquisar Pedido por Id

`GET` /wholecake/api/pedido/{id}

**Campos da Requisição**

| campo | tipo | obrigatório | descrição 
|-------|------|:-------------:|---
|pedido_id | int | sim | o id do pedido

**Exemplo de Payload**

```js
{
    pedido_id: 1,
    
}
```

**Exemplo de corpo de resposta**

```js
{
    numero: 1075,
    produto {
        produto_id: 1,
    },
    usuario {
        nome: 'Mariana Nieton Borges',
    username: 'mariananieton',
    data_nascimento: '1999-05-11',
        email {
            email_id: 1,
            descricao: "mariana@fiap.com.br"
        },
        endereco {
            endereco_id: 1,
            logradouro: "Rua dos Doces",
            numero: 250,
            bairro: "Parque Pudim",
            cidade: "Santo André",
            estado: "SP",
            pais: "Brasil",
            complemento: ""
        }
    },
    data_pedido: 2023-02-28,
    data_encomenda: 2023-03-10,
    forma_pagamento: 'Cartão de Crédito',
    valor_total: 220.00
}
```

**Códigos de Respostas**

| código | descrição
|-|-
| 200 | o pedido existe e foi retornado com sucesso
| 400 | campos inválidos
| 401 | não autorizado
| 403 | não autorizado
| 404 | não existe pedido com o id informado

----

### Pesquisar Pedido por Número

`GET` /wholecake/api/pedido/{numero}

**Campos da Requisição**

| campo | tipo | obrigatório | descrição 
|-------|------|:-------------:|---
|numero | id | sim | o número do pedido

**Exemplo de Payload**

```js
{
    numero: 2266
}
```

**Exemplo de corpo de resposta**

```js
{
    produto {
        produto_id: 2,
    },
    usuario {
    nome: 'Erik Hakamada',
    username: 'erikhakamada',
    data_nascimento: '1997-03-10',
        email {
            email_id: 2,
            descricao: "erik@fiap.com.br"
        },
        endereco {
            endereco_id: 2,
            logradouro: "Rua dos Salgados",
            numero: 1001,
            bairro: "Parque da Coxinha",
            cidade: "São Paulo",
            estado: "SP",
            pais: "Brasil",
            complemento: "Apto 36"
        }
    },
    data_pedido: 2023-03-05,
    data_encomenda: 2023-04-22,
    forma_pagamento: 'PIX',
    valor_total: 360.00
}
```

**Códigos de Respostas**

| código | descrição
|-|-
| 200 | o pedido existe e foi retornado com sucesso
| 400 | campos inválidos
| 401 | não autorizado
| 403 | não autorizado
| 404 | não existe pedido com o número informado

----

### Cadastrar Produtos

`POST` /wholecake/api/produto

**Campos da Requisição**

| campo | tipo | obrigatório | descrição 
|-------|------|:-------------:|---
|nome | texto | sim | o nome do produto
|valor_unitario | float | sim | o valor unitário do produto


**Exemplo de Payload**

```js
{
    nome: 'Brigadeiro',
    valor_unitario: 1.50
}
```

**Códigos de Respostas**

| código | descrição
|-|-
| 201 | produto cadastrado com sucesso
| 400 | campos inválidos
| 401 | não autorizado
| 403 | não autorizado

----

### Apagar Produto

`DELETE` wholecake/api/produto/{id}

**Campos da Requisição**

| campo | tipo | obrigatório | descrição 
|-------|------|:-------------:|---
|produto_id | int | sim | o id do produto


**Exemplo de Payload**

```js
{
    produto_id: 1
}
```

**Códigos de Respostas**

| código | descrição
|-|-
| 200 | produto removido com sucesso
| 401 | não autorizado
| 403 | não autorizado
| 404 | produto não encontrado

----

### Listar todos os Produtos

`GET` /wholecake/api/produto

**Exemplo de corpo de resposta**

```js
{
    nome: 'Brigadeiro',
    valor_unitario: 1.50
}
{
    nome: 'Bolo de Prestígio',
    valor_unitario: 100.00
}
```

**Códigos de Respostas**

| código | descrição
|-|-
| 200 | produtos retornados com sucesso
| 400 | campos inválidos
| 401 | não autorizado
| 403 | não autorizado

----

### Alterar Produto

`PUT` /wholecake/api/produto/{id}

**Campos da Requisição**

| campo | tipo | obrigatório | descrição 
|-------|------|:-------------:|---
|produto_id | int | sim | o id do produto
|nome | texto | não | o nome do produto
|valor_unitario | float | não | o valor unitário do produto

**Exemplo de Payload**

```js
{
    produto_id: 1,
    nome: 'Brigadeiro de Morango',
    valor_unitario: 2.00
}
```

**Códigos de Respostas**

| código | descrição
|-|-
| 200 | o produto existe e foi atualizado com sucesso
| 400 | campos inválidos
| 401 | não autorizado
| 403 | não autorizado
| 404 | não existe produto com o id informado

----

### Pesquisar Produto por Id

`GET` /wholecake/api/produto/{id}

**Campos da Requisição**

| campo | tipo | obrigatório | descrição 
|-------|------|:-------------:|---
|produto_id | int | sim | o id do produto
**Exemplo de Payload**

```js
{
    produto_id: 2
}
```

**Exemplo de corpo de resposta**

```js
{
    nome: 'Bolo de Prestígio',
    valor_unitario: 100.00
}
```

**Códigos de Respostas**

| código | descrição
|-|-
| 200 | o produto existe e foi retornado com sucesso
| 400 | campos inválidos
| 401 | não autorizado
| 403 | não autorizado
| 404 | não existe produto com o id informado

----

### Pesquisar Produto por Nome

`GET` /wholecake/api/produto/{nome}

**Campos da Requisição**

| campo | tipo | obrigatório | descrição 
|-------|------|:-------------:|---
|nome | texto | sim | o nome do produto

**Exemplo de Payload**

```js
{
    nome: 'Brigadeiro'
}
```

**Exemplo de corpo de resposta**

```js
{
    nome: 'Brigadeiro',
    valor_unitario: 1.50
}
{
    nome: 'Brigadeiro de Morango',
    valor_unitario: 2.00
}
```

**Códigos de Respostas**

| código | descrição
|-|-
| 200 | o produto existe e foi retornado com sucesso
| 400 | campos inválidos
| 401 | não autorizado
| 403 | não autorizado
| 404 | não existe produto com o nome informado

----
