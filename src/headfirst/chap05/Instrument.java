package headfirst.chap05;

public class Instrument {
	private InstrumentType instrumentType;
	private String serialNumber;
	private double price;
	private InstrumentSpec spec;
	
	public Instrument(
			 InstrumentType instrumentType
			,String serialNumber
			,double price
			,InstrumentSpec spec){

		this.instrumentType=instrumentType;
		this.serialNumber=serialNumber;
		this.price=price;
		this.spec=spec;
	}
	
	public InstrumentType getInstrumentType() {
		return instrumentType;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public double getPrice() {
		return price;
	}
	
	public InstrumentSpec getSpec() {
		return spec;
	}
	
	public void setPrice(double newPrice) {
		this.price=newPrice;
	}
}
