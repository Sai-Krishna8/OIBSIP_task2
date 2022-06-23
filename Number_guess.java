import java.util.*;
public class Number_guess {
    public static void main(String[] args)
    { 
      try (Scanner in = new Scanner(System.in)) {
        int Number_guess=1+(int)(100*Math.random());
          int Trials=6;
          System.out.println("Choose any number between 1 to 100");
          System.out.println("GAME STARTS");
          int i=0;
          for(i=0;i<6;i++){
              System.out.println("Guess the number:");
              int guess=in.nextInt();
              if(guess<0 || guess>100){
                  System.out.println("Invalid Number");
                  break;
              }
              if(guess==Number_guess){
               System.out.println("Congratulations You won the game");
                break;
              }
              else if(guess>Number_guess && (i!=Trials-1)){
                  System.out.println("Your number is Bigger.");
              } 
              else if(guess<Number_guess && (i!=Trials-1)){
                  System.out.println("Your Number is Smaller.");
              }
          }
          if(i==Trials){
              System.out.println("Your trials are completed ");
              System.out.println("The number is: "+Number_guess);
         
             }   
        }
    }
}
