import java.io.*;


public class armsBalance {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] snum = input.split(" ");
        int[] num = new int[2];
        num[0] = Integer.parseInt(snum[0]);
        num[1] = Integer.parseInt(snum[1]);

        System.out.println(num[0]&num[1]);
        System.out.println(num[0]|num[1]);
        System.out.println(num[0]^num[1]);


    }
}
