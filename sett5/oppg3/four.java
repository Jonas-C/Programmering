//Denne kodesnutten vil ikke fungere da arrayet kun kan inneholde 10 tall, mens for-loopen prøver å sette inn tall over den tiende posisjonen. Forslag på hva som burde gjøres

public class four {
	public static void main(String[] args) {
		int[] intTab = new int[10];
		for(int i = 0; i < intTab.length; i++){
			intTab[i] = i;
		}
		for(int i : intTab) {
			System.out.println(i);
		}
	}
} 

//Gidder lowkey ikke å tegne greiene i oppgave 4