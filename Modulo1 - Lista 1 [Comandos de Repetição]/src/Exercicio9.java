import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

       String[] nome = new String[10];
       int[] idade = new int[10];
       int idadeMenor = 1000;
       String nomeMenor = "";

       Scanner sc = new Scanner(System.in);

       for (int i = 0; i <= 9; i++){
           System.out.println("Qual o nome da pessoa " + (i + 1) + "? ");
           nome[i] = sc.next();

           System.out.println("Qual a idade da pessoa " + (i + 1) + "? ");
           idade[i] = sc.nextInt();

           if (idade[i] < idadeMenor){
               idadeMenor = idade[i];
               nomeMenor = nome[i];

           }

       }

        System.out.println("A menor idade é a: " + nomeMenor + " com a idade de " + idadeMenor + " anos!");

    }


}
