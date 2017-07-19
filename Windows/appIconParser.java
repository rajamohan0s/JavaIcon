/*
@Author : RAJAMOHANSINGH
@Email : rajamohansssingh@gmail.com
*/

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class appIconParser
{

	public appIconParser(String input , String destination){
		
	try{
	
		BufferedImage originalImage = ImageIO.read(new File(input));
		int type = originalImage.getType() == 0? BufferedImage.TYPE_INT_ARGB : originalImage.getType();
			
		BufferedImage resizeImageJpg = resizeImage(29,29,originalImage, type);
		ImageIO.write(resizeImageJpg, "png", new File(""+destination+"\\icon29@1x.png")); 
		
		BufferedImage resizeImageJpg1 = resizeImage(58,58,originalImage, type);
		ImageIO.write(resizeImageJpg1, "png", new File(""+destination+"\\icon29@2x.png")); 

		BufferedImage resizeImageJpg2 = resizeImage(87,87,originalImage, type);
		ImageIO.write(resizeImageJpg2, "png", new File(""+destination+"\\icon29@3x.png")); 

		BufferedImage resizeImageJpg5 = resizeImage(40,40,originalImage, type);
		ImageIO.write(resizeImageJpg5, "png", new File(""+destination+"\\icon40@1x.png"));
		
		BufferedImage resizeImageJpg3 = resizeImage(80,80,originalImage, type);
		ImageIO.write(resizeImageJpg3, "png", new File(""+destination+"\\icon40@2x.png")); 

		BufferedImage resizeImageJpg4 = resizeImage(120,120,originalImage, type);
		ImageIO.write(resizeImageJpg4, "png", new File(""+destination+"\\icon40@3x.png"));
		
		/*
			@icon 50 = 1x and 2x
		*/
		BufferedImage resizeImageJpg6 = resizeImage(50,50,originalImage, type);
		ImageIO.write(resizeImageJpg6, "png", new File(""+destination+"\\icon50@1x.png")); 

		BufferedImage resizeImageJpg7 = resizeImage(100,100,originalImage, type);
		ImageIO.write(resizeImageJpg7, "png", new File(""+destination+"\\icon50@2x.png")); 


		/*
			@icon 57 = 1x and 2x
		*/
		BufferedImage resizeImageJpg8 = resizeImage(57,57,originalImage, type);
		ImageIO.write(resizeImageJpg8, "png", new File(""+destination+"\\icon57@1x.png")); 

		BufferedImage resizeImageJpg9 = resizeImage(114,114,originalImage, type);
		ImageIO.write(resizeImageJpg9, "png", new File(""+destination+"\\icon57@2x.png")); 
		
		/*
			@icon 60 = 2x and 3x
		*/
		
		BufferedImage resizeImageJpg10 = resizeImage(120,120,originalImage, type);
		ImageIO.write(resizeImageJpg10, "png", new File(""+destination+"\\icon60@2x.png")); 

		BufferedImage resizeImageJpg11 = resizeImage(180,180,originalImage, type);
		ImageIO.write(resizeImageJpg11, "png", new File(""+destination+"\\icon60@3x.png")); 

		/*
			@icon 72 = 1x and 2x
		*/
		
		BufferedImage resizeImageJpg12 = resizeImage(72,72,originalImage, type);
		ImageIO.write(resizeImageJpg12, "png", new File(""+destination+"\\icon72@1x.png")); 

		BufferedImage resizeImageJpg13 = resizeImage(144,144,originalImage, type);
		ImageIO.write(resizeImageJpg13, "png", new File(""+destination+"\\icon72@2x.png")); 
		
		/*
			@icon 76 = 1x and 2x
		*/
		
		BufferedImage resizeImageJpg14 = resizeImage(76,76,originalImage, type);
		ImageIO.write(resizeImageJpg14, "png", new File(""+destination+"\\icon76@1x.png")); 

		BufferedImage resizeImageJpg15 = resizeImage(152,152,originalImage, type);
		ImageIO.write(resizeImageJpg15, "png", new File(""+destination+"\\icon76@2x.png")); 
		
		/*
			@icon 83.5 = 1x
		*/
		
		BufferedImage resizeImageJpg16 = resizeImage(167,167,originalImage, type);
		ImageIO.write(resizeImageJpg16, "png", new File(""+destination+"\\icon83@2x.png")); 

		/*
			@itunes artWork
		*/
		
		BufferedImage resizeImageJpg17 = resizeImage(512,512,originalImage, type);
		ImageIO.write(resizeImageJpg17, "png", new File(""+destination+"\\AppleiTunesArtwork@1x.png")); 
		
		BufferedImage resizeImageJpg18 = resizeImage(1024,1024,originalImage, type);
		ImageIO.write(resizeImageJpg18, "png", new File(""+destination+"\\AppleiTunesArtwork@2x.png")); 
		
		BufferedImage resizeImageJpg19 = resizeImage(1536,1536,originalImage, type);
		ImageIO.write(resizeImageJpg19, "png", new File(""+destination+"\\AppleiTunesArtwork@3x.png")); 
		
		// BufferedImage resizeImagePng = resizeImage(originalImage, type);
		// ImageIO.write(resizeImagePng, "png", new File("c:\\image\\mkyong_png.jpg")); 
			
		// BufferedImage resizeImageHintJpg = resizeImageWithHint(originalImage, type);
		// ImageIO.write(resizeImageHintJpg, "jpg", new File("c:\\image\\mkyong_hint_jpg.jpg")); 
			
		// BufferedImage resizeImageHintPng = resizeImageWithHint(originalImage, type);
		// ImageIO.write(resizeImageHintPng, "png", new File("c:\\image\\mkyong_hint_png.jpg")); 
				
	}catch(IOException e){
	//	System.out.println(e.getMessage());
	}
		
    }
	
	/*
	@Author RAJU
	@Method 
	*/
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