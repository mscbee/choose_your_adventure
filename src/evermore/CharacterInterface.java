package evermore;

/**
 * Created by cba50 on 27/12/2017.
 */
interface CharacterInterface {

    void type(String letter);
}

interface PlayerInterface {

    void addCoins(int number);
    void removeCoins(int number);
    void addLives(int number);
    void removeLives(int number);
}

