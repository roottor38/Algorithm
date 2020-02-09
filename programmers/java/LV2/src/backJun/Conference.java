package backJun;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Conference {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cn = sc.nextInt();
		int[][] arr = new int[cn][2];
		for (int i = 0; i < cn; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		sc.close();
		int tmp = 1;
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o2[1] == o1[1]) {
					return o1[0] -o2[0];
				}
				else return o1[1] - o2[1];
			}
		});

		int end = arr[0][1];
		for (int i = 0; i < arr.length-1; i++) {
			if (end <= arr[i + 1][0]) {
				end = arr[i + 1][1];
				tmp++;
			}

		}

		System.out.println(tmp);

	}
}
