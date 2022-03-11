import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int soma = 0;


        while (numero >= 0) {
            System.out.println("Digite um numento: ");
            numero = sc.nextInt();

            if (numero >=0) {
                soma = soma + numero;
            }
        }

        System.out.println("A soma dos numeros digitados é: " + soma);


    }

}
