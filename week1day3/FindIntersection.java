package week1.day3;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int myArray1[] = {3,2,11,4,6,7};
	      int myArray2[] = {1,2,8,4,9,7};
	      System.out.println("Intersection of the two arrays ::");
	     
	      for(int i = 0; i<myArray1.length; i++ ) {
	         for(int j = 0; j<myArray2.length; j++) {
	            if(myArray1[i]==myArray2[j]) {
	               System.out.println(myArray2[j]);
	            }
	         }
	      }
	   }
	}
