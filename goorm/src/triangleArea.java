import java.io.*;

/*
입력받은 밑변과 높이를 이용하여 삼각형의 넓이를 구하는 프로그램을 작성하십시오.
입력
밑변과 높이 순서대로 (정수형, 간격은 공백으로)
출력
삼각형의 넓이( 소수점 첫 번째 자리까지)
*/

public class triangleArea {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] num = new String[1];
        num = input.split(" ");
        Double height = Double.parseDouble(num[1]);
        Double area = Double.parseDouble(num[0]);

        System.out.println((height*area)/2);

    }
}
