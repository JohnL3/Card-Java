package cardpractice;

public enum TypeValue {
	
	ACE(14,"ACE"),KING(13,"KING"),QUEEN(12,"QUEEN"),JACK(11,"JACK"),TEN(10,"TEN"),
	NINE(9,"NINE"),EIGHT(8,"EIGHT"),SEVEN(7,"SEVEN"),
	SIX(6,"SIX") ,FIVE(5,"FIVE"),FOUR(4,"FOUR"),THREE(3,"THREE"),TWO(2,"TWO");
	
	String type;
	int value;
	 TypeValue(int x,String y) {
		this.type=y;
		this.value =x;
	}
	 
	 public String getValue(){
		 return type;
	 }
	 public int getType(){
		 return value;
	 }
}
