package com.nicard.images;

public class main {
	

	public static void main(String[] args) {
		creditCardImage i = new creditCardImage();
		i.setBackgroundImage("C:/Users/Nico/Desktop/gold.jpg");
		i.setLinea1("4546 4123 1234 2054");
		i.setLinea2("09/16      08/19");
		i.setLinea3("NICOLAS GAB ARDISON");
		i.saveImage("C:/Users/Nico/Desktop/saved.jpg");
	
	}
}
