//Make a higher or lower card game 
//
//Gives the user a random card 
//They have to choose whether the next card is going to be higher or lower 
//If they get it correct then they get a point 
//If they get it wrong then they loose one of there 3 lives 
//They have 15 rounds 
//They are gievn the option to play again

package higher_or_lower_cardgame;

import java.util.Scanner;
import java.util.Random; 


public class Higher_or_Lower_CardGame {
    
    
    
    public static void formalities(){
        System.out.println("Welcome to higher or lower");
        System.out.println("You will be given a card and you will have to choose whether the next numkber is higher or lower"); 
        System.out.println("In this game, aces a 1's, jacks are 11's, queens are 12's and kings are 13's ");
        System.out.println("You will have three lives");
        System.out.println("You have 15 rounds"); 
        System.out.println("You will get a point if you win"); 
        System.out.println("GOOD LUCK"); 
        System.out.println("");
        System.out.println("");
    }
    

    public static void main(String[] args) {
        formalities(); 
        game();     
    }

    public static void game(){
        Scanner input = new Scanner(System.in); 
        
        int score = 0;
        int lives = 0; 
        int round = 0; 
        boolean play = true; 
        
        while(lives<3 && round<15 && play == true){
            try{
                Random rand = new Random(); 
                int max = 13;
                int min = 1; 
                int playerCard = rand.nextInt((max - min)+1)+min;   
                int computerCard = rand.nextInt((max - min)+1)+min; 
                
                if(playerCard == 1){
                    System.out.println("Your card is... ACE(1)"); 
                }
                
                if(playerCard == 11){
                    System.out.println("Your card is... JACK(11) ");
                }
                
                if(playerCard == 12){
                    System.out.println("Your card is... QUEEN(12)");
                }
                
                if(playerCard == 13){
                    System.out.println("Your card is... KING(13)"); 
                }
                
                else{
                    System.out.println("Your card is... " + playerCard); 
                }
                
                System.out.println(""); 
                System.out.println("Higher or Lower");
                String HorL = input.next(); 
                
                if(HorL.equalsIgnoreCase("Higher")){
                    if(computerCard > playerCard){
                        System.out.println(""); 
                        System.out.println("Well done, thats correct");
                        score = score + 1; 
                        round = round + 1; 
                        System.out.println("");
                        System.out.println("Your score is ... " + score); 
                        System.out.println("");
                    }
                    if(computerCard < playerCard){
                        System.out.println("");
                        System.out.println("Sorry, that was wrong");
                        System.out.println("You have lost a life");
                        round = round + 1;
                        lives = lives + 1; 
                        System.out.println("");
                        System.out.println("Your score is ... " + score);
                        System.out.println("");
                    }
                    if(computerCard == playerCard){
                        System.out.println("");
                        System.out.println("They are the same"); 
                        System.out.println("Nothing happens here");
                        round = round + 1; 
                        System.out.println("");
                        System.out.println("Your score is ... " + score);
                        System.out.println("");
                    }
                    
                }
                
                if(HorL.equalsIgnoreCase("lower")){
                    if(computerCard < playerCard){
                        System.out.println(""); 
                        System.out.println("Well done, thats correct"); 
                        score = score + 1; 
                        round = round + 1; 
                        System.out.println("");
                        System.out.println("Your score is ... " + score); 
                        System.out.println("");
                    }
                    if(computerCard > playerCard){
                        System.out.println(""); 
                        System.out.println("This is wrong");
                        System.out.println("You have lost a life"); 
                        round = round + 1;
                        lives = lives + 1; 
                        System.out.println("");
                        System.out.println("Your score is ... " + score); 
                        System.out.println("");
                    }
                    if(computerCard == playerCard){
                        System.out.println(""); 
                        System.out.println("They are the same");
                        System.out.println("Nothing happens here"); 
                        round = round + 1; 
                        System.out.println("");
                        System.out.println("Your score is ... " + score); 
                        System.out.println("");
                    }
                }
                
                
                if(lives == 3){
                    endLives(); 
                    System.out.println(score); 
                    
                    playAgain();
                    
                }
                
                if(round == 15){
                    endRound(); 
                    System.out.println(score); 
                    
                    playAgain(); 
                }
                  
 
            }
            catch(Exception e){
                System.out.println("ERROR: e"); 
            }
        } 

    }
    
    
    
    public static void endLives(){
           System.out.println("You have used all of your lives!!");
           System.out.println("You have played well!");
           System.out.println("THANK YOU FOR PLAYING!"); 
           System.out.println("");
           System.out.println("Your final score was:");
    }
    
    
    
    public static void endRound(){
        System.out.println("WELL DONE!!");
        System.out.println("You have completed the game with out dying");
        System.out.println("You survived all 15 rounds");
        System.out.println("Your final score is:"); 
    }
    
    
    
    public static void playAgain(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("Would you like to play again?? Yes or No?");
        String again = input.next();
        
        if(again.equalsIgnoreCase("No")){
            System.out.println("");
            System.out.println("Okay, bye!");
        }
        else{
            System.out.println(""); 
            game(); 
        }

    }
    
    

}
