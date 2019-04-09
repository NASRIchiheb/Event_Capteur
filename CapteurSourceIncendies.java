import java.util.ArrayList;

public class CapteurSourceIncendies {
	private ArrayList<IncendiesListener> incendiesListener = new ArrayList<IncendiesListener>();
	public void CapteurSourceIncendie() {
		
	}
	public void addIncendiesListener( IncendiesListener l){ 
		incendiesListener.add(l);
   }
   public void removeIncendiesListener(IncendiesListener  l){
	   incendiesListener.remove(l);
   }
   
}
