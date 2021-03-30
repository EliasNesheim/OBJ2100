package domene;

public class Firmakunder extends Kunde{

	
	private float kredittgrense;
	private int  telefonnummer;
	
	@Override
	public String toString() {
		return "Firmakunder [kredittgrense=" + kredittgrense + ", telefonnummer=" + telefonnummer + "]";
	}

	/**
	 * @return the kredittgrense
	 */
	public float getKredittgrense() {
		return kredittgrense;
	}

	/**
	 * @param kredittgrense the kredittgrense to set
	 */
	public void setKredittgrense(float kredittgrense) {
		this.kredittgrense = kredittgrense;
	}

	/**
	 * @return the telefonnummer
	 */
	public int getTelefonnummer() {
		return telefonnummer;
	}

	/**
	 * @param telefonnummer the telefonnummer to set
	 */
	public void setTelefonnummer(int telefonnummer) {
		this.telefonnummer = telefonnummer;
	}

	public Firmakunder() {
		// TODO Auto-generated constructor stub
	}

}
