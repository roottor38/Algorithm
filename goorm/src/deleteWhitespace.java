import java.io.*;

/*

이 문제는 입력된 문자열에서 공백을 제거하여 출력하는 프로그램을 작성하는 것 입니다.

예를 들어 'This is Sparta !' 가 입력 되었다면 'ThisisSparta!'가 출력되도록 하면 되는 것 입니다.
 */
public class deleteWhitespace {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        input = input.replaceAll(" ", "");
        System.out.println(input);
        br.close();

    }

}
