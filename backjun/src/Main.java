import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Integer[] input = new Integer[num];
        int ans = 0;
        for(int i = 0; i < num; i++){
            input[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(input);
        int left = 0; // 0, 음수
        int right = num -1; // 양수

        //0, 음수 처리
        for (; left < right; left += 2){
            if(input[left] < 1 && input[left+1] < 1){
                ans += (input[left] * input[left+1]);
            }else {
                break;
            }
        }
        // 1을 제외한 양수 처리
        for (; right > 0; right -= 2){
            if(input[right] > 1 && input[right-1] > 1){
                ans += (input[right] * input[right-1]);
            }else {
                break;
            }
        }
        // 1을 포함한 나머지 처리
        for (; right >= left; right--) {
            ans += input[right];
        }

        System.out.println(ans);


    }

}
