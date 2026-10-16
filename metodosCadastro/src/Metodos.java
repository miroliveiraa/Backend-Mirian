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

        validarCadastro();

        System.out.println("Digite seu email: ");
        this.email = sc.nextLine();

        validarCadastro();

        System.out.println("Digite sua senha: ");
        this.senha = sc.nextLine();

        validarCadastro();

        System.out.println("Confirmar senha: ");
        this.confSenha = sc.nextLine();

        validarCadastro();

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

    public void validarCadastro(){
        String[] campos = {username, email, senha, confSenha};

        for (String campo : campos) {
            if (campo == null || campo.isBlank()) {
                throw new IllegalArgumentException("Campo Inválido!");

            }


        }


    }

    public void tenteValidar(){
        try {
            validarCadastro();
            System.out.println("\nCadastro efetuado com sucesso!");

        } catch (IllegalArgumentException e) {
            System.out.println("\nErro no cadastro: " + e.getMessage());
        }

    }


}
