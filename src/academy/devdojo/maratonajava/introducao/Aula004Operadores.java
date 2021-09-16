package academy.devdojo.maratonajava.introducao;

public class Aula004Operadores {
    public static void main(String[] args) {

        /*
            Operadores Aritméticos:
            Adição: +
            Subtração: -
            Multiplicação: *
            Divisão: /
         */

        int numero1 = 10;
        int numero2 = 20;
        double resultado = numero1 + numero2;

        System.out.println(resultado);

        // Resto de uma divisão: %
        int resto = 20 % 2;
        System.out.println(resto);

        /*
           Operadores Relacionais
           Menor: <
           Menor ou igual: <=
           Maior: >
           Maior igual: >=
           Igualdade: ==
           Diferente: !=

           SEMPRE RETORNAM VALORES BOOLEANOS
         */

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteVinte = 10 != 20;
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezDiferenteVinte);

        /*
            Operadores Lógicos
            E: &&
            Ou: ||
            Não: !
         */

        int idade = 35;
        float salario = 3500F;

        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario > 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMenorQueTrinta);


    }
}
