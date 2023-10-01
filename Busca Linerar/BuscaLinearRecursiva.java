import javax.swing.JOptionPane;

public class BuscaLinearRecursiva {
    public static void main(String args[]) {

        int iVetor[] = new int[] {5, 3, 2, 4, 6, 1};
        int iIndice, iK;
        iK = Integer.parseInt(JOptionPane.showInputDialog("Digite a chave de busca:"));
        iIndice = busca(iVetor, 0, iK);

        String sTitle = "Busca Linear recursiva - Saída";
        String sIO = "O número " + iK;

        if (iIndice < iVetor.length)
            sIO += " está localizado no Índice " + iIndice + " do vetor.";
        else
            sIO += " não está localizado no vetor.";

        JOptionPane.showMessageDialog(null, sIO, sTitle, JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    public static int busca(int iV[], int iI, int iK) {
        if (iI <= iV.length - 1 && iK != iV[iI])
            return busca(iV, iI + 1, iK);
        return iI;
    }
}
