package numbuerOfPabonach;

public class Solution {
	public static int solution(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        for(int i = 2; i <= n; i++) {
        	c = (a + b)%1234567;
        	a = b%1234567;;
        	b = c%1234567;;
        }
        
		return c;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(3));
	}

}
