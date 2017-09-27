public class four {
	public static void main(String[] args) {
		System.out.println("Skriv inn et tegn: ");
		java.util.Scanner sc= new java.util.Scanner(System.in);
		char c = sc.next().charAt(0);
		int i = c;

		switch(i) {
			case 97:
				System.out.println("Du skrev inn tegnet A");
				break;
			case 98:
				System.out.println("Du skrev inn tegnet B");
				break;
			case 99: 
				System.out.println("Du skrev inn tegnet C");
				break;
			case 100: 
				System.out.println("Du skrev inn tegnet D");
				break;
			default: 
				System.out.println("Du skrev inn noe annet enn A, B, C eller D");
		}

	}
}