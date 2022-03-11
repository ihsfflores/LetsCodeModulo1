import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        int[] numero = new int[20];
        int contagem = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numero.length; i++){
            System.out.println("Digite um numero: ");
            numero[i] = sc.nextInt();

            if (numero[i] > 8){
                contagem = contagem + 1;
            } else {
                contagem = contagem;
            }


        }
        System.out.println("Você digitou " + contagem + " numeros maiores de 8!");



    }


}
