package academy.devdojo.maratonajava.introducao;

public class Aula003TiposPrimitivosExercicio {
    /*
        Exercício Prático
        Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

        Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário <salario>, na data <data>
     */

    public static void main(String[] args) {
        String nome = "Vinícius";
        String endereco = "Rua Portugal, 660 - Parque Milênio - Descalvado/SP";
        float salario = 3500.00F;
        String dataRecebimento = "16/09/2021";

        System.out.println("Eu " + nome + ", morando no endereço " + endereco + " confirmo que recebi o salário de " + salario + ", na data " + dataRecebimento + ".");
    }
}
