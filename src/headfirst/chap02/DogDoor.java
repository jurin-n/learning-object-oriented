package headfirst.chap02;

public class DogDoor {
	private boolean open;
	
	public DogDoor(){
		this.open = false;
	}
	
	public void open(){
		System.out.println("犬用ドアが開く。");
		open = true;
	}
	
	public void close(){
		System.out.println("犬用ドアが閉まる。");
		open = false;
	}
	
	public boolean isOpen(){
		return open;
	}
}
