package backJun;

import java.util.Scanner;

public class Sort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		char[] carr = input.toCharArray();
		int[] arr = new int[carr.length];
		for(int i = 0; i < carr.length; i++) {
			arr[i] = carr[i] - '0';
		}
		
		int max, index = 0;
		int tmp = 0;
		String ans = "";
		for(int i = 0; i < arr.length; i++) {
			max = arr[i];
			for(int j = i+1; j < arr.length; j++) {
				if(max < arr[j]) {
					max = arr[j];
					index = j;
				}
			}
			ans += max;
			tmp = arr[i];
			arr[i] = max;
			arr[index] = tmp;
		}
		
		System.out.println(ans);
		
		
	}
}
