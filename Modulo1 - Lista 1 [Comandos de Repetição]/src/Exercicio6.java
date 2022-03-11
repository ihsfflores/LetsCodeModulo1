import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner ssi = new Scanner(System.in);

        int[] idade = new int[20];
        int somaIdade = 0;
        int somaIdadeAnterior = 0;

        int i = 0;
        int j = 0;

        for (i = 0; i <= 19; i++) {
            System.out.println("Qual a idade da pessoa " + i + "?");
            idade[i] = ssi.nextInt();
        }

        somaIdade = idade[0] + idade[1] + idade [2] + idade [3] + idade [4] + idade [5] + idade [6] + idade [7] + idade [8] + idade [9] + idade [10] + idade [11] + idade [12] + idade [13] + idade [14] + idade [15] + idade [16] + idade [17] + idade [18] + idade [19];

        System.out.println("A soma das idades é: " + somaIdade);

    }
}
