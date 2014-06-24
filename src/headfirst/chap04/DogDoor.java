package headfirst.chap04;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
	private boolean open;
	private List<Bark> allowedBarks = new ArrayList<Bark>();
	
	public DogDoor(){
		this.open = false;
	}
	
	public void open(){
		System.out.println("犬用ドアが開く。");
		open = true;
		final Timer timer = new Timer();
		timer.schedule(
				new TimerTask(){
					public void run(){
						close();
						timer.cancel();
					}
				},5000);
	}
	
	public void close(){
		System.out.println("犬用ドアが閉まる。");
		open = false;
	}
	
	public boolean isOpen(){
		return open;
	}

	public void addAllowedBark(Bark bark) {
		allowedBarks.add(bark);
	}

	public List<Bark> getAllowedBark() {
		return allowedBarks;
	}
}
