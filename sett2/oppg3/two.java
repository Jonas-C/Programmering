public class two {
	public static void main(String[] args) {
		int a = 'å';
		char b = 'b';
		int c = a + b;
		System.out.println(a);
	}
}

//Det blir printet ut 195 fordi vi konverterer to chars til et tall. Dette fører dermed til at vi adderer summen til karakterene istedenfor selve karakterene. A = 97 og B = 98. 97 + 98 = 195.

/*
Æ = 230
Ø = 248
Å = 229

For å få dette til å funke måtte jeg legge til -encoding UTF-8 når jeg kompilerte. Antar at nordiske tegn ble ansett som flere chars?
*/


