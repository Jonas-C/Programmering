public class three {
	public static int greatest_common_divider(int a, int b) {
		a = Math.abs(a);
		b= Math.abs(b);

		while (a != b) {
			if(a > b) {
				a = a - b;
			}
			else{
				b = b - a;
			}
		}
		
		return a; 
	}

	public static void main(String[] args) {
		int M = greatest_common_divider(-28, 100);
		System.out.println(M);
	}
}