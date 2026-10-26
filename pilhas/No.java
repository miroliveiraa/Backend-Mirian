public class No {

    private int valor;
    private No proximo;

    public No(int valor){
        this.valor = valor;
    }

    public void setProximo (No proximo){
        this.proximo = proximo;
    }

    public No getProximo(){
        return this.proximo;
    }

    public int getValor(){
        return this.valor;
    }
}