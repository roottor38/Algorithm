package printer;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Printer {
	
	public static int solution(int[] priorities, int location) {
        int answer = 1;
        int max = 0;
        
        Queue<Integer> doc = new LinkedList<>();
     
        for(int e : priorities) {
        	doc.offer(e);
        }
        
        while(doc.size() != 0) {
        	max = Collections.max(doc);
        	if(max != doc.peek() && location == 0) {
        		doc.offer(doc.poll());
        		location = doc.size()-1;
        		
        	}else if(max != doc.peek() && location != 0) {
        		doc.offer(doc.poll());
        		location--;
        		
        	}else if(max == doc.peek() && location != 0) {
        		doc.poll();
        		answer++;
        		location--;
        		
        	}else if(max == doc.peek() && location == 0) {
        		return answer;
        	}
        	
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		int[] priorties =  {8, 1, 9, 1, 1, 1};
		
		System.out.println(solution(priorties, 0));
	}

}
