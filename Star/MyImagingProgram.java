import programmering.*;
public class MyImagingProgram {

	int area = 2;


	public static int[] copyArray(int[] originalArray){
		int[] array = new int[originalArray.length];
		
		for(int i = 0; i < originalArray.length; i++){
			array[i] = originalArray[i]; 
		
		}
		return array;
	}

	public static double GaussianFunction(double x, double variance){
		return Math.exp(-Math.pow(x, 2.0) / (2.0*variance));
	}

	public static double EuclidianDistance(int[] a, int[] b) {
		double sum = 0.0;
		for(int i = 0; i < a,length; i++){
			sum  += Math.pow(a[i] -b[i], 2.0);
		}

		return Math.sqrt(sum);
	}
	public static int[] iterateRGBArray(int[] array, int area){
		int[] finishedRGB = new int[3];
		for(int i = 0; i < array.length; i++){
			finishedRGB[i] = array[i] * GaussianFunction() * GaussianFunction();


		}

		return finishedRGB;
	}

	public static void mainFunc(int[] array, int i, int j, int area) {
		for(int x = i -area; x < i + area; x++) {
			for(int y = j - area; y < j + area; y++){
				int index = Imaging.convert2DTo1D(x, y);
				int RGB[] = Imaging.getRGBArray(array[index]);
				iterateRGBArray(RGB, area);
			}
		}
	}

	public static void bilateralFilter(int area, int[] img) {
		for(int x = area; x < Imaging.currentImageWidth - area; x++) {
			for(int y = area; y < Imaging.getImgHeight(img) - area; y++){
				int index = Imaging.convert2DTo1D(x, y);
				int RGB[] = mainFunc(img, x, y, area);

			}
		}
	}

	public static int[] calcRGBSum(int[] img, int i, int j){
		int red= 0;
		int green = 0;
		int blue = 0;
		int RGB[] = new int[3];
		for(int x = i -1; x < i +2; x++){
			for(int y = j - 1; y < j + 2; y++){
				int index = Imaging.convert2DTo1D(x, y);
				RGB = Imaging.getRGBArray(img[index]);
				red += RGB[0];
				green += RGB[1];
				blue += RGB[2];
			}
		}
		RGB[0] = red/9;
		RGB[1] = green/9;
		RGB[2] = blue/9;
		return RGB;
	}

	public static void clamping(int[] RGB){
		for(int i = 0; i <RGB.length; i++){
			if(RGB[i] > 255){
				RGB[i] = 255;
			}
			else if(RGB[i] < 0){
				RGB[i] = 0;
			}
		}
	}

	public static void sharpenImage(double sharpness, int[] img){
		int s = 32;
		int[] filterImg = copyArray(img);
		applyBoxBlur(1, filterImg);

		for(int x= 0; x < Imaging.currentImageWidth; x++){
			for(int y= 0; y < Imaging.getImgHeight(img); y++){
				int index = Imaging.convert2DTo1D(x, y);
				int oRGB[] = Imaging.getRGBArray(img[index]);
				int fRGB[] = Imaging.getRGBArray(filterImg[index]);
				oRGB[0] = oRGB[0] + (oRGB[0] - fRGB[0]) * s;
				oRGB[1] = oRGB[1] + (oRGB[1] - fRGB[1]) * s;
				oRGB[2] = oRGB[2] + (oRGB[2] - fRGB[2]) * s;
				clamping(oRGB);
				img[index] = Imaging.getIntColour(oRGB);

				//MANGLER Å IMPLEMENTERE SHARPNESS-PARAMETERET. FUNKER IKKE
			}
		}
	}

	public static void applyBoxBlur(int iterations, int[] img) {
		for(int i = 0; i < iterations; i++){
			boxBlur(img);
		}
	}

	public static void boxBlur(int[] img){
		for(int x= 1; x < Imaging.currentImageWidth - 1; x++){
			for(int y= 1; y < Imaging.getImgHeight(img) -1; y++){
				int index = Imaging.convert2DTo1D(x, y);
				int RGB[] = calcRGBSum(img, x, y);
				img[index] = Imaging.getIntColour(RGB);
			}
		}
	}


	public static void main(String[] args) {

		if(args.length < 1){
			System.err.println("Please provide an image path");
		}

		int[] img = Imaging.readImageFromFile(args[0]);
		if(img == null){
			System.exit(-1);
		}

		//applyBoxBlur(32, img);
		//Har ikke funnet beste mengden iterasjoner for å fjerne støy.

		sharpenImage(4, img);		

		Imaging.writeImageToFile(img, "outputS32.jpg", "jpg");
		int s = 4 + (4 -2) * 4;
		//12

		

	}

}