package package1;

/*
 * Given a string, return a string made of the chars at 
 * indexes 0,1, 4,5, 8,9 ... 
 * 
 * so "kittens" yields "kien".
 * altPairs("kitten") → "kien"
 * altPairs("Chocolate") → "Chole"
 * altPairs("CodingHorror") → "Congrr"
 */

public class AlternatePair {
	
	public String altPairs(String str) {
		  int counter = 1;
		  String result = "";
		  
		  for(int i = 0; i < str.length();){
		    counter++;
		    if(counter % 2 == 0){
		      result += str.charAt(i);
		      i += 1;
		    } else{
		       result += str.charAt(i);
		      i += 3;
		    }
		  }
		  return result;
		}
	
	public String altPairs2(String str) {
		  String result = ""; int counter = 1;
		  
		  for(int i = 0; i < str.length(); i += 2){
			  counter++;
		     if(counter % 2 == 0){
		    	 int end = i+2;
		    	 if(end > str.length())
		    		 end = str.length();
		    	 result += str.substring(i, end);
		     }		        
		      else{
		    	  continue;
		      }
		  }
		  return result;
		}
	
	public String altPairs3(String str) {
		  String result = ""; int end = 0;
		  
		  for(int i = 0; i < str.length(); i += 4){
			  end = i+2;
		      if(end > str.length())
		    	end = str.length();
		    	result += str.substring(i, end);
		  }		  
		  return result;
		}


	public static void main(String[] args) {
//		new AlternatePair().altPairs("kitten");
//		System.out.println(new AlternatePair().altPairs2("Chocolate"));
//		System.out.println(new AlternatePair().altPairs3("kitten"));
	}

}
