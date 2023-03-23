

import java.util.ArrayList;


public class Player{

    
private  ArrayList<String> player1 = new ArrayList<String>();
private  ArrayList<String> player2 = new ArrayList<String>();


    Card cardobj=new Card();


    ArrayList<String> deck = cardobj.makeDeck();

    public ArrayList<String> cardsToPlayerOne() {
        for (int i = 0; i < 6; i++) {
            player1.add(deck.get(i));
            deck.remove(i);

           
        }

        return player1;
    }

    
    public  ArrayList<String>   cardsToPlayerTwo(){
        for (int i = 0; i < 6; i++) {
            player2.add(deck.get(i));
            
            deck.remove(i);

        }
        return player2;
    }




}