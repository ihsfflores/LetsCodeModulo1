import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

    int[] idade = new int[20];
    int qtdMaior = 0;

    Scanner sc = new Scanner(System.in);

    for (int i = 0; i <=19; i++){
        System.out.println("Qual a idade da pessoa " + (i + 1) + "? ");
        idade[i] = sc.nextInt();
        if (idade[i] >= 18) {
            qtdMaior = qtdMaior + 1;
        }
    }

    System.out.println(qtdMaior + " Pessoas cadastradas são maiores de idade!");

    }
}
