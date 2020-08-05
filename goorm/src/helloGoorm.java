import java.io.*;
public class helloGoorm {
//    이 문제는 여러분이 입력하신 숫자만큼 'Hello Goorm !'을 출력하면 되는 기본적인 문제입니다.
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int num = Integer.parseInt(input);
        for(int i =0; i < num; i++){
            System.out.println("Hello Goorm !");
        }
        br.close();
    }

}
