package arrays;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int[] a = {8, 1, 0, 2, 1, 0, 3};

        int j = 0; // Pointer for zeroes   change j to right most to move zeros to lhs
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) { // If the element is not zero
                // Swap a[i] and a[j] to move non-zero element to the front
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++; // Move j to the next zero j-- fot zero in lhs
            }
        }

        // Print the array
        for (int i = 0; i < a.length; i++) {
            System.out.print("\t" + a[i]);
        }
    }
}
