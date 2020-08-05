import java.io.*;
public class subString {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] num = br.readLine().split(" ");
        str = str.substring(Integer.parseInt(num[0])-1, Integer.parseInt(num[0])+Integer.parseInt(num[1])-1);
        System.out.println(str);
    }
}
