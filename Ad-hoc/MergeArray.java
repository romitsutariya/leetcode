
/**
 * Program to merge two sorted arry
 * @author Romit Sutariya
 */
import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 10, 14 };
        int[] arr2 = { 4, 5, 6, 7, 9, 13 };
        int[] result = new int[arr1.length + arr2.length];

        int l = 0, r = 0, n = 0, llen = arr1.length, rlen = arr2.length;
        while (l < llen && r < rlen) {
            if (arr1[l] < arr2[r]) {
                result[n] = arr1[l];
                l++;
            } else {
                result[n] = arr2[r];
                r++;
            }
            n++;
        }

        while (l < llen) {
            result[n] = arr1[l];
            l++;
            n++;
        }

        while (r < rlen) {
            result[n] = arr2[r];
            r++;
            n++;
        }

        System.out.println(Arrays.toString(result));

    }
}
