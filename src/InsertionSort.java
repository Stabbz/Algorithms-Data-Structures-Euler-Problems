/**
 * Created by Damyan Damyanov <damyan.damyanov@scalefocus.com> on 11/23/15.
 */
public class InsertionSort {

    public static int[] sort(int[] arr) {

        for (int f = 0; f < arr.length-1; f++) {
            int temp = arr[f+1];
            int b = f;
            while (temp < arr[b]) {
                arr[b+1] = arr[b];
                arr[b] = temp;
                b--;
            }
        }

        return arr;
    }
}
