package backJun;

import java.util.Arrays;
import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int Pnum = sc.nextInt();
	    int[] time = new int[Pnum];
	    
	    for(int i = 0; i<Pnum; i++) {
	    	time[i] = sc.nextInt();
	    }
	    
	    int answer = 0;
		int tmp = 0;
		Arrays.sort(time);
		for(int i = 0; i < time.length; i++) {
				tmp += time[i];
				answer += tmp;
		}
		sc.close();
		System.out.println(answer);
		
	    
	}

}
