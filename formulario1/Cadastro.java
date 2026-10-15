public class Cadastro{

    private String username;
    private String nascimento;
    private String email;
    private int dia;
    private int mes;
    private int ano;


    public Cadastro (String username, String nascimento, String email){
        this.username = username;
        this.email = email;
    }

    public boolean validarUsername() {
        if (this.username == null || this.username.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome de usuário inválido!");
        }
        return true;
    }

    public boolean validarEmail() {
        if (!this.email.contains("@")) {
            throw new IllegalArgumentException("E-mail inválido!");
        }
        return true;
    }

    private void validarNascimento(String nascimento) {
        String[] partes = nascimento.split("\\.");

        if (partes.length != 3) {
            throw new IllegalArgumentException(
                    "Formato inválido! Utilize dd.mm.aaaa."
            );
        }

        try {
            this.dia = Integer.parseInt(partes[0]);
            this.mes = Integer.parseInt(partes[1]);
            this.ano = Integer.parseInt(partes[2]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(
                    "A data deve conter apenas números e pontos."
            );
        }

        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("Mês inválido!");
        }

        if (ano < 1) {
            throw new IllegalArgumentException("Ano inválido!");
        }

        if (dia < 1 || dia > 31) {
            throw new IllegalArgumentException("Dia inválido!");
        }
    }




    public void validarCadastro(){
        validarUsername();
        validarEmail();
        validarNascimento();
    }





}