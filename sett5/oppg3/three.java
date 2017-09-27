public class three {

	public static int sum(int[] a){
		int sum = 0;
		for(int i = 0; i < a.length; i++){
			sum += a[i];
		}
		return sum;
	}

	public static int[] cumsum(int[] a) {

		int[] nums = new int[a.length];
		int sum = 0;
		for(int i = 0; i < a.length; i++){
			sum += a[i];
			nums[i] = sum;

		}
		return nums;
	}

	public static int[] positives(int[] a) {
		int counter = 0;
		for(int i = 0; i < a.length; i++){
			if(a[i] >= 0){
				counter++;
			}
		}
		int counter2 = 0;
		int[] b = new int[counter];
		for(int i = 0; i < a.length; i++){
			if(a[i] >= 0){
				b[counter2] = a[i];
				counter2++;
			}
		}
		return b;
	}


	public static void main(String[] args) {
		int[] a = new int[args.length];
		for(int i = 0; i < a.length; i++){
			a[i] = Integer.parseInt(args[i]);
		}

		int s = sum(a);
		int[] cs = cumsum(a);
		int[] positive = positives(a);


		System.out.println(s);
		
		for(int i : cs){
			System.out.println(i);
		}

		for(int i : positive){
			System.out.println(i);
		}
	}
}