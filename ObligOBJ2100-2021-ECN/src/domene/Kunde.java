package domene;

public abstract class Kunde {

	private int kundeNummer;
	private String kundeNavn;
	/**
	 * @return the kundeNummer
	 */
	public int getKundeNummer() {
		return kundeNummer;
	}
	/**
	 * @param kundeNummer the kundeNummer to set
	 */
	public void setKundeNummer(int kundeNummer) {
		this.kundeNummer = kundeNummer;
	}
	/**
	 * @return the kundeNavn
	 */
	public String getKundeNavn() {
		return kundeNavn;
	}
	/**
	 * @param kundeNavn the kundeNavn to set
	 */
	public void setKundeNavn(String kundeNavn) {
		this.kundeNavn = kundeNavn;
	}
	@Override
	public String toString() {
		return "Kunde [kundeNummer=" + kundeNummer + ", kundeNavn=" + kundeNavn + "]";
	}
}
