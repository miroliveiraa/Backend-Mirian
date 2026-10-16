# Objetivos:

→ Criar os seguintes métodos: cadastrar, listar e deletar para usar em um sistema de cadastro.

→ Adicionar métodos de Validação e inicializar o programa com um Menu

## Resolução:

### passo 1 → Criação dos arquivos: Main e Metodos.

O arquivo Main é criado para conter a função principal do nosso código.

O arquivo Metodos para conter os metodos do sistema. Neste, insiro os atributos da classe, 
cujo são as variáveis referente aos dados que utilizaremos para o cadastro. A seguir, implementei 
o Construtor, porém, como gostaria que o método cadastro que fizesse a coleta e inserção dos dados nos
atributos, deixei ele vazio.

### passo 2 → Método Cadastrar()

O método cadastrar() contém a requisição dos dados e atribuição com o Scanner as variáveis correspondentes.

### passo 3 → Método Listar()

Apenas impressão dos dados coletados.

### passo 4 → Método Deletar()

Atribuição das variáveis a nulo.

### passo 5 → Método de Validação do cadastro.

```bash
Requisitos: impedir que um usuário cadastre-se com algum campo vazio, com um email sem @,
com o nome de usuário com menos de 3 caracteres, com senha e confirmar senha diferentes.
```
```bash
Extra: fazer a verificação todas as vezes em que o usuário digitar a tecla Enter para
mudar de campo.
```

#### Campos Vazios (Strings):

<table>
    <thead>
        <tr>
            <th>Método</th>
            <th>O que faz</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td><code>.isEmpty()</code></td>
            <td>Verifica se a string tem comprimento zero.</td>
        </tr>
        <tr>
            <td><code>.isBlank()</code></td>
            <td>Verifica se a string está vazia ou contém apenas espaços em branco.</td>
        </tr>
        <tr>
            <td><code>.trim()</code></td>
            <td>Remove espaços das extremidades.</td>
        </tr>
        <tr>
            <td><code>.strip()</code></td>
            <td>Remove espaços em branco Unicode das extremidades.</td>
        </tr>
    </tbody>
</table>
