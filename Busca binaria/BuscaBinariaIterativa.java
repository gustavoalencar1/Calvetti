public class BuscaBinariaIterativa {
    public static int busca_binaria(int iVet[], int iK) {
        int iBaixo, iAlto, iMedio;
        iBaixo = 0;
        iAlto = iVet.length - 1;
        while (iBaixo <= iAlto) {
            iMedio = (iBaixo + iAlto) / 2;
            if (iK < iVet[iMedio])
                iAlto = iMedio - 1;
            else if (iK > iVet[iMedio])
                iBaixo = iMedio + 1;
            else
                return iMedio;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] iVet = {1, 3, 5, 7, 9, 11, 13, 15};
        int iK = 7;
        int result = busca_binaria(iVet, iK);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}