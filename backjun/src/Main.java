import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] info = new int[num];
        int[] ans = new int[num];
        String[] str = br.readLine().split(" ");
        for (int i = 0; i < num; i++) {
            ans[i] = i+1;
            info[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(info);
        for(int i = 0; i < num; i++) {

        }






    }

}
