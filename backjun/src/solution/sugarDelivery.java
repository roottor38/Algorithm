package solution;

import java.io.*;
public class sugarDelivery {

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sugar = Integer.parseInt(br.readLine());
        int answer = 0;
        while (sugar > 0){
            if(sugar % 5 == 0 ){
                sugar -= 5;
                answer++;
            }else if(sugar % 3 == 0){
                sugar -= 3;
                answer++;
            }else  if (sugar > 5){
                sugar -= 5;
                answer++;
            }else{
                answer = -1;
                break;
            }

        }
        System.out.println(answer);
    }
}
