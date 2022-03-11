import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int resultado = 0;
        int numAtual = 0;
        int numAnterior = 0;

        System.out.println("Fale um numero: ");
        numAnterior = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println("Fale outro numero: ");
            numAtual = scanner.nextInt();

            resultado = numAnterior + numAtual;
            System.out.println("Somando da = " + resultado);

            numAnterior = resultado;

        }
    }
}
