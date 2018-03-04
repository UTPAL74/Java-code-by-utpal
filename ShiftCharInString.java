package package1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ShiftCharInString {

	public static String shiftChar(String str, int noOfShift){
		char[] ch = str.toCharArray();
		
		while(noOfShift > 0){
			int i = 0; char first = ch[0];
			while(i < ch.length){
				int next = i + 1;
				
				if(next >= ch.length){
					ch[i] = first;
					break;
				}
				
				ch[i] = ch[next];
				i++;
			}
			noOfShift -= 1;
		}		
		
		return Arrays.toString(ch);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please provide input string :");
		String str = sc.next(); int n = 0;
		System.out.println("provide no of bit you want to shift :");
		
		try{
			n = sc.nextInt();
		} catch(InputMismatchException inp){
			System.err.println("PLEASE PROVIDE VALID INPUT INTEGER");
			inp.printStackTrace();
		}
		
		String result = ShiftCharInString.shiftChar(str, n);
		System.out.println(result);
		sc.close();
	}

}
