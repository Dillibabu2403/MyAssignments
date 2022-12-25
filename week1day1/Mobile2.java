package week1.day1;

public class Mobile2 {

	char mobileLogo;
	short noOfMobilePiece;
	int modelNumber;
	float mobilePrice;
	boolean isDamaged;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile2 obj=new Mobile2();
		obj.mobileLogo='$';
		obj.noOfMobilePiece=32767;
		obj.modelNumber= 678;
		obj.mobilePrice= 1050.8f;
		obj.isDamaged = true;
		
		System.out.println("Mobile Logo is" + "\n" + obj.mobileLogo);
		System.out.println("Number of Mobile pieces are" +"\n"+ obj.noOfMobilePiece);
		System.out.println("Model number is" +"\n"+ obj.modelNumber);
		System.out.println("Mobile price is" +"\n"+obj.mobilePrice);
		System.out.println("Is Mobile damaged" +"\n"+obj.isDamaged);
	}

}
