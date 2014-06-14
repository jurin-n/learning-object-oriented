package headfirst.chap01;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class InventoryTest {
	//ギターの在庫を設定する
	Inventory inventory = new Inventory();
	
	@Before
	public void setUp(){
		//在庫にギターを追加する
		inventory.addGuitar("V95693", 1499.95, new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER));
		inventory.addGuitar("V95692", 1480.95, new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER));
		inventory.addGuitar("V9512", 1500.95, new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.COCOBOLO, Wood.COCOBOLO));
		inventory.addGuitar("G9512", 1500.95, new GuitarSpec(Builder.GIBSON, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER));
		inventory.addGuitar("F9512", 1500.95, new GuitarSpec(Builder.GIBSON, "Stratocastor", Type.ACOUSTIC, Wood.ALDER, Wood.ALDER));
		inventory.addGuitar("A222" , 1500.95, new GuitarSpec(Builder.COLLINGS, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER));
	}
	
	@Test
	public void test() {

		GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor"
				, Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
		
		List<Guitar> matchingGuitars = inventory.search(whatErinLikes);
		Iterator<Guitar> i = matchingGuitars.iterator();
		Guitar guitar = (Guitar)i.next();
		GuitarSpec spec = guitar.getSpec();
		assertThat(spec.getBuilder() ,is(Builder.FENDER));
		assertThat(spec.getModel() ,is("Stratocastor"));
		assertThat(spec.getType() ,is(Type.ELECTRIC));
		assertThat(spec.getBackWood() ,is(Wood.ALDER));
		assertThat(spec.getTopWood() ,is(Wood.ALDER));
		assertThat(guitar.getPrice() ,is(1499.95));
		
		guitar = (Guitar)i.next();
		spec = guitar.getSpec();
		assertThat(spec.getBuilder() ,is(Builder.FENDER));
		assertThat(spec.getModel() ,is("Stratocastor"));
		assertThat(spec.getType() ,is(Type.ELECTRIC));
		assertThat(spec.getBackWood() ,is(Wood.ALDER));
		assertThat(spec.getTopWood() ,is(Wood.ALDER));
		assertThat(guitar.getPrice() ,is(1480.95));
	}

}
