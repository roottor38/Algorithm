package backJun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Coin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int k = sc.nextInt();
	    int[] coin = new int[n];
	    for(int i =0; i < n ;i++) {
	    	coin[i] = sc.nextInt();
	    }
	    
	    int answer = 0;
	    while(k!=0) {
	    	ArrayList<Integer> arr = new ArrayList<>();
	    	for(int i = 0; i < n ;i++) {
		    	if(coin[i] <= k) {
		    		arr.add(coin[i]);
		    	}
		    }
	    	Collections.reverse(arr);
	    	while(arr.get(0) <= k) {
	    		k -= arr.get(0);
	    		answer++;
	    	}
	    }
		sc.close();
		System.out.println(answer);
	}

}
