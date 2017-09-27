public class chemicalElement extends printable {
	private int atomicNmbr;
	private String symbol;
	private int group;
	private int period;

	public void getInfo() {
		System.out.println("AtomNr: " + atomicNmbr + "\r\n Symbol: " + symbol + "\r\n Gruppe: " + group + "\r\n Periode: " + period);
	}
}