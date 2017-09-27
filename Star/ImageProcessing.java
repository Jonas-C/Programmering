import programmering.*;
public class ImageProcessing {

	public static void main(String[] args) {

		if(args.length < 1){
			System.err.println("Please provide an image path");
		}

		int[] img = Imaging.readImageFromFile(args[0]);
		if(img == null){
			System.exit(-1);
		}

		Imaging.writeImageToFile(img, "output.jpg", "jpg");

	}

}