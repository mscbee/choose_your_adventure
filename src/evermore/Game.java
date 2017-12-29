package evermore;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Character Alice = new Character();
        Character Player = new Character();

        Scanner in = new Scanner(System.in);

        Alice.type("I'm Alice. What's your name? \n");
        Player.name = in.next();

        Alice.type("Hello, " + Player.name + ". Welcome to the World of Evermore. ");

        String adventure = "Are you ready to go on an adventure? \n";

        Alice.type(adventure);

        String polarAnswer = in.next();


        // TODO: Sort out the loop! At the moment, the do/while block isn't working as it should
        // but the if statement checking against the polarAnswer is crashing the programme!

        switch(polarAnswer)
        {
            case("yes"):
                Alice.type("Great, " + Player.name + "! Let's get started!");
                break;
            case("no"):
                Alice.type("Okay, " + Player.name + ". Maybe we can go another time!\n" + "See you later!");
                break;
            default:
                Alice.type("Please only respond with 'yes' or 'no'");
        }
    }
}

