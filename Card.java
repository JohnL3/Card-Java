
package cardpractice;

public class Card {
	
	private static int x=0;
	
	static Object[][] pack1 =new Object[52][3];
	
	// method used to creat the pack of cards
	public static void loadCards(){
		for (Suit suit:Suit.values()){
			for (TypeValue type:TypeValue.values()){
				Card.pack1[Card.x][0]=suit;
				Card.pack1[Card.x][1]=type;
				Card.pack1[Card.x][2]=suit.getRank();
				Card.x++;
			}
		}
	}
	
	

	public static void shuffleCards(Object pack){
		int numEle = Card.pack1.length;
		for(int i=0;i <numEle;i++){
			int s= (int) (i+(Math.random())*(numEle-i));
			Object temp = Card.pack1[s][1];
			Object tempb=Card.pack1[s][0];
			Object tempc=Card.pack1[s][2];
			Card.pack1[s][1]=Card.pack1[i][1];
			Card.pack1[s][0]=Card.pack1[i][0];
			Card.pack1[s][2]=Card.pack1[i][2];
			Card.pack1[i][1]=temp;
			Card.pack1[i][0]=tempb;
			Card.pack1[i][2]=tempc;
			
			}		
	}
}
