package package1;

import java.util.ArrayList;

public class FirstMaxEvenLengthString {
	
	/*
	 * This program find the maximum even length string in a sentence.
	 */
	
	public static String findMaxEvenLengthString(String sentence){
		String[] arr = sentence.split(" ");
		String result = "";
		ArrayList<String> arstr = new ArrayList<String>();
		
		/*
		 * Capture all even length string in a ArrayString.
		 */
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i].length() % 2 != 0)
				continue;
			else{
				arstr.add(arr[i]);				
			}
		}
		
		/* check individual string length in ArrayList and find the maximum
		 * by comparing one index element to next index element and putting
		 * highest length string at next position.
		 */
				
		for(int i = 0; i < arstr.size()-1; i++){
			if(arstr.get(i).length() > arstr.get(i+1).length()){
				result = arstr.get(i);
				arstr.set(i+1, result);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String result = FirstMaxEvenLengthString.
				findMaxEvenLengthString("punss 89thisssss coderrre is a great codeee and your are too");
		System.out.println("Highest length string is :" + result);
	}

}
