package doubledispatch;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class RentalShopTest {
	RentalShop shop = null;

	@Before
	public void setUp(){
		shop = new RentalShop();
	}
	
	@Test
	public void test一般メンバのCDレンタル料金は100() {
		Member member = new CommonMember();
		Item item = new CD();
		assertThat(shop.calculateRentalFee(item, member),is(100));
	}
	
	@Test
	public void test一般メンバのDVDレンタル料金は300() {
		Member member = new CommonMember();
		Item item = new DVD();
		assertThat(shop.calculateRentalFee(item, member),is(300));
	}
	
	@Test
	public void testゴールドメンバのCDレンタル料金は50() {
		Member member = new GoldMember();
		Item item= new CD();
		assertThat(shop.calculateRentalFee(item, member),is(50));
	}
	
	@Test
	public void testゴールドメンバのDVDレンタル料金は150() {
		Member member = new GoldMember();
		Item item= new DVD();
		assertThat(shop.calculateRentalFee(item, member),is(150));
	}
	
	@Test
	public void testファミリーメンバのCDレンタル料金は1000() {
		Member member = new FamilyMember();
		Item item= new CD();
		assertThat(shop.calculateRentalFee(item, member),is(1000));
	}
	
	@Test
	public void testファミリーメンバのDVDレンタル料金は3000() {
		Member member = new FamilyMember();
		Item item= new DVD();
		assertThat(shop.calculateRentalFee(item, member),is(3000));
	}
}
