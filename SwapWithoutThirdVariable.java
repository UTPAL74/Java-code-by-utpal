package package1;

import java.util.Scanner;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first no");
		int first_no = sc.nextInt();
		System.out.println("enter second no");
		int second_no = sc.nextInt();
		
		if(first_no>second_no){
			second_no = first_no-second_no;
			first_no = first_no - second_no;
			second_no = first_no + second_no;
		} else{
			first_no = second_no-first_no;
			second_no = second_no - first_no;
			first_no = second_no + first_no;
		}
		
		System.out.println(first_no+"-----"+second_no);
		sc.close();
		 
	}

}
