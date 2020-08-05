import java.io.*;

public class asciiCode {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println((int)input.charAt(0));


    }
}

