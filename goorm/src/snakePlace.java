/*
뱀이 지나간 자리
뱀은 모두가 알고있다시피 지그재그로 몸을 비틀며 이동한다. 여기서는 뱀이 지나간 자리를 시각화하여 출력해보자.

우선 뱀은 N행 M열의 평면에서 움직일 것이다. 뱀은  좌표에서 똬리를 틀고있는 상태이다.
여기서 출발하여 우측 끝까지 갔다가 벽을 만나면 그 아래로 2행만큼 이동한다. 그 후 다시 좌측 끝까지 갔다가 벽을 만나면 마찬가지로 2행만큼 아래로 이동한다.
이렇게 계속 움직이다가 더 이상 아래로 이동할 수 없으면 그 자리에서 멈춘다.
 */

import java.io.*;

public class snakePlace {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] num = new String[1];
        num = input.split(" ");
        int row = 0;
        int column = 0;
        row = Integer.parseInt(num[0]);
        column = Integer.parseInt(num[1]);
        String rl = "r";
        String result = "";
        String columns = "";
        for (int i = 0; i < row; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < column; j++) {
                    columns = columns + "#";
                }
                columns = columns + "\n";
            } else {
                if (rl.equals("r")) {
                    for (int j = 0; j < column - 1; j++) {
                        columns = columns + ".";
                    }
                    columns = columns + "#\n";
                    rl = "l";
                } else {
                    columns = columns + "#";
                    for (int j = 0; j < column - 1; j++) {
                        columns = columns + ".";
                    }
                    columns = columns + "\n";
                    rl = "r";
                }

            }
            result = result + columns;
            columns = "";

        }
        System.out.println(result);
    }

}
