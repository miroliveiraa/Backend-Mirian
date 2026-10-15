# Objetivo: 

→ Criar um formulario que insere dados de cadastro: nome, email, data de nascimento etc.

→ Validação desses campos (se email precisa conter um @, se nome não está vazio, se data de nascimento so tem número e fazer dia, mes e ano separados para verficar a maioridade do usuario).

→ Campos invalidos especificando qual erro e mostrando a invalidação, caso valido efetuar cadastro.


## Resolução:

Inicialmente, fiz a coleta dos dados(nome de usuario, data de nascimento e email) usando o Scanner e testei.
Após funcionar, criei uma classe Cadastro para melhor organização do código. Implementei os métodos de validação do nome de usuário e email, antes de alterar, a data de nascimento estava em int, mas como precisaria fazer a verificação s