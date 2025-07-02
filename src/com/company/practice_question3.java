package com.company;

import java.util.Random;
import java.util.Scanner;

     class game{
        private int randomNumber;
        private int attempts;
        private int maxAttempts;

     public game(int maxAttempts){
         Random r = new Random();
         this.randomNumber = r.nextInt(100) +1;
         this.attempts = 0;
         this.maxAttempts = maxAttempts;
     }
     public String makeGuess(int guess) {
         attempts++;
         if (guess < randomNumber) {
             return "too slow";
         } else if (guess > randomNumber) {
             return "too high";
         } else {
             return "congrats !you have guessed the no. " + attempts;
         }
     }
     public boolean isGameOver(){
     return attempts>=maxAttempts;
     }
     public String revealAnswer(){
     return "the no. was = "+randomNumber+".";
     }
     public int getAttempts(){
         return attempts;
     }
     }


    /*
    create a class game, which allow a user to play "guess the number "
    game once . game should have the following methods :
    1. constructor to generate the random no.
    2. takeUserInput() to take a user input of no.
    3. isCorrectNumber() to detect weather the number entered by the user is true
    4. getter and setter for noOfGuess
    using properties such as noOfGuesses(int) , etc to get this task done !
     */
       public class practice_question3 {
           public static void main(String[] args) {
               Scanner s= new Scanner(System.in);
               game game = new game(5);

               System.out.println("Welcome to Guess the Number game!");
               System.out.println("I've chosen a number between 1 and 100. You have " + game.getAttempts() + " attempts.");

               while (!game.isGameOver()) {
                   System.out.print("Enter your guess: ");
                   int guess = s.nextInt();
                   String result = game.makeGuess(guess);
                   System.out.println(result);
                   if (result.startsWith("Correct")) {
                       break;
                   }
               }
               if (game.isGameOver() && !game.makeGuess(s.nextInt()).startsWith("congrats")){
                   System.out.println("you have run out of attempts."+game.revealAnswer());
               }

               s.close();
           }
       }






