class Solution {
    public static String convertToTitle(int columnNumber) {
        
    	String ans = "";
    	
    	while(columnNumber > 0) {
    		
    		columnNumber--;
    		
    		int rem = columnNumber % 26;
    		
    		char letter =  (char) ('A' + rem);
    		
    		ans =  letter +  ans;
    		
    		columnNumber  =  columnNumber / 26;
    		
    	}	
    	return ans;
    }
}