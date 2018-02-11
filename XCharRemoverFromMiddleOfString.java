package package1;

/*
 * Given a string, return a version where all the "x" have been removed.
 *  Except an "x" at the very start or end should not be removed.
 *  
 *  Example - 
 *	stringX("xxHxix") → "xHix"
 *  stringX("abxxxcd") → "abcd"
 *  stringX("xabxxxcdx") → "xabcdx"
 */

public class XCharRemoverFromMiddleOfString {
	
	public String stringX(String str) {
		String result = "";
		
		if(str.length() > 2){			
		    for(int i = 1; i < str.length()-1; i++){
		    if(str.charAt(i) != 'x')
		      result += str.charAt(i);
		    }
		    return str.charAt(0)+result+str.charAt(str.length()-1);
		  } else{
		    return str;
		  }
		}

	public static void main(String[] args) {
		new XCharRemoverFromMiddleOfString().stringX("xxHxix");
	}

}
