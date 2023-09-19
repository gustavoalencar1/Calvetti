import java.util.Scanner;

public class Ex66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vetor = new double[20];

        System.out.println("Digite os elementos do vetor:");

        for (int i = 0; i < 20; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextDouble();
        }

        // Chamada do método de ordenação por seleção
        selectionSort(vetor);

        // Exibindo o vetor ordenado em ordem decrescente
        System.out.println("Vetor ordenado em ordem decrescente:");
        for (int i = 0; i < 20; i++) {
            System.out.print(vetor[i] + " ");
        }

        scanner.close();
    }

    public static void selectionSort(double[] vetor) {
        int n = vetor.length;
        
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] > vetor[maxIndex]) {
                    maxIndex = j;
                }
            }
            
            if (maxIndex != i) {
                // Troca os elementos se estiverem fora de ordem
                double temp = vetor[i];
                vetor[i] = vetor[maxIndex];
                vetor[maxIndex] = temp;
            }
        }
    }
}