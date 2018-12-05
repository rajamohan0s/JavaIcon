/*
@Author : RAJAMOHANSINGH
@Email : rajamohansssigh@gmail.com
*/
import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class screenShotParser
{

	public screenShotParser(String input1 , String input2, String input3, String input4, String input5, String destination){
		
	try{
	
		File iphone6 = new File(""+destination+"//4.7inch");
		iphone6.mkdir();
		File iphone6sPlus = new File(""+destination+"//5.5inch");
		iphone6sPlus.mkdir();
		File iphone5 = new File(""+destination+"//4inch");
		iphone5.mkdir();
		File iphone4s = new File(""+destination+"//3.5inch");
		iphone4s.mkdir();
		File ipadAir = new File(""+destination+"//ipad");
		ipadAir.mkdir();
		File ipadPro = new File(""+destination+"//ipad Pro");
		ipadPro.mkdir();
		
		/*
			@Getting Input Images
		*/
		BufferedImage originalImage1 = ImageIO.read(new File(input1));
		int type1 = originalImage1.getType() == 0? BufferedImage.TYPE_INT_ARGB : originalImage1.getType();
		
		BufferedImage originalImage2 = ImageIO.read(new File(input2));
		int type2 = originalImage2.getType() == 0? BufferedImage.TYPE_INT_ARGB : originalImage2.getType();
		
		BufferedImage originalImage3 = ImageIO.read(new File(input3));
		int type3 = originalImage3.getType() == 0? BufferedImage.TYPE_INT_ARGB : originalImage3.getType();
		
		BufferedImage originalImage4 = ImageIO.read(new File(input4));
		int type4 = originalImage4.getType() == 0? BufferedImage.TYPE_INT_ARGB : originalImage4.getType();
		
		BufferedImage originalImage5 = ImageIO.read(new File(input5));
		int type5 = originalImage5.getType() == 0? BufferedImage.TYPE_INT_ARGB : originalImage5.getType();
			
		/*
			@iphone 6/6s
			@screen Size :4.7inch
		*/
		
		BufferedImage resizeImageJpg60 = resizeImage(750,1334,originalImage1, type1);
		ImageIO.write(resizeImageJpg60, "jpg", new File(""+iphone6+"/pic1.jpg"));

		BufferedImage resizeImageJpg70 = resizeImage(750,1334,originalImage2, type2);
		ImageIO.write(resizeImageJpg70, "jpg", new File(""+iphone6+"/pic2.jpg"));

		BufferedImage resizeImageJpg80= resizeImage(750,1334,originalImage3, type3);
		ImageIO.write(resizeImageJpg80, "jpg", new File(""+iphone6+"/pic3.jpg"));

		BufferedImage resizeImageJpg90 = resizeImage(750,1334,originalImage4, type4);
		ImageIO.write(resizeImageJpg90, "jpg", new File(""+iphone6+"/pic4.jpg"));

		BufferedImage resizeImageJpg00 = resizeImage(750,1334,originalImage5, type5);
		ImageIO.write(resizeImageJpg00, "jpg", new File(""+iphone6+"/pic5.jpg"));
		
		/*
			@iphone 6/6s Plus
			@screen Size 5.5"
		*/
		
		BufferedImage resizeImageJpg63 = resizeImage(1242,2208,originalImage1, type1);
		ImageIO.write(resizeImageJpg63, "jpg", new File(""+iphone6sPlus+"/pic1.jpg"));

		BufferedImage resizeImageJpg73 = resizeImage(1242,2208,originalImage2, type2);
		ImageIO.write(resizeImageJpg73, "jpg", new File(""+iphone6sPlus+"/pic2.jpg"));

		BufferedImage resizeImageJpg83 = resizeImage(1242,2208,originalImage3, type3);
		ImageIO.write(resizeImageJpg83, "jpg", new File(""+iphone6sPlus+"/pic3.jpg"));

		BufferedImage resizeImageJpg93 = resizeImage(1242,2208,originalImage4, type4);
		ImageIO.write(resizeImageJpg93, "jpg", new File(""+iphone6sPlus+"/pic4.jpg"));

		BufferedImage resizeImageJpg03 = resizeImage(1242,2208,originalImage5, type5);
		ImageIO.write(resizeImageJpg03, "jpg", new File(""+iphone6sPlus+"/pic5.jpg"));
		
		/*
			@iphone 5/5s
			@screen size: 4"
		*/
		
		BufferedImage resizeImageJpg18 = resizeImage(640,1136,originalImage1, type1);
		ImageIO.write(resizeImageJpg18, "jpg", new File(""+iphone5+"/pic1.jpg"));

		BufferedImage resizeImageJpg28 = resizeImage(640,1136,originalImage2, type2);
		ImageIO.write(resizeImageJpg28, "jpg", new File(""+iphone5+"/pic2.jpg"));

		BufferedImage resizeImageJpg38 = resizeImage(640,1136,originalImage3, type3);
		ImageIO.write(resizeImageJpg38, "jpg", new File(""+iphone5+"/pic3.jpg"));

		BufferedImage resizeImageJpg48 = resizeImage(640,1136,originalImage4, type4);
		ImageIO.write(resizeImageJpg48, "jpg", new File(""+iphone5+"/pic4.jpg"));

		BufferedImage resizeImageJpg58 = resizeImage(640,1136,originalImage5, type5);
		ImageIO.write(resizeImageJpg58, "jpg", new File(""+iphone5+"/pic5.jpg"));
		
		/*
			@iphone 4s
			@Screen Size: 3.5inch
		*/
		
		BufferedImage resizeImageJpg17 = resizeImage(640,960,originalImage1, type1);
		ImageIO.write(resizeImageJpg17, "jpg", new File(""+iphone4s+"/pic1.jpg"));

		BufferedImage resizeImageJpg27 = resizeImage(640,960,originalImage2, type2);
		ImageIO.write(resizeImageJpg27, "jpg", new File(""+iphone4s+"/pic2.jpg"));

		BufferedImage resizeImageJpg37 = resizeImage(640,960,originalImage3, type3);
		ImageIO.write(resizeImageJpg37, "jpg", new File(""+iphone4s+"/pic3.jpg"));

		BufferedImage resizeImageJpg47 = resizeImage(640,960,originalImage4, type4);
		ImageIO.write(resizeImageJpg47, "jpg", new File(""+iphone4s+"/pic4.jpg"));

		BufferedImage resizeImageJpg57 = resizeImage(640,960,originalImage5, type5);
		ImageIO.write(resizeImageJpg57, "jpg", new File(""+iphone4s+"/pic5.jpg"));
		

		/*
			@ipad Air1/2 and Retina
			@Screen Size :
		*/
		
		BufferedImage resizeImageJpg13 = resizeImage(1536,2048,originalImage1, type1);
		ImageIO.write(resizeImageJpg13, "jpg", new File(""+ipadAir+"/pic1.jpg"));

		BufferedImage resizeImageJpg23 = resizeImage(1536,2048,originalImage2, type2);
		ImageIO.write(resizeImageJpg23, "jpg", new File(""+ipadAir+"/pic2.jpg"));

		BufferedImage resizeImageJpg33 = resizeImage(1536,2048,originalImage3, type3);
		ImageIO.write(resizeImageJpg33, "jpg", new File(""+ipadAir+"/pic3.jpg"));

		BufferedImage resizeImageJpg43 = resizeImage(1536,2048,originalImage4, type4);
		ImageIO.write(resizeImageJpg43, "jpg", new File(""+ipadAir+"/pic4.jpg"));

		BufferedImage resizeImageJpg53 = resizeImage(1536,2048,originalImage5, type5);
		ImageIO.write(resizeImageJpg53, "jpg", new File(""+ipadAir+"/pic5.jpg"));
		
		/*
			@ipad pro
		*/
		
		BufferedImage resizeImageJpg15 = resizeImage(2048,2732,originalImage1, type1);
		ImageIO.write(resizeImageJpg15, "jpg", new File(""+ipadPro+"/pic1.jpg"));

		BufferedImage resizeImageJpg25 = resizeImage(2048,2732,originalImage2, type2);
		ImageIO.write(resizeImageJpg25, "jpg", new File(""+ipadPro+"/pic2.jpg"));

		BufferedImage resizeImageJpg35 = resizeImage(2048,2732,originalImage3, type3);
		ImageIO.write(resizeImageJpg35, "jpg", new File(""+ipadPro+"/pic3.jpg"));

		BufferedImage resizeImageJpg45 = resizeImage(2048,2732,originalImage4, type4);
		ImageIO.write(resizeImageJpg45, "jpg", new File(""+ipadPro+"/pic4.jpg"));

		BufferedImage resizeImageJpg55 = resizeImage(2048,2732,originalImage5, type5);
		ImageIO.write(resizeImageJpg55, "jpg", new File(""+ipadPro+"/pic5.jpg"));
		

		
	}catch(IOException e){
	//	System.out.println(e.getMessage());
	}
		
    }

    private static BufferedImage resizeImage(int IMG_WIDTH,int IMG_HEIGHT,BufferedImage originalImage, int type){
		BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, IMG_HEIGHT, type);
		Graphics2D g = resizedImage.createGraphics();
		g.drawImage(originalImage, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
		g.dispose();
		
		return resizedImage;
    }
	
    private static BufferedImage resizeImageWithHint(int IMG_WIDTH,int IMG_HEIGHT,BufferedImage originalImage, int type){
		
	BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, IMG_HEIGHT, type);
	Graphics2D g = resizedImage.createGraphics();
	g.drawImage(originalImage, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
	g.dispose();	
	g.setComposite(AlphaComposite.Src);

	g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
	RenderingHints.VALUE_INTERPOLATION_BILINEAR);
	g.setRenderingHint(RenderingHints.KEY_RENDERING,
	RenderingHints.VALUE_RENDER_QUALITY);
	g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
	RenderingHints.VALUE_ANTIALIAS_ON);
	
	return resizedImage;
    }	
}