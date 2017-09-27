public class student extends person {

	private char examScore;

	public student(int a, String n, char ex) {
		super(a, n);
		examScore = ex;
	}

	public void getInfo() {
		System.out.println("Navn: " + name + "\r\n Alder: " + age + "\r\n Eksamenskarakter: " + examScore);
	}

	public static void main(String[] args) {

	}
}