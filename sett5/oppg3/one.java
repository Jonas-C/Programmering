public class one {

	public static int greatest_common_divider(int i, int j) {
		i = Math.abs(i);
		j = Math.abs(j);

		while(i != j){
			if(i > j) {
				i = i - j;
			}
			else{
				j = j - i;
			}
		}
		return i;
	}

	public static void main(String[] args) {
		int k = greatest_common_divider(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		System.out.println(k);
	}
}