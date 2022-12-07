package week1.day3;

import java.util.Arrays;

public class MissingNumberInArray {

	public static void main(String[] args) {
	
		int[] numbers = {1,2,3,4,7,6,8};
		Arrays.sort(numbers);
		int numbersArrayIndex = 0;
		for (int i = 1; i < numbers[numbers.length - 1]; i++) {
		    if (i == numbers[numbersArrayIndex]) {
		        numbersArrayIndex++;
		    }
		    else {
		        System.out.println(i);
		    }
		}
	
}
}