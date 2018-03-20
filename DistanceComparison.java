package package1;

import java.util.Scanner;

class Distance{
	
	/*
	 * This class compare the distance provided from two object.
	 */
	
	private int feet;
	private float inches;
	
	public int getFeet() {
		return feet;
	}
	public void setFeet(int feet) {
		this.feet = feet;
	}
	public float getInches() {
		return inches;
	}
	public void setInches(float inches) {
		this.inches = inches;
	}
	
	public String compareDistance(Distance dist){
		float dlen = this.feet * 12 + inches;
		float d1len = dist.feet * 12 + inches;
		if (dlen > d1len)
			return "first object d is greater then d1 , d = " + dlen+ "";
		else
			return "second object d1 is greater then d , d1 = " + d1len+ "";
	}
}

public class DistanceComparison {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Distance d = new Distance();
		System.out.println("Enter first obj value :");
		int feet = sc.nextInt();		
		float inches = sc.nextFloat();
		
		d.setFeet(feet);
		d.setInches(inches);
		
		Distance d1 = new Distance();
		System.out.println("Enter second obj value :");
		int feet1 = sc.nextInt();		
		float inches1 = sc.nextFloat();
		d1.setFeet(feet1);
		d1.setInches(inches1);
		
		String result = d.compareDistance(d1);
		System.out.println(result);
		
		sc.close();
	}

}
