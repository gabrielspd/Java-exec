public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double SalarioMinimo = 2500; // cuidado com  = 2.500 correto é 2500
        double SalarioMinimo = 2500.33; //


    }
}

public class TipoDados {
    public static void main (String[] args) {
        byte idade = 100;
        short ano = 2024;
        int cep = 50500500; // se começar com zero talvez possa ser inserido errado
        long cpf = 99899987820L; // precisa terminar com L e se começar com zero talvez possa ser inserido errado
        float pi = 3.14F; // precisa ter um F no final
        double salario = 1275.33;

    }
}


// constante

final double VALOR_DE_PI = 3.14; // o final faz garantir que a variavel não pode ser alterada
double VALOR_DE_PI = 10;

