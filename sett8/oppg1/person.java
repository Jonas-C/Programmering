public class person {
	int age;
	String name;
	double height;

	public person(int a, String n) {
		age = a;
		name = n;
	}

	public void getInfo(){
		System.out.println("Navn: " + name + "\r\n Alder: " + age);
	}

	public static void main(String[] args) {

	}
}