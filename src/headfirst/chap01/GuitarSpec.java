package headfirst.chap01;

public class GuitarSpec {
	private Builder builder;
	private String model;
	private Type type;
	private int numStrings;
	private Wood backWood;
	private Wood topWood;

	public GuitarSpec(Builder builder,String model,Type type,int numStrings
			,Wood backWood,Wood topWood){
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.numStrings = numStrings;
		this.backWood = backWood;
		this.topWood = topWood;
	}
	
	public Builder getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}

	public Type getType() {
		return type;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}
	
	public int getNumStrings() {
		return numStrings;
	}
	
	public GuitarSpec getSpec(){
		return this;
	}
	
	public boolean matches(GuitarSpec searchSpec){
		if( builder != searchSpec.getBuilder())
			return false;
		
		if( model != null && !model.equals("")
				&& (!model.equals(searchSpec.getModel()))){
			return false;
		}
		
		if( type != searchSpec.getType())
			return false;
		
		if( numStrings != searchSpec.getNumStrings())
			return false;
		
		if( backWood != searchSpec.getBackWood())
			return false;
		
		if( topWood != searchSpec.getTopWood())
			return false;
		
		return true;
	}
	
}
