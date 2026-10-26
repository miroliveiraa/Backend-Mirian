# Estudo de Pilhas


Uma pilha é uma coleção de elementos na qual todas as inserções e remoções acontecem em uma única 
extremidade, chamada topo.

O princípio é o **LIFO — Last In, First Out**: o último elemento a entrar é o primeiro a sair.

A analogia clássica é uma pilha de pratos: você só consegue colocar ou retirar um prato no alto da 
pilha. O prato que está embaixo só sai depois que todos os de cima forem removidos.


## Operações Essenciais:

- empilhar() - inserir elementos.
- desempilhar() - remover elementos e retornar.
- topo() - retornar topo sem removê-lo.
- estaVazia() - verificar se a pilha está vazia.
- estaCheia() - verificar se a pilha está cheia.
- obterTamanho() - retornar a quantidade de elementos.



## 1 -> Pilha Estática:

Uma estrutura de dados estática tem as seguintes características:

• **Tamanho fixo:** O espaço de memória é reservado de uma só vez. Se você definir capacidade para 
100 elementos, ela sempre usará (ou poderá usar) espaço para 100, mesmo que você guarde apenas 5.

• **Alocação sequencial:** Os dados costumam ser alocados em blocos contínuos e sequenciais na 
memória RAM.

• **Acesso rápido:** Como o computador sabe exatamente o tamanho de cada elemento e onde o bloco 
começa, o acesso a uma posição específica é instantâneo (tempo constante).

• **Rigidez:** Se a quantidade de dados ultrapassar o limite estabelecido, ocorre um erro de estouro 
de capacidade (overflow). Se o espaço alocado for grande demais e não usado, gera desperdício de 
memória.


Dessa forma, o primeiro passo seria criar o arquivo de teste de execução e o arquivo onde criaremos os 
métodos. Sendo eles, respectivamente: o 'Main' e  o 'PilhaEstatica'.

### Métodos:

Iniciamos no PilhaEstatica com a inserção do vetor valores, que representa a pilha, e do topo, que 
é a extremidade usada para acessar os dados.

### Método Construtor

Inserimos o método especial construtor, definindo a variável topo como -1. Isso se dá porque 
variável topo é, na verdade, uma variável que armazena as posições dos elementos, porém só acessamos 
o topo, logo, armazena a posição do topo especificamente, começando da posição 0 por padrão. Porém, 
como a pilha ainda não foi criada, então a posição de seu topo é = -1. 

### Método isVazia():

Observando esse fato, o segundo método criado foi o isVazia(), é um método do tipo booleano para 
facilitar os if's de verificação dos outros métodos, ele retorna se a afirmação 'variável topo
= -1' é verdadeira ou falsa.

### Método empilhar():

O método empilhar é do tipo void, pois não há necessidade de se retornar nada, apenas inserir o 
novo elemento na pilha, com parâmetro 'int valor', para receber o valor que é desejado inserir. 
Antes de empilhar, é necessário verificar se a pilha está cheia, porém ainda não temos o método 
para verificar isso, então, usaremos se a variável topo é igual a 'this.valores.length-1' ou seja, 
o tamanho do vetor valores -1. O motivo do -1 é que topo, por começar em 0, sempre estará em uma 
posição a menos que seu valor. 

Se essa afirmação for verdade, lançamos uma exceção "Pilha estourou!", que representa que não dá 
para inserir nenhum valor na pilha mais. Se não, o valor é inserido na posição topo + 1, ou, como 
no código, ++this.topo.

### Método imprimir():

Tipo void, não retorna nada. Faz a verificação se a pilha está vazia, se sim, imprime essa informação
na tela, se não, entra em um for onde percorre todos os elementos a partir da primeira posição (0) e 
vai incrementando enquanto ser menor ou igual a topo, durante o percorrimento, o valor nessa posição
é impresso na tela com um 'println'.



