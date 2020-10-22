package solution;

public class bubbleSort {
    public void sort(int[] arr){
        int tmp = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j =0; j< arr.length -1; j++){
                if(arr[j] > arr[j + 1]){
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }

//            for (int e : arr){
//                System.out.printf("%d ", e);
//            }
//            System.out.println();
        }
    }
    public void reverse(int[] arr){
        int tmp = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = arr.length - 1; j > 0; j--){
                if(arr[j] > arr[j -1]){
                    tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }
            }
        }
    }
}
