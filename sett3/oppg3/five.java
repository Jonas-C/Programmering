public class five {
	public static void main(String[] args) {
		int teller = 0;
		while(true){
			if(teller < 20){
				teller++;
				continue;
			}
			break;
		}

		for(int i = 0; i < 20; i++){
			//Kode her
		}
	}
}

// telleren starter på 0. while-statementen tar inn en boolean uten at den defineres noe sted. Så lenge telleren har en verdi som er mindre enn 20 vil telleren inkrementeres. På grunn av continue vil if-statementen sjekkes til den er falsk.
// Deretter vil den nå breaken, som vil ta deg ut av while-loopen. Telleren vil da ha verdien 20.
// Denne koden er vanskelig å lese og unødvendig komplisert.

