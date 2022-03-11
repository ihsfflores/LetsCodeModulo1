import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o seu nome? ");
        String nomeUsuario = scanner.nextLine();

        for (int i = 0; i <= 9; i++) {
            System.out.println(nomeUsuario);
        }

    }
}
