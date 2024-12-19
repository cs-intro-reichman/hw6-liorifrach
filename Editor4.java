import java.awt.Color;

public class Editor4 {
    public static void main (String[] args){
        if (args.length < 2) {
            System.out.println("Usage: java Editor4 <image> <steps>");
            return;
        }

        String source = args[0];
        int n = Integer.parseInt(args[1]);

        Color[][] sourceImage = Runigram.read(source);

        // Set up the canvas using the source image dimensions
        Runigram.setCanvas(sourceImage);

        // Perform the morphing from the color image to the grayscale version in n steps
        morphToGrayscale(sourceImage, n);

    }

    public static void morphToGrayscale(Color[][] sourceImage, int n){
        for (int step =0; step<= 0; step++){
            double alpha = (double) step / n;

            Color[][] morphed = Runigram.blend(sourceImage, Runigram.grayScaled(sourceImage), alpha);

            Runigram.display(sourceImage);

            StdDraw.pause(500);
        }
    }
    
}
