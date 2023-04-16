import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {

    private List<Card> hand;
    private int score;

    private String name;

    public Player(){

    }

    public Player(int score, String name){
        this.hand = new ArrayList<>();
        this.score = score;
        this.name = name;
    }

    public void describe(){
        System.out.println("Name: " + name);
        System.out.println("Score: " + score);
        System.out.println("Hand: ");
        for (int i = 0; i < hand.size(); i++){          //Loops until it reaches the hand size
            System.out.println(i + "-");                //prints out every card as it loops
            hand.get(i).describe();                     //calls the describe method for each
        }
    }

    public Card flip(){
        Card cardToGrave = hand.get(0);                 //Sets CTG to the first card of the hand
        hand.remove(0);                           //Removes first card in the hand
        return cardToGrave;                             //Returns the first card
    }
    public void draw(Deck deck){
        hand.add(deck.draw());                          //Calls the draw method on the deck and adds it to the hand
    }
    public void incrementScore(){
        this.score++;                                   //Adds 1 to the score

    }
    public static String getUserName(){
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please Insert Name");
        return scanner.nextLine();
    }
    public List<Card> getHand(){
        return this.hand;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
