import java.io.*;
public class autoDoor {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] input = new String[num];
        Double result = 0.0;


        for(int i =0; i < num; i++){
            input = br.readLine().split(" ");
            System.out.println(String.format("%.2f", Math.sqrt(Double.parseDouble(input[0])*2/Double.parseDouble(input[1]))*Double.parseDouble(input[2])));
        }
    }
}
