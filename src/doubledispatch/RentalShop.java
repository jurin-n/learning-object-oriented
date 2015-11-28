package doubledispatch;

public class RentalShop {
	public int calculateRentalFee( Item item , Member member ) { 
	    return item.calculateRentalFee( member ) ; 
	}
}
