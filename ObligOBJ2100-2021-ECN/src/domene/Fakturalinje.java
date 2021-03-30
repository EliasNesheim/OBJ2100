package domene;

public class Fakturalinje {

	private int varenr;
	private String varenavn;
	private int antall;
	private float rabatt;
	private float totalPris;
	
	public Fakturalinje(int varenr, String varenavn, int antall, float rabatt, float enhetsPris) {
		super();
		this.varenr = varenr;
		this.varenavn = varenavn;
		this.antall = antall;
		this.rabatt = rabatt;
		this.totalPris = antall*enhetsPris;;
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
	 * @return the antall
	 */
	public int getAntall() {
		return antall;
	}


	/**
	 * @param antall the antall to set
	 */
	public void setAntall(int antall) {
		this.antall = antall;
	}


	/**
	 * @return the rabatt
	 */
	public float getRabatt() {
		return rabatt;
	}


	/**
	 * @param rabatt the rabatt to set
	 */
	public void setRabatt(float rabatt) {
		this.rabatt = rabatt;
	}


	/**
	 * @return the totalPris
	 */
	public float getTotalPris() {
		return totalPris;
	}


	/**
	 * @param totalPris the totalPris to set
	 */
	public void setTotalPris(float totalPris) {
		this.totalPris = totalPris;
	}


	@Override
	public String toString() {
		return "Fakturalinje [varenr=" + varenr + ", varenavn=" + varenavn + ", antall=" + antall + ", rabatt=" + rabatt
				+ ", totalPris=" + totalPris + "]";
	}


	

}
