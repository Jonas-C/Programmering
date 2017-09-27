public class one {
	public static void main(String[] args){
		float a = 0.05f;
		float b = 0.1f;
		float c = a + b;
		float d = a - b;
		float e = a * b;
		float f = a / b;
		c = a / 0;
		System.out.println("A: " + a + "\r\n B: " + b + "\r\n C: " + c + "\r\n D: " + d + "\r\n E: " + e  + "\r\n F: " + f);
	}
}

/* ENDER OPP MED DETTE MED DOUBLE

A: 0.05
 B: 0.1
 C: Infinity
 D: -0.05
 E: 0.005000000000000001
 F: 0.5

ENDER OPP MED DETTE MED FLOAT

A: 0.05
 B: 0.1
 C: Infinity
 D: -0.05
 E: 0.0050000004
 F: 0.5

 Float, eller IEEE floating point representation brukes for å representere tall med desimaltegn da datamaskiner kan ha problemer med å kalkulere dette 
 på en effektiv måte. Double er mye mer presist enn det float er da det kan ta i bruk flere desimaler. 


 */

