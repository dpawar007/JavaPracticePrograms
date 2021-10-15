package allbasic;

public class PallidromString {

	public static void main(String[] args) {
		String s1 = "madam";
	    int count = 0 ;
	    int j  = s1.length()-1;
	    System.out.println("s1.length()-1 = "+j);
	    for(int i =0 ; i<s1.length();i++) {
	    	if(s1.charAt(i) == s1.charAt(j--)){
	    		count++;
	    	}	    	
	    }
	    System.out.println("count = "+count);
	    System.out.println("s1.length() = "+s1.length());
	    
	    if(count == s1.length()) {
	    	System.out.println("String is pallidrom");
	    }else {
	    	System.out.println("string is not pallidrom");
	    }
	    	
	}
}
