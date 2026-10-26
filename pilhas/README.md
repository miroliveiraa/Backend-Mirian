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

• **Alocação sequencial:** Os dados costumam ser alocados em blocos contínuos e sequenciais na memória RAM.

• **Acesso rápido:** Como o computador sabe exatamente o tamanho de cada elemento e onde o bloco 
começa, o acesso a uma posição específica é instantâneo (tempo constante).

• **Rigidez:** Se a quantidade de dados ultrapassar o limite estabelecido, ocorre um erro de estouro 
de capacidade (overflow). Se o espaço alocado for grande demais e não usado, gera desperdício de memória.