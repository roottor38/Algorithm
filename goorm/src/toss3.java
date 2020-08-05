import java.io.*;
import java.util.ArrayList;


public class toss3 {
    public static void main(String[] args) throws Exception {
        // [!!주의!!] Function.compute 함수는 이미 구현되어있지만, 숨김처리되어 있습니다. 호출해서 테스트 해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> duplication = new ArrayList<>();
        int[] result = new int[arr.size()];


        for (String e : input.split(" ")) {
            arr.add(Integer.parseInt(e));
        }

        int tmp = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++){
                if(tmp == arr.get(j)){
                    duplication.add(j);
                }
            }
        }

        //System.out.println("Hello Goorm! Your input is " + Function.compute(1));
    }
}
