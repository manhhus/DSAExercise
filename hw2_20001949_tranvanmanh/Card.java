package hw2_20001949_tranvanmanh;

class Card implements Comparable<Card> {
	
    private int rank;
    private int suit;
    
    public Card() {
    	
    }
    
    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }
    
    public int getvalue(){
        return 4 * rank + suit;
    }
    
    public String toString() {
        String[] s = {"Hearts","Diamonds","Clubs","Spader"};
        String[] r = {"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
        return r[rank - 1] + " " + s[suit - 1];
    }
	  
	@Override
	public int compareTo(Card o) {
		// TODO Auto-generated method stub
		if(rank > o.rank) return 1;
		else if(rank == o.rank) {
			if(suit < o.suit) return 1;
			else if(suit == o.suit) return 0;
			else return -1;
		} else {
			return -1;
		}
	}

}