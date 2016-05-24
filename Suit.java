package cardpractice;

public enum Suit {

	HEARTS(1,"HEARTS"),DIAMONDS(2,"DIAMONDS"),SPADES(3,"SPADES"),CLUBS(4,"CLUBS");
	

	
	int rank;
	String type;
	Suit(int x,String type){
		this.rank=x;
		this.type=type;
		
	}
	public int getRank(){
		return rank;
	}
	public String getType(){
		return type;
	}
}
