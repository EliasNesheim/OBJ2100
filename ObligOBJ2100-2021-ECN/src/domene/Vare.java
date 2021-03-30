package domene;

public class Vare {

	private int varenr;
	private String varenavn;
	private float pris;
	
	@Override
	public String toString() {
		return "Vare [varenr=" + varenr + ", varenavn=" + varenavn + ", pris=" + pris + "]";
	}

	/**
	 * @return the varenr
	 */
	public int getVarenr() {
		return varenr;
	}

	/**
	 * @param varenr the varenr to set
	 */
	public void setVarenr(int varenr) {
		this.varenr = varenr;
	}

	/**
	 * @return the varenavn
	 */
	public String getVarenavn() {
		return varenavn;
	}

	/**
	 * @param varenavn the varenavn to set
	 */
	public void setVarenavn(String varenavn) {
		this.varenavn = varenavn;
	}

	/**
	 * @return the pris
	 */
	public float getPris() {
		return pris;
	}

	/**
	 * @param pris the pris to set
	 */
	public void setPris(float pris) {
		this.pris = pris;
	}

	public Vare() {
		// TODO Auto-generated constructor stub
	}

}
