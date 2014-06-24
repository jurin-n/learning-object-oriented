package headfirst.chap04;

import java.util.Iterator;
import java.util.List;

public class BarkRecognizer {
	private DogDoor door;
	
	public BarkRecognizer(DogDoor door){
		this.door = door;
	}
	
	
	public void recognize(String bark){
		System.out.println(" BarkRecognizer:検知 -> '" + bark +"'");
		door.open();
	}

	public void recognize(Bark bark) {
		System.out.println(" BarkRecognizer:検知 -> '" + bark.getSound() +"'");
		List<Bark> allowedBarks = door.getAllowedBark();
		for(Iterator<Bark> i = allowedBarks.iterator(); i.hasNext();){
			Bark allowedBark = (Bark)i.next();
			if(allowedBark.equals(bark)){
				door.open();
				return;
			}
		}
		System.out.println("この犬は許可されていません");
	}
}
