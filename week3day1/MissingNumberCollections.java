package week3.day1;

import java.util.Set;
import java.util.TreeSet;

public class MissingNumberCollections {
	
public static void main(String[] args) 
{
	int[] input={7,4,7,3,2,3,6,7,8,9,3,1};
	Set<Integer> unique = new TreeSet<Integer>();
	for (Integer number : input) 
	{
		unique.add(number);
	}
	System.out.println(unique);
	
	int prevNumber = 0;
	int missingNumber=0 ;
	for(Integer number: unique) 
	{
		int predictedNextNumber = prevNumber + 1;
		if (predictedNextNumber != number) 
		{
			missingNumber = predictedNextNumber;
			break;
		}
		prevNumber = number;
	}
	System.out.println("Missing number: " + missingNumber);
}
}