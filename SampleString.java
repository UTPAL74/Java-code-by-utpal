package package1;

public class SampleString {
	
	public String extraFront(String str) {
		if (str.length() > 1) {
		    String first = "";
		    	
		    if(str.charAt(0) == 'a')
		      first = "a";
		    
		    if(str.charAt(1) == 'b')
		      first += "b";
		    
		    return first + str.substring(2);
		  }
		  return str;
	}

	public static void main(String[] args) {
		System.out.println(new SampleString().extraFront("away"));
	}

}
