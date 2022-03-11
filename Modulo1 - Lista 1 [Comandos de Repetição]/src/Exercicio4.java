import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o seu nome? ");
        String nomeUsuario = scanner.nextLine();

        System.out.println("Fale um numero ");
        int qtd = scanner.nextInt();

        for (int i = 1; i <= qtd; i++) {
            System.out.println(nomeUsuario);
        }
    }

}
