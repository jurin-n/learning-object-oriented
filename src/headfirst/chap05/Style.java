package headfirst.chap05;

public enum Style {
	A,F;
	
	public String toString(){
		switch(this){
			case A:return "A style";
			case F:return "F style";
		}
		return "";
	}
}
