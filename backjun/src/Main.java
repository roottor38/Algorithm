import study.countingSort;
import study.quickSort;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int num = Integer.parseInt(br.readLine());
//        Integer[] weight = new Integer[num];
//        int index = 0;
//        for (String e : br.readLine().split(" ")) {
//            weight[index] = Integer.parseInt(e);
//            index++;
//        }
//
//        System.out.println("test");
//        Arrays.sort(weight, Collections.reverseOrder());
//        int ans = 0;
//        int tmp = 0;
//
//
//        for (int i = 1; i < 1000000 ; i++) {
//            tmp = i;
//            for (int j = 0; j < num; j++){
//                if(tmp >= weight[j]){
//
//                }
//            }
//        }
//
//        System.out.println(ans);
        countingSort test = new countingSort();
        int[] arr = {1, 3, 4, 2, 1, 3, 2, 4, 5, 3, 2, 1, 1, 2, 4, 3, 2, 3, 2, 4, 5, 3, 5, 1, 5};
        //int[] arr = {1, 2, 3, 5, 5};
        test.sort(arr);
    }


}
