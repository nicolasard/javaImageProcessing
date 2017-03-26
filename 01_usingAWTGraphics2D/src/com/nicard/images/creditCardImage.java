package com.nicard.images;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


/*
 * Clase encargada de la generacion de una imagen similar a la de una tarjeta de credito.
 */
public class creditCardImage {
	Graphics2D g2 = null;
	BufferedImage bImage = null;
	
	public creditCardImage(){
		bImage = new BufferedImage(856, 540, BufferedImage.TYPE_INT_RGB);
		g2 = bImage.createGraphics();
		g2.setPaint (Color.ORANGE);
		g2.fillRect ( 0, 0, bImage.getWidth(), bImage.getHeight() );
	}
	
	public void setBackgroundImage(String ImagePath){
		BufferedImage img = null;
		
		try {
		    img = ImageIO.read(new File(ImagePath));
		} catch (IOException e) {
		}
		
		g2.drawImage(img, 0, 0, null);
	}
	
	public void setLinea1(String txt){
		g2.setColor(Color.black);
		g2.setFont(new Font("Kredit", Font.PLAIN, 50));
		g2.drawString(txt, 20, 120);
	}
	
	public void setLinea2(String txt){
		g2.setColor(Color.black);
		g2.setFont(new Font("Kredit", Font.PLAIN, 35));
		g2.drawString(txt, 20, 150);
	}
	
	public void setLinea3(String txt){
		g2.setColor(Color.black);
		g2.setFont(new Font("Kredit", Font.PLAIN, 35));
		g2.drawString(txt, 20, 180);
	}
	
	public void setLinea4(String txt){
		g2.setColor(Color.GREEN);
		g2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		g2.drawString(txt, 20, 20);
	}
	
	public void saveImage(String path){
		File outputfile = new File(path);
	    try {
			ImageIO.write(bImage, "jpg", outputfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
	}
	
}
