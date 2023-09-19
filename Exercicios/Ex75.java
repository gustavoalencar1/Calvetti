import java.util.Scanner;

public class Ex75 {
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

        // Chamada do método de ordenação Quick-Sort
        quickSort(vetor, 0, tamanho - 1);

        // Exibindo o vetor ordenado em ordem crescente
        System.out.println("Vetor ordenado em ordem crescente:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }

        scanner.close();
    }

    public static void quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int indicePivot = particionar(vetor, inicio, fim);

            // Recursivamente ordena as duas metades
            quickSort(vetor, inicio, indicePivot - 1);
            quickSort(vetor, indicePivot + 1, fim);
        }
    }

    public static int particionar(int[] vetor, int inicio, int fim) {
        int pivot = vetor[fim];
        int i = (inicio - 1);

        for (int j = inicio; j <= fim - 1; j++) {
            if (vetor[j] < pivot) {
                i++;
                trocar(vetor, i, j);
            }
        }

        trocar(vetor, i + 1, fim);
        return (i + 1);
    }

    public static void trocar(int[] vetor, int i, int j) {
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }
}
