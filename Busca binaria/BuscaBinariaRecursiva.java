import javax.swing.JOptionPane;

public class BuscaBinariaRecursiva {
    // Função de pesquisa binária recursiva
    public static boolean binarySearch(int[] arr, int key, int left, int right) {
        if (left > right) {
            return false;
        }
        
        int mid = left + (right - left) / 2;

        if (arr[mid] == key) {
            return true; // Key found
        } else if (arr[mid] < key) {
            return binarySearch(arr, key, mid + 1, right); // Pesquise na metade direita
        } else {
            return binarySearch(arr, key, left, mid - 1); // Pesquise na metade esquerda
        }
    }

    public static void main(String args[]) {
        int iVetor[] = new int[] {10, 20, 30, 40, 50, 60};
        int iK;

        iK = Integer.parseInt(JOptionPane.showInputDialog("Digite a chave de busca:"));

        // Chama toda a função de busca binária e exibe o resultado
        boolean found = binarySearch(iVetor, iK, 0, iVetor.length - 1);
        if (found) {
            JOptionPane.showMessageDialog(null, "Chave encontrada.");
        } else {
            JOptionPane.showMessageDialog(null, "Chave não encontrada.");
        }
    }
}