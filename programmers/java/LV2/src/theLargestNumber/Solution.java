package theLargestNumber;

import java.util.ArrayList;

public class Solution {
	
	public static String solution(int[] numbers) {
        String answer = "";
        ArrayList<char[]> arr = new ArrayList<>();
        ArrayList<char[]> result = new ArrayList<>();
        
        for(int e : numbers) {
        	arr.add(Integer.toString(e).toCharArray());
        }
       
        while(!arr.isEmpty()) {
        	int max = 0;
        	int index = 0;
	        for(int i=0; i < arr.size();i++) {
	        	if(max < arr.get(i)[0] - '0') {
	        		max = arr.get(i)[0] - '0';
	        		index = i;
	        	}
	        }
	        result.add(arr.get(index));
	        arr.remove(index);
        }
        
        for(char[] e : result) {
        	for(char v : e) {
        		answer += v;
        	}
        }
        
        return answer;
    }
	public static void main(String[] args) {
		int[] numbers = {6,10,2};
		System.out.println(solution(numbers));
	}

}


