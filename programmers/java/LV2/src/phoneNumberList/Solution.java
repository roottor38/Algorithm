package phoneNumberList;

public class Solution {
	public static boolean solution(String[] phone_book) {
		 for(int i=0; i<phone_book.length-1; i++) {
	            for(int j=i+1; j<phone_book.length; j++) {
	                if(phone_book[i].startsWith(phone_book[j])) {return false;}
	                if(phone_book[j].startsWith(phone_book[i])) {return false;}
	            }
	        }
	        return true;
    }
	
	public static void main(String[] args) {
		String[] phone_book = {"1212", "101", "1111111", "1111118"};
		System.out.println(solution(phone_book));
		
	}

}
