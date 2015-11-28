package doubledispatch;

public class FamilyMember implements Member {

	@Override
	public int calculateRentalFeeForCD() {
		// TODO Auto-generated method stub
		return 1000;
	}

	@Override
	public int calculateRentalFeeForDVD() {
		// TODO Auto-generated method stub
		return 3000;
	}

}
