package number124;


public class Solution {
	public static String solution(int n) {
	      String answer = "";
	      int tmp = 0;
	      
	      while(n > 0) {
	    	  tmp = n%3;
	    	  n = n/3;
	    	  if(tmp == 0) {
	    		  tmp = 4;
	    		  n--;
	    	  }
	    	  answer = tmp + answer;
	      }

	      return answer;
	  }
	
	public static void main(String[] args) {
		System.out.println(solution(12));
	}

}
