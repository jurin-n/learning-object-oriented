package headfirst.chap02;

public class DogDoorSimulator3 {
	public static void main(String[] args){
		DogDoor door = new DogDoor();
		Remote remote = new Remote(door);
	
		System.out.println("*** 代替パステスト  ***");		
		System.out.println("Fidoが外に出たいと吠える・・・");
		remote.pressButton();
		System.out.println("\nFidoが外に出る・・・");
		System.out.println("\nFidoが用を済ます・・・");
		try{
			Thread.sleep(10000);
		}catch(InterruptedException e){}

		System.out.println("\nFidoが吠え始める");
		System.out.println("・・・しかし、まだ外にいる！");
		remote.pressButton();
		System.out.println("\nFidoが家の中に戻る・・・");
		
	}
}
