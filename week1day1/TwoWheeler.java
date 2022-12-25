package week1.day1;

public class TwoWheeler {
	int noOfWheels;
	float mileage;
	boolean isPunctured;
	char bikeNameFirstLetter;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoWheeler obj=new TwoWheeler();
		obj.noOfWheels=2;
		obj.mileage=29.4f;
		obj.isPunctured=true;
		obj.bikeNameFirstLetter='H';
		System.out.println("Total number of wheels is" + "\n" + obj.noOfWheels);
		System.out.println("Mileage of Two wheeler is" +"\n"+ obj.mileage);
		System.out.println("Is Bike punctured" +"\n"+ obj.isPunctured);
		System.out.println("First letter of Bike is" +"\n"+obj.bikeNameFirstLetter );
		
	}

}
