package solution;

import java.util.ArrayList;

public class quickSort {
    public static void sort(ArrayList<Integer> arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int left = start + 1, right = end;
        int pivot = start;
        int tmp = 0;
        while (left <= right) {
            while (left <= right && arr.get(pivot) >= arr.get(left)) {
                left++;
            }
            while (right >= left && arr.get(pivot) <= arr.get(right)) {
                right--;
            }


            if (left >= right && right != pivot) {
                tmp = arr.get(right);
                arr.set(right, arr.get(pivot));
                arr.set(pivot, tmp);
            } else if(right > left){
                tmp = arr.get(right);
                arr.set(right, arr.get(left));
                arr.set(left, tmp);
            }
        }
        System.out.println(arr);
        sort(arr, start, right - 1);
        sort(arr, right + 1, end);
    }
}
