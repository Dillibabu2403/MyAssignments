package week2.day4;

public class Smartphone extends Iphone implements Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

	Smartphone obj=new Smartphone();
	obj.playSongs();
	obj.takeCamera();
	obj.dialEmergencyNumber();
	obj.sendMessage();
	obj.viewGallery();
	

	}

	public void viewGallery() {
		// TODO Auto-generated method stub
		System.out.println("Gallery");
	}

	public void dialEmergencyNumber() {
		// TODO Auto-generated method stub
		System.out.println("Number");
	}

	public void sendMessage() {
		// TODO Auto-generated method stub
		System.out.println("Message");
	}

	@Override
	public void takeCamera() {
		// TODO Auto-generated method stub
		System.out.println("Camera");
	}
}

