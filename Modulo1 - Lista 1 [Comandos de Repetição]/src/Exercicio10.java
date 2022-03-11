import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int[] tabela = new int[10];
        int[] resultado = new int[10];

        System.out.println("Digite um numero: ");
        numero = sc.nextInt();

        for (int i = 1; i < tabela.length; i++){
            resultado[i] = tabela[i] * numero;
            System.out.println(tabela[i] + " x " + numero + " = " + resultado[i]);

        }



    }


}