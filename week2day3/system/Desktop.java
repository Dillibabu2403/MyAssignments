package org.system;

public class Desktop extends Computer {
public void desktopSize() {
	System.out.println("desktop size is 17 inch");
}
public static void main(String[] args) {
	Desktop desk=new Desktop();
	desk.desktopSize();
	desk.computerModel();
}
}
