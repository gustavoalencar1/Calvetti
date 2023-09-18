public class CalculoFatorial {
    public static int Fatorial(int iN) {
        if (iN <= 1)
            return 1;
        else
            return iN * Fatorial(iN - 1);
    }

    public static void main(String[] args) {
        int iNumero = 8;
        int iFatorial = Fatorial(iNumero);
        System.out.println("O fatorial de " + iNumero + " é " + iFatorial);
    }
}