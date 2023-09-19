import java.util.Scanner;

public class OrdenacaoVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];

        System.out.println("Digite os elementos do vetor:");

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Chamada do método de ordenação
        bubbleSort(vetor);

        // Exibindo o vetor ordenado
        System.out.println("Vetor ordenado:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }

        scanner.close();
    }

    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        boolean trocou;
        
        do {
            trocou = false;
            
            for (int i = 0; i < n - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    // Troca os elementos se estiverem fora de ordem
                    int temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                    trocou = true;
                }
            }
            
            n--;
        } while (trocou);
    }
}