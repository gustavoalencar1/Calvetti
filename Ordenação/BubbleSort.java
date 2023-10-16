public class BubbleSort {
    public static void main(String[] args) {
        int[] iVet = {64, 34, 25, 12, 22, 11, 90};

        int iA, iB, iT;
        for (iA = 1; iA < iVet.length; iA++) {
            for (iB = iVet.length - 1; iB >= iA; iB--) {
                if (iVet[iB - 1] > iVet[iB]) {
                    iT = iVet[iB - 1];
                    iVet[iB - 1] = iVet[iB];
                    iVet[iB] = iT;
                }
            }
        }

        // Printing the sorted array
        for (int i : iVet) {
            System.out.print(i + " ");
        }
    }
}
