package headfirst.chap05;

import java.util.List;

import java.util.Iterator;

public class FindGuitarTester {
	public static void main(String[] args){
		//ギターの在庫を設定する
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor"
				, Type.ELECTRIC, 12, Wood.ALDER, Wood.ALDER);
		
		List<Guitar> matchingGuitars = inventory.search(whatErinLikes);
		if(!matchingGuitars.isEmpty()){
			System.out.println("Eric, you might like these guitars: ");
			
			for(Iterator<Guitar> i = matchingGuitars.iterator(); i.hasNext();){
				Guitar guitar = (Guitar)i.next();
				GuitarSpec spec = (GuitarSpec) guitar.getSpec();
				System.out.println(
						"We have a " + 
						spec.getBuilder() + " " + spec.getModel()  +" " +
						spec.getType() + " guitar: \n " +
						spec.getBackWood() + " back and sides,\n " + 
						spec.getTopWood() + " top.\nYou can have it for only $" +
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
		inventory.addInstrument("V95693", 1499.95, new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC,12, Wood.ALDER, Wood.ALDER));
		inventory.addInstrument("V95692", 1480.95, new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC,12, Wood.ALDER, Wood.ALDER));
		inventory.addInstrument("V9512", 1500.95, new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC,12, Wood.COCOBOLO, Wood.COCOBOLO));
		inventory.addInstrument("G9512", 1500.95, new GuitarSpec(Builder.GIBSON, "Stratocastor", Type.ELECTRIC,12, Wood.ALDER, Wood.ALDER));
		inventory.addInstrument("F9512", 1500.95, new GuitarSpec(Builder.GIBSON, "Stratocastor", Type.ACOUSTIC,12, Wood.ALDER, Wood.ALDER));
		inventory.addInstrument("A222" , 1500.95, new GuitarSpec(Builder.COLLINGS, "Stratocastor", Type.ELECTRIC,12, Wood.ALDER, Wood.ALDER));
	}
}
