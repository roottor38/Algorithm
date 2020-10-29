package study;

/*
counting sort(계수 정렬)
수의 갯수를 세는 알고리즘
조건만 맞다면 퀵 정렬보다 빠름
계수 정렬은 범위 조건 한해서는 매우 빠른 알고리즘이다.
시간 복잡도는 O(n)

 */
public class countingSort {

    public void sort(int[] arr) {
        int[] rang = new int[5];

        for (int i : arr) {
            rang[i - 1]++;
        }
        int index = 0;
        for(int i = 0; i < 5; i++){
            if(rang[i] != 0){
                for(int j = 0; j < rang[i]; j++){
                    arr[index] = i+1;
                    index++;
                }
            }
        }

        for (int e : arr) {
            System.out.printf("%d ", e);
        }




    }

}
