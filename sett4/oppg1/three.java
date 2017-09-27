public class three {
	public static int a() {
		return 5;
	}

	public static void main(String[] args) {
		int i = a();
		System.out.println(i);
	}
}

//void skal kun brukes når prosedyren ikke returnerer en verdi. For at dette skal fungere må man endre prosedyre a til public static int a();