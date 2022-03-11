import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {


        int[] entradas = new int[20];
        int ehPar = 0;
        int mod = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < entradas.length; i++) {

            System.out.println("Digite um numero: ");
            entradas[i] = sc.nextInt();
            mod = entradas[i] % 2;

            if (mod == 0) {
                ehPar = ehPar + 1;

            } else {
                ehPar = ehPar;
            }

            System.out.println("Voce digitou " + ehPar + " numeros pares!");


        }




    }
}