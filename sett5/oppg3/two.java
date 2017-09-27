public class two {
public static int[] copyArray(int[] originalArray){
		int[] array = new int[originalArray.length];
		for(int i = 0; i < originalArray.length; i++){
			array[i] = originalArray[i]; 
		}
		return array;
	}
	public static void main(String[] args) {

		int[] array = new int[10];
		for(int i = 0; i < array.length; i++){
			array[i] = i;
		}

		int[] array2 = copyArray(array);
		array2[5] = 123;
		System.out.println(array2[5]);
	}
}