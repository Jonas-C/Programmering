public class person {
	private String name;
	private int age;

	public person(String n, int a) {
		name = n;
		age = a;
	}

	public void printInfo(){
		System.out.println("Navn: " + name + "\r\n Alder: " +age);
	}

	public int ageDifference(person p) {
		int otherAge = p.age;
		int sum = 0;
		if(age >= otherAge) {
			sum = age - otherAge;
		}
		else{
			sum = otherAge - age;
		}

		return sum;
	}


}