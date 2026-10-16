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
        this.nascimento = nascimento;
    }

    public boolean validarUsername() {
        if (this.username == null || this.username.trim().isEmpty()) {
            throw new IllegalArgumentException("Insira o nome de usuário!");
        }
        else if (this.username.length() <= 3){
            throw new IllegalArgumentException("O nome de usuário deve conter mais de 3 caracteres!");
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
                    "Data de nascimento inválida! Utilize dd.mm.aaaa."
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

    private void verificarMaioridade() {
        String[] partes = this.nascimento.split("\\.");

        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int ano = Integer.parseInt(partes[2]);

        java.time.LocalDate nascimento = java.time.LocalDate.of(ano, mes, dia);

        java.time.LocalDate hoje = java.time.LocalDate.now();

        if(nascimento.plusYears(18).isAfter(hoje)){
            throw new IllegalArgumentException("O usuário precisa ter pelo menos 18 anos!");
        }
    }




    public void validarCadastro(){
        validarUsername();
        validarEmail();
        validarNascimento(this.nascimento);
        verificarMaioridade();

    }





}