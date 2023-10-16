public class InsertSort {
    public static void main(String[] args) {
        int[] exampleArray = {5, 3, 2, 4, 6, 1};

        // Call the sorting method
        OrdenaçãoInserçãoInt(exampleArray);

        // Print the sorted array
        for (int i = 0; i < exampleArray.length; i++) {
            System.out.print(exampleArray[i] + " ");
        }
    }

    public static void OrdenaçãoInserçãoInt(int iVet[]) {
        int iA, iB;
        int iT;

        for (iA = 1; iA < iVet.length; iA++) {
            iT = iVet[iA];
            iB = iA - 1;
            while (iB >= 0 && iT < iVet[iB]) {
                iVet[iB + 1] = iVet[iB];
                iB--;
            }
        }
    }
}