package package1;

import java.util.ArrayList;

public class FirstMaxEvenLengthString {
	
	public static String findMaxEvenLengthString(String sentence){
		String[] arr = sentence.split(" ");
		String result = "";
		ArrayList<String> arstr = new ArrayList<String>();
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i].length() % 2 != 0)
				continue;
			else{
				arstr.add(arr[i]);				
			}
		}
		
		for(int i = 0; i < arstr.size()-1; i++){
			if(arstr.get(i).length() > arstr.get(i+1).length()){
				result = arstr.get(i);
			} else { result = arstr.get(i); }
		}
		return result;
	}

	public static void main(String[] args) {
		String result = FirstMaxEvenLengthString.
				findMaxEvenLengthString("punss this code is a great codeee and your are too");
		System.out.println(result);
	}

}
