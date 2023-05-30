package gr.aueb.cf.ch6;

import java.awt.dnd.DropTarget;

import static java.lang.Math.abs;

public class CircularRotationApp {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] rotated = doCircularRightShiftBy(arr, 1 );
        print(rotated);
    }

    /**
     * Rotates the elements by an offset
     * @param arr the given array of integers
     * @param offset the rotated array, or null if the given array is null
     * @return
     */
    public static int[] doCircularRightShiftBy(int[] arr, int offset) {
        if (arr == null) return null;
        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[(i + offset) % arr.length] = arr[i];
        }
        return rotated;
    }

    public static int[] doCircularLeftShiftBy(int[] arr, int offset) {
        if (arr == null) return null;
        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[i] = arr[(i + offset) % arr.length];
        }
        return rotated;
    }

    public static void print(int[] arr) {
        if (arr == null) return;
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
