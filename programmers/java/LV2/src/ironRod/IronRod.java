package ironRod;

import java.util.ArrayList;

public class IronRod {
	
	public static int solution(String arrangement) {
        int answer = 0;
        int shot = 0;
        int midle = 0;
        int longb = 0;
        
        ArrayList<String> arr = new ArrayList<>();
        
        System.out.println(arrangement.length());
        
        for(int i = 0; i<arrangement.length(); i++) {
        	char str = arrangement.charAt(i);
        	//arr.add(String to = );
        }
        
        System.out.println("arrangement");
        
        
        
        
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution("()(((()())(())()))(())"));
	}

}
