import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

    private List<Card> cards;

    public List<Card> getCards(){
        return this.cards;
    }
    public void shuffle(int times){
        Random rand = new Random();
        int rando;
        Card temp;
        for (int i = 0; i < times; i++){
            for (int j = 0; j < this.cards.size()-1; j++){
                rando = rand.nextInt(this.cards.size()-1);

                temp = cards.get(j);
                cards.set(j, cards.get(rando));
                cards.set(rando,temp);


            }
        }
    }

    public Deck(){
        this.cards = new ArrayList<>();
    }
    public void standardDeckBuild(){
        for (int i = 0; i < 4; i++){
            for (int j = 2; j < 15; j++){
                cards.add(new Card(suits(i), j));
            }
        }
    }
    public String suits(int val){
        switch (val){
            case 0:
                return "Hearts";
            case 1:
                return "Spades";
            case 2:
                return "Diamonds";
            case 3:
                return "Clubs";
            default:
                return "ERROR";
        }
    }
    public void describe(){
        for (int i = 0; i < cards.size(); i++){
            System.out.print(i + " - ");     //count
            cards.get(i).describe();
        }
    }
    public Card draw(){
        Card cardToGrave = cards.get(0);
        cards.remove(0);
        return cardToGrave;
    }


}
