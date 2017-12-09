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

    if(polar_answer.equals("yes") {
      System.out.println("Great, " + playerName + "! Let's get started!");
    }
    else if(polar_answer.equals("no"){
      System.out.println("Okay, " + playerName + ". Maybe we can go another time!\n See you later!");
    }
    /* Replace with a do/while loop for this condition so that after being prompeted to only
    answer yes or no, the user is returned to 'Are you ready to go on an adventure?' */
    else {
      System.out.println("Please only respond with 'yes' or 'no'");
    }
  }
}
