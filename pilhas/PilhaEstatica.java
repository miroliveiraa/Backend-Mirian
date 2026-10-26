
public class PilhaEstatica {
    int[] valores;
    int topo;

    public PilhaEstatica(){
        this.topo = -1;
        this.valores = new int[10]; // valor fixo
    }

    public boolean isVazia(){
        return this.topo == -1;
    }

    public void empilhar(int valor){
        if(this.topo == this.valores.length-1){
            throw new RuntimeException("Pilha estourou!");
        }
        this.valores[++this.topo] = valor;
    }

    public void imprimir(){
        if(isVazia()){
            System.out.println("A pilha está vazia!");
        }
        for(int i=0; i<=this.topo; i++) {
            System.out.println(this.valores[i]);
        }
    }

    public int desempilhar(){
        if(isVazia()){
            throw new RuntimeException("A pilha está vazia!");
        }
        return this.valores[this.topo--];
    }

    public int topo(){
        if(isVazia()){
            throw new RuntimeException("A pilha está vazia!");
        }
        return this.valores[this.topo];
    }

}

