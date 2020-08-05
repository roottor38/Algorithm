import java.io.*;
public class hexadecimal {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Integer num = Integer.parseInt(input);

        System.out.println(Integer.toHexString(num));
    }
}
