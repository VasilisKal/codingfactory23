package gr.aueb.cf.ch6;

/**
 * Update the elements of an array
 */
public class ReplaceWithMethod {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5};
        upscaleByOne(arr);
        printArray(arr);

    }

    public static void upscaleByOne(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 1;
        }
    }

    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
