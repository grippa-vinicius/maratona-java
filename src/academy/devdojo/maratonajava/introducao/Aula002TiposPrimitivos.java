package academy.devdojo.maratonajava.introducao;

public class Aula002TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean

        int idade = (int) 100000000000L; //Cast - Força um tipo de uma variável em outra, mesmo que ultrapasse o valor
        long numeroGrande = 1000000L;
        double salarioDouble = 2000.0;
        float salarioFloat = 2500.0F;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'A';

        String nome = "Goku";

        System.out.println("A idade é " + idade);
        System.out.println(numeroGrande);
        System.out.println(salarioDouble);
        System.out.println(salarioFloat);
        System.out.println(idadeByte);
        System.out.println(idadeShort);
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println(caractere);
        System.out.println("Oi, meu nome é " + nome);
    }
}
