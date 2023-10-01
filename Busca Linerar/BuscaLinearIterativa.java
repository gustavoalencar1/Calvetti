import javax.swing.JOptionPane;

public class BuscaLinearIterativa {
    public static void main(String args[]) {

        int iVetor[] = new int[] {5, 3, 2, 4, 6, 1};
        int iIndice = -1; // Inicializa o índice como -1, indicando que o elemento não foi encontrado
        int iK = Integer.parseInt(JOptionPane.showInputDialog("Digite a chave de busca:"));

        for (int i = 0; i < iVetor.length; i++) {
            if (iVetor[i] == iK) {
                iIndice = i;
                break; // Encerra o loop assim que o elemento for encontrado
            }
        }

        String sTitle = "Busca Linear Iterativa - Saída";
        String sIO = "O número " + iK;

        if (iIndice != -1)
            sIO += " está localizado no Índice " + iIndice + " do vetor.";
        else
            sIO += " não está localizado no vetor.";

        JOptionPane.showMessageDialog(null, sIO, sTitle, JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
