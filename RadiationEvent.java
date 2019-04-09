
public class RadiationEvent extends AlarmeEvent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int niveau_radiation;
	public RadiationEvent(Object source,int R,int nv,String loc) {
		super(source,nv,loc);
		// TODO Auto-generated constructor stub
		this.niveau_radiation = R;
	}
	public int getNiveau_radiation() {
		return niveau_radiation;
	}
	public void setNiveau_radiation(int niveau_radiation) {
		this.niveau_radiation = niveau_radiation;
	}
	
}
