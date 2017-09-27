//antar at dette vil skrive ut 5
public class MinKlasse {
	public int a = 0;
	
	public MinKlasse(int b) {
		a = b;
	}
		
	public static void main(String[] args) {
	
		MinKlasse obj = new MinKlasse(5);
		System.out.println(obj.a);
	}
}
