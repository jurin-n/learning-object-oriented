package doubledispatch;

public class CommonMember implements Member {

	@Override
	public int calculateRentalFeeForCD() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public int calculateRentalFeeForDVD() {
		// TODO Auto-generated method stub
		return 300;
	}

	@Override
	public int calculateRentalFeeForBook() {
		// TODO Auto-generated method stub
		return 50;
	}

}
