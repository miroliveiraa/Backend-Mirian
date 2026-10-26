public class Main{
    public static void main(String[] args){
        PilhaEncadeada p = new PilhaEncadeada();
        p.empilhar(5);
        p.empilhar(7);
        p.imprimir();
        p.desempilhar();
        p.imprimir();
    }
}