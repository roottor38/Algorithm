import java.util.ArrayList;

public class SortStudy {

    public static void selectionSort(ArrayList<Integer> arr) {
        //최소 수를 정한 다음
        int tmp = 0;
        int min = 0;
        int index = 0;
        System.out.println("선택 정렬");
        System.out.println(arr);
        for (int i = 0; i < arr.size(); i++) {
            min = arr.get(i);
            for (int j = i + 1; j < arr.size(); j++) {
                if (min > arr.get(j)) {
                    min = arr.get(j);
                    index = j;
                }
            }
            if (min != arr.get((i))) {
                tmp = arr.get(i);
                arr.set(i, min);
                arr.set(index, tmp);
                System.out.println(arr);
            }

        }
    }

    public static void bubbleSort(ArrayList<Integer> arr) {
        int tmp = 0;
        System.out.println("버블 정렬");
        System.out.println(arr);

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size() - 1 && arr.get(j) > arr.get(j + 1); j++) {
                tmp = arr.get(j);
                arr.set(j, arr.get(j + 1));
                arr.set(j + 1, tmp);
            }
            System.out.println(arr);
        }

    }

    public static void insertSort(ArrayList<Integer> arr) {
        int tmp = 0;
        int key = 0;
        int index = 0;
        System.out.println("삽입 정렬");
        System.out.println(arr);
        for (int i = 1; i < arr.size(); i++) {
            index = i;
            for (int j = i - 1; j >= 0 && arr.get(index) < arr.get(j); j--) {
                tmp = arr.get(index);
                arr.set(index, arr.get(j));
                arr.set(j, tmp);
                index = j;
            }
            System.out.println(arr);

        }
    }


    public static void quickSort(ArrayList<Integer> arr, int start, int end) {
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
        quickSort(arr, start, right - 1);
        quickSort(arr, right + 1, end);
    }
    public static void merge(ArrayList<Integer> arr, int m, int middle, int n) {
        int i = m;
        int j = middle;
        int k = m;



    }


    public static void mergeSort(ArrayList<Integer> arr) {






    }


    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(5);
        arr.add(1);
        arr.add(8);
        arr.add(7);
        arr.add(6);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(9);
        //selectionSort(arr);
        //bubbleSort(arr);
        //insertSort(arr);
        //quickSort(arr, 0, arr.size() - 1);
        mergeSort(arr);


    }

}
