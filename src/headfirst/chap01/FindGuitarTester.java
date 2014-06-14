package headfirst.chap01;

import java.util.List;

import java.util.Iterator;

public class FindGuitarTester {
	public static void main(String[] args){
		//ギターの在庫を設定する
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		Guitar whatErinLikes = new Guitar("", 0, Builder.FENDER, "Stratocastor"
				, Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
		
		List<Guitar> matchingGuitars = inventory.search(whatErinLikes);
		if(!matchingGuitars.isEmpty()){
			System.out.println("Eric, you might like these guitars: ");
			
			for(Iterator<Guitar> i = matchingGuitars.iterator(); i.hasNext();){
				Guitar guitar = (Guitar)i.next();
				System.out.println(
					"We have a " + 
					guitar.getBuilder() + " " + guitar.getModel()  +" " +
					guitar.getType() + " guitar: \n " +
					guitar.getBackWood() + " back and sides,\n " + 
					guitar.getTopWood() + " top.\nYou can have it for only $" +
					guitar.getPrice() +"!"
					);
				System.out.println("-------------------------------------------");
			}
		}else{
			System.out.println("Sorry, Erin, we have nothing for you.");
		}
	}
	
	private static void initializeInventory(Inventory inventory){
		//在庫にギターを追加する
		inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
		inventory.addGuitar("V95692", 1480.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
		inventory.addGuitar("V9512", 1500.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.COCOBOLO, Wood.COCOBOLO);
		inventory.addGuitar("G9512", 1500.95, Builder.GIBSON, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
		inventory.addGuitar("F9512", 1500.95, Builder.GIBSON, "Stratocastor", Type.ACOUSTIC, Wood.ALDER, Wood.ALDER);
		inventory.addGuitar("A222" , 1500.95, Builder.COLLINGS, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
	}
}
