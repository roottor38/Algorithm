package solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Microwave {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int A = 0;
        int B = 0;
        int C = 0;
        int[] time = {300, 60, 10};
        int[] button= {0,0,0};

        if(T%10 != 0){
            System.out.println(-1);
        }else {
            int i = 0;
            while (T > 0) {
                if (T >= time[i]) {
                    T -= time[i];
                    button[i]++;
                } else {
                    i = i + 1;
                }
            }
            System.out.printf("%d %d %d", button[0], button[1], button[2]);
        }

    }


}
