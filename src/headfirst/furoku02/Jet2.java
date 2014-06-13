package headfirst.furoku02;

public class Jet2 extends Airplane2 {
	private static final int MULTIPLIER =2;
	
	public Jet2(){
		super();
	}
	
	@Override
	public void setSpeed(int speed){
		super.setSpeed(speed * MULTIPLIER);
	}
	
	public void accelerate(){
		super.setSpeed(getSpeed()*2);
	}
}
