package stockprices;

public class Solution {
	public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        for(int i =0; i < prices.length; i++) {
        	answer[i] = 0;
        	for(int j = i+1; j < prices.length; j++) {
        		answer[i]++;
        		if(prices[i] <= prices[j]) {
        			break;
        		}
        	}
        }
        
        
        return answer;
    }
	public static void main(String[] args) {
		int[] prices = {1,2,3,2,3};
		System.out.println(solution(prices));
	}
}
