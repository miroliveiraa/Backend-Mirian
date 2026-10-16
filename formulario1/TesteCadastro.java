import java.util.Scanner;

public class TesteCadastro{
    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome de usuário: ");
        String username = sc.nextLine();

        System.out.println("Digite sua data de nascimento: ");
        String nascimento = sc.nextLine();

        System.out.println("Digite seu email: ");
        String email = sc.nextLine();


        Cadastro cadastro = new Cadastro(username, nascimento, email);

        try {
            cadastro.validarCadastro();

            System.out.println("\nCadastro efetuado com sucesso!");

        } catch (IllegalArgumentException e) {
            System.out.println("\nErro no cadastro: " + e.getMessage());
        }

        sc.close();
    }
}