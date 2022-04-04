import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ConvertImage {
    public static String imageInput = "src/main/resources/input/1638344857-pictureqqnd7.jpg";
    //public static String imageInput = "src/main/resources/input/flower.jpg";
    public static String imageOutput = "src/main/resources/output/file1.jpg";

    public static void main(String[] args) throws IOException {
        convertJPG(imageInput, imageOutput);
        System.out.println("file output: "+ imageOutput);

    }

    public static void convertJPG(String input, String output) throws IOException {
        BufferedImage tiffImage = ImageIO.read(new File(input));
        BufferedImage jpegImage = new BufferedImage(
                tiffImage.getWidth(),
                tiffImage.getHeight(),
                BufferedImage.TYPE_INT_RGB);
        jpegImage.createGraphics().drawImage(tiffImage, 0, 0, Color.WHITE, null);
        ImageIO.write(jpegImage, "jpg", new File(output));
    }
}
