import java.util.ArrayList;

public class CapteurSourceGaz {
	private ArrayList<GazListener> gazListener = new ArrayList<GazListener>();
	public CapteurSourceGaz() {
		
	}
	public void addGazListener( GazListener l){ 
		gazListener.add(l);
   }
   public void removeGazListener(GazListener  l){
	   gazListener.remove(l);
   }
   
}


