package headfirst.chap04;

public class DogDoorSimulator {

  public static void main(String[] args) {
    DogDoor door = new DogDoor();
    door.addAllowedBark(new Bark("ロー"));
    door.addAllowedBark(new Bark("ローー"));
    door.addAllowedBark(new Bark("ラル"));
    door.addAllowedBark(new Bark("ウー"));
    BarkRecognizer recognizer = new BarkRecognizer(door);
    
    @SuppressWarnings("unused")
	Remote remote = new Remote(door);

    // Simulate the hardware hearing a bark
    System.out.println("Bruceが吠え出す。");
    recognizer.recognize(new Bark("ロー"));

    System.out.println("\nBruceが外に出る...");

    try {
      Thread.sleep(10000);
    } catch (InterruptedException e) { }

    System.out.println("\nBruceが用をすます...");
    System.out.println("...しかし外に閉め出される！");

    // Simulate the hardware hearing a bark (not Bruce!)
    Bark smallDogBark = new Bark("キャン");
    System.out.println("小さな犬が吠え出す。");
    recognizer.recognize(smallDogBark);

    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) { }

    // Simulate the hardware hearing a bark again
    System.out.println("\nBruceが吠え出す。");
    recognizer.recognize(new Bark("ローー"));

    System.out.println("\nBruceが中に戻る...");
  }
}
