public class Exercicio2 {
    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int resultado = 1;

        for (int i = 0; i <= 14; i++) {
            int anterior = resultado;
            resultado = resultado + numeros[i];
            System.out.println(anterior + " + " + numeros[i] + " = " + resultado);
        }
    }
}
