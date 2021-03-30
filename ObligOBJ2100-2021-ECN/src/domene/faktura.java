package domene;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;

public class faktura {

	private int fakturaNr;
	private Class Kunde;
	private LocalDateTime date;
	private Date forfallsdato;
	private DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	
	public <T> void faktura(int fakturaNr, Class Kunde) {
		
		this.fakturaNr = fakturaNr;
		this.Kunde = Kunde;
		this.date = LocalDateTime.now();
		
		Date currentDate = new Date();
		Calendar c = Calendar.getInstance();
        c.setTime(currentDate);
        c.add(Calendar.DATE, 14);
        Date currentDatePlusFourTeen = c.getTime();
		this.forfallsdato = currentDatePlusFourTeen;
	}

	@Override
	public String toString() {
		return "faktura [fakturaNr=" + fakturaNr + "]";
	}

	/**
	 * @return the fakturaNr
	 */
	public int getFakturaNr() {
		return fakturaNr;
	}

	/**
	 * @param fakturaNr the fakturaNr to set
	 */
	public void setFakturaNr(int fakturaNr) {
		this.fakturaNr = fakturaNr;
	}

	public faktura() {
		// TODO Auto-generated constructor stub
	}

}
