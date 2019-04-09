import java.util.Date;
import java.util.EventObject;

public class AlarmeEvent extends EventObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date date;
	private String localisation;
	private int niveau;
	
	public AlarmeEvent(Object source,int nv,String loc) {
		super(source);
		this.localisation = loc;
		this.niveau = nv;
		this.date = new Date();		
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getLocalisation() {
		return localisation;
	}
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}
	public int getNiveau() {
		return niveau;
	}
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	
}
