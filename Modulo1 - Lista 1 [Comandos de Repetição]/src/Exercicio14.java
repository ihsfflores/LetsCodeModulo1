import java.util.Random;
import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {

        int[] numeros = new int[20];
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();

        int qtd0to100 = 0;
        int qtd101to200 = 0;
        int qtdAbove200 = 0;

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = aleatorio.nextInt(300);

            System.out.println(numeros[i]);

            if (numeros[i] >= 0 && numeros[i] <=100){
                qtd0to100 = qtd0to100 + 1;
            } else if (numeros [i] >= 101 && numeros[i] <=200) {
                qtd101to200 = qtd101to200 + 1;
            } else if (numeros[i] > 200) {
                qtdAbove200 = qtdAbove200 + 1;

            }

        }

        System.out.println("Numeros entre 0 e 100: " + qtd0to100);

        System.out.println("Numeros entre 101 e 200: " + qtd101to200);

        System.out.println("Numeros maior que 200: " + qtd101to200);


    }


}
