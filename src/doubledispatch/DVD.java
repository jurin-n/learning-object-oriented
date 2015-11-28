package doubledispatch;

import java.util.Date;

public class DVD implements Item {
	private String name;
	private Date createDate;
	
	public String getName() {
		return name;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int calculateRentalFee(Member member) {
		// TODO Auto-generated method stub
		return member.calculateRentalFeeForDVD();
	}

}
