package headfirst.chap05;

public enum InstrumentType {
	GUITAR,BANJO,MANDOLIN,BASS,PIANO;
	
	public String toString(){
		switch(this){
			case GUITAR:return "Guitar";
			case BANJO:return "Banjo";
			case MANDOLIN:return "Mandolin";
			case BASS:return "Bass";
			case PIANO:return "Piano";
		}
		return "";

	}
}

