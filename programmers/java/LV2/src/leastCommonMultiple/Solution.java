package leastCommonMultiple;

import java.util.ArrayList;

public class Solution {
	public static int solution(int[] arr) {
	      int answer = 0;
	      ArrayList<Integer> result = new ArrayList<>();
	      int index = 2;
	      
	      while(answer == 0) {
	    	  index++;
	    	  ArrayList<Integer> tmp = new ArrayList<>();
	    	  for(int e : arr) {
	    		  tmp.add(e*index);
	    	  }
	    	  
	    	  for(int i = 0; i < arr.length; i++){
	    		  for(int j = 0; j < tmp.size(); j++) {
	    			  if(tmp.get(i)%arr[j] != 0) {
	    				  break;
	    			  }else if(tmp.get(i)%arr[j] == 0 && j == tmp.size()-1) {
	    				  answer = tmp.get(i);
	    				  
	    			  }
	    		  }
	    	  }
	      }
	      
	      return answer;
	  }
	
	public static void main(String[] args) {
		int[] arr = {2,6,8,14};
		System.out.println(solution(arr));
	}

}

