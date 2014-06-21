package headfirst.chap02;

public class DogDoorSimulator2 {
	public static void main(String[] args){
		DogDoor door = new DogDoor();
		BarkRecognizer recognizer = new BarkRecognizer(door);
	
		System.out.println("*** 代替パステスト  ***");		
		System.out.println("Fidoが外に出たいと吠える・・・");
		recognizer.recognize("あう〜〜〜");
		
		System.out.println("\nFidoが外に出る・・・");
		System.out.println("\nFidoが用を済ます・・・");
		
		try{
			Thread.sleep(10000);
		}catch(InterruptedException e){}

		System.out.println("・・・外にしめだされる");

		System.out.println("\nFidoが吠え始める");
		recognizer.recognize("あう〜〜〜");
		
		System.out.println("\nFidoが家の中に戻る・・・");
		
	}
}
