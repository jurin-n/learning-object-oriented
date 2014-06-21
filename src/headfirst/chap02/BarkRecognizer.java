package headfirst.chap02;

public class BarkRecognizer {
	private DogDoor door;
	
	public BarkRecognizer(DogDoor door){
		this.door = door;
	}
	
	public void recognize(String bark){
		System.out.println(" BarkRecognizer:検知 -> '" + bark +"'");
		door.open();
	}
}
