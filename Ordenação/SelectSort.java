public class SelectSort {
    public static void main(String[] args) {
        // Your main code here
        int[] array = {64, 25, 12, 22, 11};
        OrdenaçãoSeleçãoInt(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void OrdenaçãoSeleçãoInt(int iVet[]) {
        int iA, iB, iC;
        int iT;

        for (iA = 0; iA < iVet.length - 1; iA++) {
            iC = iA;
            iT = iVet[iA];

            // Find the index of the minimum element in the unsorted part of the array
            for (iB = iA + 1; iB < iVet.length; iB++) {
                if (iVet[iB] < iT) {
                    iC = iB;
                    iT = iVet[iB];
                }
            }

            // Swap the minimum element with the current element (iA)
            int temp = iVet[iA];
            iVet[iA] = iVet[iC];
            iVet[iC] = temp;
        }
    }
}
