package domene;

public class Privatkunder extends Kunde{

	private String butikk;
	 
	
	
	public Privatkunder() {
		
		
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Privatkunder [butikk=" + butikk + "]";
	}



	/**
	 * @return the butikk
	 */
	public String getButikk() {
		return butikk;
	}



	/**
	 * @param butikk the butikk to set
	 */
	public void setButikk(String butikk) {
		this.butikk = butikk;
	}

}
