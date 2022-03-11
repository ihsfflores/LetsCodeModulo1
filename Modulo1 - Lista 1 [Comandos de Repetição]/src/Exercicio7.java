import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float[] idade = new float[20];
        float somaIdade = 0;
        float mediaIdade = 0;

        for (int i = 0; i<= 19; i++){
            System.out.println("Qual a idade da pessoa " + i + "?");
            idade[i] = sc.nextFloat();
            somaIdade = somaIdade + idade[i];

        }

        mediaIdade = somaIdade / 20;

        System.out.println("A media dos pesos das 20 pessoas é: " + mediaIdade);



    }

}
