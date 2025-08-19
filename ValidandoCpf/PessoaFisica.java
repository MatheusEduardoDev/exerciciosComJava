package contaFuncionario;

public class PessoaFisica {

    private String cfp;

    public String getCfp() {
        return cfp;
    }

    public void setCfp(String cfp) {
        this.cfp = cfp;
    }

    public static void valida(String cpf) {
        cpf = cpf.replaceAll("[^0-9]", "");
        if (cpf.length() == 11) {
            System.out.println("CPF valida !!!");
            System.out.println(cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-"
                    + cpf.substring(9, 11));
        } else {
            System.out.println("CPF INVALIDO");
        }
    }

    public static void main(String[] args) {
        PessoaFisica.valida("12155678911");
    }
}
