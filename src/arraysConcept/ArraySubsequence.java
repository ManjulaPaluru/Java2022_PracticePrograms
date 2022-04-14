package arraysConcept;

public class ArraySubsequence {
    public static void main(String[] args) {
        int a[] = new int[]{1, 2, 3, 4, 5, 6};
        int b[] = new int[]{3, 4};

        // T R U E - Conditions
        assert isSubSequentArray(a, b); // true
        assert isSubSequentArray(b, a); // true
        assert isSubSequentArray(a, a); // true
        assert isSubSequentArray(a, new int[]{3}); // true
        assert isSubSequentArray(a, new int[]{3, 4}); // true
        assert isSubSequentArray(a, new int[]{5, 6}); // true

        // F A L S E - Conditions
        assert !isSubSequentArray(a, new int[]{3, 4, 6}); // false
        assert !isSubSequentArray(a, new int[]{0}); // false
        assert !isSubSequentArray(a, new int[]{7}); // false
    }

    /**
     * What's subsequent? b <= a? like size and elements can they be exact match
     *
     * @param a - Array 1 to be compared with @param b
     * @param b - Array 2 to be compared with @param a
     * @return true, if it's subsequent, otherwise false
     */
    private static boolean isSubSequentArray(int[] a, int[] b) {
        System.out.println("##############################################");
        if(a == b) {
            System.out.println("Same array is passed!!!");
            return true;
        }
        int[] src = a, trg = b;
        if (a.length > b.length) {
            src = b;
            trg = a;
        }
        int i = 0, j = 0;
        for (; i < src.length; i++) {
            for (; j < trg.length; j++) {
                if (src[i] == trg[j]) {
                    j++;
                    break;
                } else if (i > 0) {
                    System.out.println("Consecutive element not matching");
                    return false;
                }
            }
            if (i <= src.length - 1 && j == trg.length && src[i] != trg[j-1]) {
                System.out.println("Target array is exhausted, but source array is not completed");
                return false;
            }
        }
        if (i == src.length && j <= trg.length) {
            return true;
        } else {
            System.out.println("All elements of source array not completed, but target array is exhausted");
            return false;
        }
    }
}
