public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data(String nascimento) {
        String[] partes = nascimento.split("\\.");

        if (partes.length != 3) {
            throw new IllegalArgumentException(
                    "Formato inválido! Utilize dd.MM.aaaa."
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

        validar();
    }

    private void validar() {
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

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
}