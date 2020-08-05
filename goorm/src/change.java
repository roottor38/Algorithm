import java.io.*;

public class change {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int[] change = {500, 100, 50, 10};
        int[] changes = {0, 0, 0, 0};
        int money = 1000 - Integer.parseInt(input);
        String result = "";


        for (int i = 0; i < change.length; i++) {
            while (money >= change[i]){
                money = money - change[i];
                changes[i]++;
            }
        }


        for (int e : changes) {
            result = result + Integer.toString(e) + " ";
        }
        System.out.println(result);

    }
}
