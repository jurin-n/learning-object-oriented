package headfirst.chap01;

public class FindGuitarTester {
	public static void main(String[] args){
		//ギターの在庫を設定する
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		Guitar whatErinLikes = new Guitar("", 0, "fender", "Stratocastor"
				, "electric", "Alder", "Alder");
		
		Guitar guitar = inventory.search(whatErinLikes);
		if(guitar != null){
			System.out.println("Eric, you might like this " + 
					guitar.getBuilder() + " " + guitar.getModel()  +" " +
					guitar.getType() + " guitar:¥n " +
					guitar.getBackWood() + " back and sides,¥n " + 
					guitar.getTopWood() + " top.¥nYou can have it for only $" +
					guitar.getPrice() +"!"
					);
		}else{
			System.out.println("Sorry, Erin, we have nothing for you.");
		}
	}
	
	private static void initializeInventory(Inventory inventory){
		//在庫にギターを追加する
		inventory.addGuitar("V95693", 1499.95, "Fender", "Stratocastor", "electric", "Alder", "Alder");
	}
}
