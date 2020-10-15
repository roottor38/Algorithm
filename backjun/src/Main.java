import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
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

        for (int e : arr
             ) {
            System.out.print(e+"  " );
        }






    }

}
