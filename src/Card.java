import java.awt.*;

public class Card {

    private int value;
    private String name;
    private String suit;

    public static String valueName(int val){
        switch (val){
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            case 10:
                return "Ten";
            case 11:
                return "Jack";
            case 12:
                return "Queen";
            case 13:
                return "King";
            case 14:
                return "Ace";
            default:
                return "ERROR JOker";
        }
    }

    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
        this.name = valueName(value) + " of " + suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void describe(){
        System.out.println(name);
    }
}
