package study;

import java.util.ArrayList;
//{7, 6, 1, 9, 2, 10, 8, 3, 5, 4}
/*
7, 6, 1, 9, 2, 10, 8, 3, 5, 4
7 6 1 4 2 10 8 3 5 9
7 6 1 4 2 5 8 3 10 9
7 6 1 4 2 5 3 8 10 9
3 6 1 4 2 5 7 8 10 9
3 2 1 4 6 5 7 8 10 9
3 2 1 4 6 5 7 8 10 9


 */
public class quickSort {
    public static void sort(int[] arr, int start, int end) {
        if(start >= end){
            return;
        }
        int pivot = start;
        int left = start + 1;
        int right = end;
        int tmp = 0;
        while (left <= right){
            while (left <= right && arr[pivot] >= arr[left]){
                left++;
            }
            while (left <= right &&arr[pivot] <= arr[right]){
                right--;
            }

            if(left >= right && pivot != right){
                tmp = arr[pivot];
                arr[pivot] = arr[right];
                arr[right] = tmp;
            }else if(left < right){
                tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
            }

        }
        for(int e : arr){
            System.out.printf("%d ", e);
        }
        System.out.println();
        sort(arr, start, right -1);
        sort(arr, right + 1, end);

    }
}
