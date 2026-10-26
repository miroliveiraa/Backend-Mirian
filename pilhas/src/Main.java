public class Main{
    public static void main(String[] args){
        PilhaEstatica p = new PilhaEstatica();
        p.empilhar(5);
        p.imprimir();
        p.empilhar(7);
        p.imprimir();
        System.out.println("Topo: " + p.topo());
        p.empilhar(2);
        p.imprimir();
        p.desempilhar();
        System.out.println("Topo: " + p.topo());

    }
}