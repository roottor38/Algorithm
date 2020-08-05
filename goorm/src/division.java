import java.io.BufferedReader;
import java.io.InputStreamReader;

public class division {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] snum = input.split(" ");
        int[] num = new int[2];
        num[0] = Integer.parseInt(snum[0]);
        num[1] = Integer.parseInt(snum[1]);
        System.out.println(Integer.toString(num[0]/num[1])+ " "+Integer.toString(num[0]%num[1]));

    }
}
