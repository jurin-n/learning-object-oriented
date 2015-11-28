package doubledispatch;

import java.util.Date;

public class Book implements Item {
	private String name;
	private Date createDate;
	
	public String getName() {
		return name;
	}

	public Date getCreateDate() {
		return createDate;
	}
	
	@Override
	public int calculateRentalFee(Member member) {
		// TODO Auto-generated method stub
		return member.calculateRentalFeeForBook();
	}

}
