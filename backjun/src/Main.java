import study.quickSort;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Integer[] weight = new Integer[num];
        int index = 0;
        for (String e : br.readLine().split(" ")) {
            weight[index] = Integer.parseInt(e);
            index++;
        }

        System.out.println("test");
        Arrays.sort(weight, Collections.reverseOrder());
        int ans = 0;
        int tmp = 0;
        while (ans <= 1000000){
            ans++;
            tmp = ans;

            while (tmp > 0){
                for (int i=0;i < num && weight[i] <= tmp; i++) {
                    tmp -= weight[i];
                }
            }

        }
        System.out.println(ans);


    }


}
