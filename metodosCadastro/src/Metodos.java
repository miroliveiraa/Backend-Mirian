import java.util.Scanner;

public class Metodos {
    private String username;
    private String email;
    private String senha;
    private String confSenha;

    public Metodos() {}

    public void Cadastrar(Scanner sc){

        System.out.println("Digite um nome de usuário: ");
        this.username = sc.nextLine();

        System.out.println("Digite seu email: ");
        this.email = sc.nextLine();

        System.out.println("Digite sua senha: ");
        this.senha = sc.nextLine();

        System.out.println("Confirmar senha: ");
        this.confSenha = sc.nextLine();

        System.out.println("Cadastro efetuado com sucesso!");

    }

    public void Listar(){
        System.out.println("---Ficha de Cadastro---");
        System.out.println("Nome de usuário: "+ username);
        System.out.println("Email: " + email);
        System.out.println("Senha: "+ senha);
    }

    public void Deletar(){
        this.username = null;
        this.email = null;
        this.senha = null;
        this.confSenha = null;
    }


}
