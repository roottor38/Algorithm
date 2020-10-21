package solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class standInLine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] info = new int[num];
        ArrayList<Integer> arr = new ArrayList<>(4);
        String[] str = br.readLine().split(" ");
        for (int i = 0; i < num; i++) {

            info[i] = Integer.parseInt(str[i]);
        }
        for(int i = num; i > 0; i--) {
            arr.add(info[i-1], i);
        }

        for(int i = 0 ; i < num; i++){
            System.out.printf("%d ", arr.get(i));
        }
    }
}
