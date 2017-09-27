//Feil versjon
/*
public class two {
	public static void main(String[] args) {
		int a = 1 + 1;
		// Man må definere b som en int.
		b = 2 + 2;
		// Variabelen a er allerede definert.
		int a = b - 1;
		System.out.println(a);
	}
}
*/

// riktig versjon

public class two {
	public static void main(String[] args){
		int a = 1 + 1;
		int b = 2 + 2;
		a = b - 1;
		System.out.println(a);
	}
}