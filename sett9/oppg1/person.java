public class person extends printable {
	protected int age;
	protected String name;
	protected double height;

	public person(int a, String n) {
		age = a;
		name = n;
	}

	public void getInfo() {
		System.out.println("Navn: " + name + "\r\n Alder: " + age);
	}

}