
public class IncendiesEvent extends AlarmeEvent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Boolean state;
	public IncendiesEvent(Object source,Boolean state,int nv,String loc) {
		super(source,nv,loc);
		this.setState(state);
	}
	public Boolean getState() {
		return state;
	}
	public void setState(Boolean state) {
		this.state = state;
	}
}
