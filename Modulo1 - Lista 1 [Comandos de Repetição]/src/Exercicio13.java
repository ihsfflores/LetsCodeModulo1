import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        int[] numeros = new int[20];
        int maior = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++){

            System.out.println("Digite um numero: ");
            numeros[i] = sc.nextInt();

            if (numeros[i] <= 100 && numeros[i] >= 0) {
                maior = maior + 1;

            } else {
                maior = maior;
            }

            System.out.println("Digitou " + maior + " numeros entre 0 e 100!");

        }



    }


}
