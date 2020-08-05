import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class toss2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String result = "true";
        ArrayList<Integer> arr = new ArrayList<>();

        for (String e : input.split(" ")) {
            arr.add(Integer.parseInt(e));
        }

        if (arr.size() != 6) {
            result = "false";
        }
        int tmp = arr.get(0);

        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) <= 0 && arr.get(i) >= 46){
                result = "false";
                break;
            }
        }

        for (int i = 1; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++){
                if(tmp == arr.get(j)){
                    result = "false";
                    break;
                }
            }
            if(tmp > arr.get(i)){
                result = "false";
                break;
            }else {
                tmp = arr.get(i);
            }
        }


        System.out.println(result);
    }
}