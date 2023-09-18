public class Ex1 {
    public static int calcularImparPositivo(int n) {
        if (n == 1) {
            return 1; // O 1º número ímpar positivo é 1.
        } else {
            // Chamada recursiva para encontrar o próximo número ímpar positivo.
            return calcularImparPositivo(n - 1) + 2;
        }
    }

    public static void main(String[] args) {
        int numero = 11; // Número desejado (11º número ímpar positivo).
        int resultado = calcularImparPositivo(numero);
        System.out.println("O " + numero + "º número ímpar positivo é: " + resultado);
    }
}
