package findDecimal;

import java.util.ArrayList;

public class Solution {
	
	public static int solution(String numbers) {
        int answer = 0;
        char[] num = numbers.toCharArray();
        ArrayList<Integer> arr = new ArrayList<>();
        
        
        
        for(char e : num) {
        	arr.add(e - '0');
        }
        System.out.println(arr);
        
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution("17"));
		
	}

}
