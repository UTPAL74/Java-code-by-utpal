package package1;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

public class FullScreenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MMM_dd hh_mm_ss a");
			Robot robot = new Robot();
			String format = "png";
			//String filename= "screenshot1."+format;
			String filename = sdf.format(new Date())+"."+format;
			
			Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
			BufferedImage fullScreenImage = robot.createScreenCapture(screenRect);
			ImageIO.write(fullScreenImage, format, new File(filename));
			
			System.out.println("New screen shot is saved");
		} catch(Exception e){
			System.out.println(e);
		}

	}

}
