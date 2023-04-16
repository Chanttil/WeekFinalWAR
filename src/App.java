import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Deck myDeck = new Deck();
        Player player1 = new Player(0, Player.getUserName());
        Player player2 = new Player(0, Player.getUserName());

        myDeck.standardDeckBuild();
//        myDeck.describe();
        myDeck.shuffle(50);
//        myDeck.describe();
        splitDeckCleaner(myDeck, player1, player2);
        player1.describe();
        System.out.println();
        player2.describe();
        playWar(player1, player2);

    }
    public static void splitDeckCleaner(Deck deck, Player player1, Player player2) {
        int size = deck.getCards().size();
        for (int i = 0; i < size; i += 2) {
            player1.draw(deck);
            player2.draw(deck);
        }
    }

    public static void splitDeck(Deck deck, Player player1, Player player2) {
        int size = deck.getCards().size();
        for (int i = 0; i < size; i ++) {
            if (i % 2 == 0)
                player1.draw(deck);
            else
                player2.draw(deck);
        }
    }
    public static void playWar(Player player1, Player player2){
        int size = player2.getHand().size();
        for (int i = 1; i < size+1; i++){
            System.out.println("Round " + i + ":");
            Card p1Card = player1.flip();
            Card p2Card = player2.flip();
            System.out.print(player1.getName() + " has the ");
            p1Card.describe();
            System.out.print(player2.getName() + " has the ");
            p2Card.describe();

            if (p1Card.getValue() > p2Card.getValue()){
                player1.incrementScore();
                System.out.println(player1.getName() +" has won this round");
            }
            else if (p1Card.getValue() < p2Card.getValue()){
                player2.incrementScore();
                System.out.println(player2.getName() +" has won this round");
            }
            else{
                System.out.println("This round draws");
            }
            System.out.println(player1.getName() + " " + player1.getScore() + " "
                    + player2.getName() + " " + player2.getScore());
        }
        if (player1.getScore() > player2.getScore()){
            System.out.println(player1.getName() + " has won the WAR");
        }
        else if (player1.getScore() < player2.getScore()){
            System.out.println(player2.getName() + " has won the WAR");
        }
        else{
            System.out.println("No one truly Wins in WAR");
        }
    }

}