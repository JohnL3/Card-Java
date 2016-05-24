package cardpractice;

import java.util.ArrayList;



public class Dealer extends PokerPersonType{

	private static int count;
	private int add=PokerPlayer.count;
	
	private static String cardA;
	private static String cardB;
	private static String cardC;
	private static String cardD;
	private static String cardE;
	
	private static boolean RoyalFlush=true;
	private static int CardsLeft=7;
	private static int SpaceLeft=5;
	
	private static boolean checkCardRank;
	private static boolean checkCardSuitH;
	private static boolean checkCardSuitD;
	private static boolean checkCardSuitC;
	private static boolean checkCardSuitS;
	
	{
		Dealer.count=Dealer.count+add;
	}
	
	public Dealer(String name) {
		super(name);
	}
	
	public void dealCards(ArrayList<PokerPlayer> players){
		Card.loadCards();
		Card.shuffleCards(Card.pack1);

		//Dealer.howManyPlayers(players);

		/*for (PokerPlayer ele:players){
			System.out.println(ele.toString());			
		}*/
		
		//Dealer.dealFlopTurnRiver(players);

	}
	/*
	 * 	Method to deal the flop turn and river
	 */
	
	/*private static void dealFlopTurnRiver(ArrayList<PokerPlayer> players){
		int start=(Dealer.count*2);
		System.out.println("**** Dealing the Flop ****");
		Dealer.setCardA(Card.pack1[start][1],Card.pack1[start][0]);
		for(PokerPlayer play:players){
			PokerPlayer.setCardThree(Card.pack1[start][1],Card.pack1[start][0]);
		}
		Dealer.setCardB(Card.pack1[start+1][1],Card.pack1[start+1][0]);
		for(PokerPlayer play:players){
			PokerPlayer.setCardFour(Card.pack1[start+1][1],Card.pack1[start+1][0]);
		}
		Dealer.setCardC(Card.pack1[start+2][1],Card.pack1[start+2][0]);
		for(PokerPlayer play:players){
			PokerPlayer.setCardFive(Card.pack1[start+2][1],Card.pack1[start+2][0]);
		}
		System.out.println(Dealer.getCardA());
		System.out.println(Dealer.getCardB());
		System.out.println(Dealer.getCardC());
		System.out.println("**** Dealing the Turn ****");
		Dealer.setCardD(Card.pack1[start+3][1],Card.pack1[start+3][0]);
		for(PokerPlayer play:players){
			PokerPlayer.setTurnCard(Card.pack1[start+3][1],Card.pack1[start+3][0]);
		}
		System.out.println(Dealer.getCardD());
		System.out.println("**** Dealing the River ****");
		Dealer.setCardE(Card.pack1[start+4][1],Card.pack1[start+4][0]);
		for(PokerPlayer play:players){
			PokerPlayer.setRiverCard(Card.pack1[start+4][1],Card.pack1[start+4][0]);
		}
		System.out.println(Dealer.getCardE()+"\n");
		
		String thisOne=Card.pack1[6][1]+" "+Card.pack1[6][0];
		
	}

	private static void howManyPlayers(ArrayList<PokerPlayer> players){
		
		switch (Dealer.count){
		case 1:
			players.get(0).setCardOne(Card.pack1[0][1],Card.pack1[0][0]);
			players.get(0).setCardTwo(Card.pack1[1][1],Card.pack1[1][0]);
			break;
		case 2:
			players.get(0).setCardOne(Card.pack1[0][1], Card.pack1[0][0]);
			//String testCard=players.get(0).getCardOne();
			//rangeOfHands(Card.pack1[0][1],Card.pack1[0][0]);
			Dealer.contains(players.get(0).getCardOne());
			
			players.get(0).setCardTwo(Card.pack1[2][1], Card.pack1[2][0]);
			Dealer.contains(players.get(0).getCardTwo());
			
			players.get(1).setCardOne(Card.pack1[1][1], Card.pack1[1][0]);
			Dealer.contains(players.get(1).getCardOne());
			players.get(1).setCardTwo(Card.pack1[3][1], Card.pack1[3][0]);
			Dealer.contains(players.get(1).getCardTwo());
			break;
		case 4:
			players.get(0).setCardOne(Card.pack1[0][1], Card.pack1[0][0]);
			
			players.get(0).setCardTwo(Card.pack1[4][1], Card.pack1[4][0]);

			players.get(1).setCardOne(Card.pack1[1][1], Card.pack1[1][0]);
			players.get(1).setCardTwo(Card.pack1[5][1], Card.pack1[5][0]);
			
			players.get(2).setCardOne(Card.pack1[2][1], Card.pack1[2][0]);
			players.get(2).setCardTwo(Card.pack1[6][1], Card.pack1[6][0]);

			players.get(3).setCardOne(Card.pack1[3][1], Card.pack1[3][0]);
			players.get(3).setCardTwo(Card.pack1[7][1], Card.pack1[7][0]);
			break;
		}
	}

	private static String getCardA() {
		return Dealer.cardA;
	}

	private static String getCardB() {
		return Dealer.cardB;
	}

	private static String getCardC() {
		return Dealer.cardC;
	}

	private static String getCardD() {
		return Dealer.cardD;
	}

	private static String getCardE() {
		return Dealer.cardE;
	}

	private static void setCardA(Object x,Object y) {
		Dealer.cardA = x+" "+y;
	}

	private static void setCardB(Object x,Object y) {
		Dealer.cardB = x+" "+y;
	}

	private static void setCardC(Object x,Object y) {
		Dealer.cardC = x+" "+y;
	}

	private static void setCardD(Object x,Object y) {
		Dealer.cardD = x+" "+y;
	}

	private static void setCardE(Object x,Object y) {
		Dealer.cardE = x+" "+y;
	}

	void rangeOfHands(ArrayList<PokerPlayer> players){
		if(Dealer.RoyalFlush&&CardsLeft>=SpaceLeft){
			
			if(Dealer.checkCardRank){
				Dealer.SpaceLeft-=1;
				Dealer.CardsLeft-=1;
				Dealer.RoyalFlush=true;
			}
		}else{
			Dealer.CardsLeft-=1;
			if(Dealer.CardsLeft>=Dealer.SpaceLeft){
				Dealer.RoyalFlush=true;
			}else{
				Dealer.RoyalFlush=false;
			}
		}
		
	}

	static void contains(String x){
		int blankSpace=x.indexOf(" ");
		String suit=x.substring(blankSpace);
		String rank=x.substring(0, blankSpace);
		//System.out.println("Rank is "+rank+" "+"Suit is "+suit);
		if(rank.equals("TEN")||rank.equals("JACK")||rank.equals("QUEEN")||rank.equals("KING")||rank.equals("ACE")){
			Dealer.checkCardRank=true;
			
		}
		
	}
	static void checkSuit(String x){
		
	}*/
	
}
