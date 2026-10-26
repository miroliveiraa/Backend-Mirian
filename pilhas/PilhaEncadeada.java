public class PilhaEncadeada {
    No topo;

    public PilhaEncadeada(){}

    public boolean isVazia(){
        return this.topo == null;
    }

    public void empilhar(int valor){
        No novo = new No(valor);
        novo.setProximo(this.topo);
        this.topo = novo;
    }

    public int desempilhar(){
        if(isVazia()){
            throw new RuntimeException("A pilha está vazia!");

        }
        int temp = this.topo.getValor();
        this.topo = this.topo.getProximo();
        return temp;
    }

    public void imprimir(){
        if(isVazia()){
            throw new RuntimeException("A pilha está vazia!");
        }
        No proximo = this.topo;
        while(proximo != null){
            System.out.println(proximo.getValor());
            proximo = proximo.getProximo();

        }
    }

}
