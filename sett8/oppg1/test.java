class A {
	public int x = 5;
}

class B extends A {
	public int x = 25;
}

class C extends B {
	public int x;

	public void test() {
		x = 10;
		this.x = 20;

		//uhhhhh....


	}
}

public class test{

	public static void main(String[] args) {

	}
}