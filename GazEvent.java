
public class GazEvent extends AlarmeEvent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String type;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public GazEvent(Object source,String type,int nv,String loc) {
		super(source,nv,loc);
		this.type = type;
	}
}
