import java.util.*;
class ValueFinder 
{
	public static void main(String[] args) 
	{
		System.out.println(new ValueFinder().maxValueFinder(Integer.parseInt(args[0])));
	}

	public int maxValueFinder(int num) {

		int digitCount = (""+num).length();
		
		// Collecting individual digit of number into an array

		int[] numArray = new int[digitCount];

		int temp = num, i = 0;

		while(i < digitCount) {
			if (i == digitCount-1) {
				numArray[i] = temp;
				break;
			}
			numArray[i] = temp % 10;
			temp = temp / 10;
			i++;
		}

		// Sort the array in descending order to get the highest number formed by it's element.

		for (int i1 = 0; i1 < numArray.length; i1++)
		{
			int temp1 = 0;
			for (int j = 0; j < numArray.length-1; j++)
			{
				if (numArray[j] < numArray[j+1])
				{
					temp1 = numArray[j];
					numArray[j] = numArray[j+1];
					numArray[j+1] = temp1;					
				}
			}
		}

		// Form the number from sorted array element.

		int maxNumber = numArray[numArray.length-1], j = numArray.length-2;
		int multiplier = 10;

		while (j >= 0)
		{
			maxNumber = maxNumber + (numArray[j] * multiplier);
			multiplier *= 10;
			j--;
		}


		return maxNumber;
	}
}
