import java.util.Scanner;

public class Ex69 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] vetor = new char[5];

        System.out.println("Digite os caracteres do vetor:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Caractere " + (i + 1) + ": ");
            vetor[i] = scanner.next().charAt(0);
        }

        // Chamada do método de ordenação por inserção
        insertionSort(vetor);

        // Exibindo o vetor ordenado em ordem crescente
        System.out.println("Vetor ordenado em ordem crescente:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor[i] + " ");
        }

        scanner.close();
    }

    public static void insertionSort(char[] vetor) {
        int n = vetor.length;
        
        for (int i = 1; i < n; i++) {
            char chave = vetor[i];
            int j = i - 1;
            
            // Move elementos do vetor[0..i-1] que são maiores que a chave
            // para uma posição à frente de sua posição atual
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            
            vetor[j + 1] = chave;
        }
    }
}