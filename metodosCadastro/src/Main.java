import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        Metodos novoCad = new Metodos();
        novoCad.Cadastrar(sc);
        novoCad.Listar();
        novoCad.Deletar();
        novoCad.Listar();

        sc.close();


    }
}