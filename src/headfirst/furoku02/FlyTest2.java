package headfirst.furoku02;

public class FlyTest2 {
	public static void main(String[] args){
		Jet2 jet1 = new Jet2();
		jet1.speed = 212;
		System.out.println(jet1.speed);
		
		Jet2 jet2 = new Jet2();
		jet2.setSpeed(212);
		System.out.println(jet2.getSpeed());
	}
}
