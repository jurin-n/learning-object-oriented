package headfirst.chap05;

import java.util.*;

public class FindInstrumentTester {
	public static void main(String[] args){
		//在庫を設定する
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		Map<String,Object> properties = new HashMap<String,Object>();
		properties.put("builder", Builder.GIBSON);
		properties.put("backWood", Wood.MAPLE);
		InstrumentSpec clientSpec = new InstrumentSpec(properties);
		
		List<Instrument> matchingInstruments = inventory.search(clientSpec);
		
		if(!matchingInstruments.isEmpty()){
			
			for(Iterator<Instrument> i = matchingInstruments.iterator(); i.hasNext();){
				Instrument instrument = i.next();
				InstrumentSpec spec = instrument.getSpec();
				
				System.out.println("We have a " + spec.getProperty("instrumentType") + 
						" with the following properties:");
				
				for(Iterator<String> j = spec.getProperties().keySet().iterator(); j.hasNext();){
					String propertyName = j.next();
					if(propertyName.equals("instrumentType"))
						continue;
					System.out.println(" " + propertyName + ": " + spec.getProperty(propertyName));
				}
				System.out.println(" You can have this " + 
						spec.getProperty("instrumentType") + " for $" +
						instrument.getPrice() + "\n---");
			}
		}else{
			System.out.println("Sorry, we have nothing for you.");
		}
	}
	
	private static void initializeInventory(Inventory inventory){
		//在庫にギターを追加する
		Map<String,Object> properties = new HashMap<String,Object>();
		properties.put("instrumentType", InstrumentType.GUITAR);
		properties.put("builder", Builder.GIBSON);
		properties.put("backWood", Wood.MAPLE);
		inventory.addInstrument("V95693", 1499.95, new InstrumentSpec(properties));
		inventory.addInstrument("V95692", 1480.95, new InstrumentSpec(properties));
		
		Map<String,Object> properties2 = new HashMap<String,Object>();
		properties2.put("instrumentType", InstrumentType.BANJO);
		properties2.put("builder", Builder.GIBSON);
		properties2.put("backWood", Wood.MAPLE);
		inventory.addInstrument("B1", 300, new InstrumentSpec(properties2));
		inventory.addInstrument("B2", 400.95, new InstrumentSpec(properties2));
		
		
		Map<String,Object> properties3 = new HashMap<String,Object>();
		properties3.put("instrumentType", InstrumentType.BANJO);
		properties3.put("builder", Builder.FENDER);
		properties3.put("backWood", Wood.MAPLE);
		inventory.addInstrument("BB1", 300, new InstrumentSpec(properties3));
		inventory.addInstrument("BB2", 400.95, new InstrumentSpec(properties3));
	}
}
