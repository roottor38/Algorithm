import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class toss {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char[] arr = input.toCharArray();
        String result = "true";

        for(int i = 0; i < arr.length - 1; i++){
            if(Character.toString(arr[i]).equals("1")){
                for(int j = i+1; j < arr.length; j++){
                    if(!Character.toString(arr[j]).equals("2")){
                        result = "false";
                        break;
                    }
                }

            }
        }
        System.out.println(result);
    }
}
