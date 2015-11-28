package doubledispatch;

public class GoldMember implements Member {

	@Override
	public int calculateRentalFeeForCD() {
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	public int calculateRentalFeeForDVD() {
		// TODO Auto-generated method stub
		return 150;
	}

}
