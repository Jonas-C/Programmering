public class lecturer extends person {
	
	private long salary;

	public lecturer(int a, String n, long s) {
		super(a, n);
		salary = s;
	}

	public void getInfo() {
		System.out.println("Navn: " + name + "\r\n Alder: " + age + "\r\n Lønn: " + salary);
	}

	public static void main(String[] args) {

	}
} 