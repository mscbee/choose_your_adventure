import java.util.Scanner;

public class Game {
  public static void main(String[] args) {

    String playerName, polarAnswer;
    Scanner in = new Scanner(System.in);
    System.out.println("I'm Alice. What's your name? ");
    playerName = in.next();

    System.out.println("Hello, " + playerName + ". Welcome to the World of Evermore.\n");
    System.out.println("Are you ready to go on an adventure?");
    polarAnswer = in.next();

    // TODO: Sort out the logic! At the moment, the do/while block is working as it should
    // but the if statement checking against the polarAnswer is crashing the programme!
    
    do {

      System.out.println("Please only respond with 'yes' or 'no'");
      System.out.println("Are you ready to go on an adventure?");
      polarAnswer = in.next();

    }
      while (!polarAnswer.equalsIgnoreCase("yes") || !polarAnswer.equalsIgnoreCase("no"));

    if(polarAnswer.equalsIgnoreCase("yes")) {
      System.out.println("Great, " + playerName + "! Let's get started!");
    }
    else if(polarAnswer.equalsIgnoreCase("no")) {
      System.out.println("Okay, " + playerName + ". Maybe we can go another time!\nSee you later!");
    }

  }
}
