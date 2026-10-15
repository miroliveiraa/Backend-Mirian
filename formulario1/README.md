# Objetivo: 

→ Criar um formulario que insere dados de cadastro: nome, email, data de nascimento etc.

→ Validação desses campos (se email precisa conter um @, se nome não está vazio, se data de nascimento so tem número e fazer dia, mes e ano separados para verficar a maioridade do usuario).

→ Campos invalidos especificando qual erro e mostrando a invalidação, caso valido efetuar cadastro.


## Resolução:

Inicialmente, fiz a coleta dos dados(nome de usuario, data de nascimento e email) usando o Scanner e testei.
Após funcionar, criei uma classe Cadastro para melhor organização do código. Implementei os métodos de validação do nome de usuário e email.

Detalhe Importante: antes de alterar, a data de nascimento estava em int, mas como precisaria fazer a verificação se era numero ou não e separar dia.mes.ano, mudei para String.
Passei um bom tempo nisso, visto que fiz outra classe Data para passar esses dados separados, mas meu namorado (e instrutor de backend) me questionou sobre a necessidade e orientou fazer somente na classe Cadastro.
Dessa forma, passei grande parte do código da antiga classe Data para o método validarNascimento(), e depois criei o método para verificar a maioridade.

juntei todos esses métodos de validação em um só, o validarCadastro(), pois não queria ficar chamando os métodos um por um na função main.

Usei também o IllegalArgumentException para fazer as verificações, de modo a usar o try-catch na função main ao chamr o método de validarCadastro().