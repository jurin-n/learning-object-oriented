package headfirst.chap05;

public abstract class InstrumentSpec {
	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood;
	private Wood topWood;
	
	public InstrumentSpec(Builder builder,String model,Type type
			,Wood backWood,Wood topWood){
		this.builder = builder;
		this.model = model;
		this.type = type;
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
	
	
	public InstrumentSpec getSpec(){
		return this;
	}
	
	public boolean matches(InstrumentSpec searchSpec){
		if( builder != searchSpec.getBuilder())
			return false;
		
		if( model != null && !model.equals("")
				&& (!model.equals(searchSpec.getModel()))){
			return false;
		}
		
		if( type != searchSpec.getType())
			return false;
			
		if( backWood != searchSpec.getBackWood())
			return false;
		
		if( topWood != searchSpec.getTopWood())
			return false;
		
		return true;
	}
}
