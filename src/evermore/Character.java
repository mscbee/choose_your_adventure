package evermore;


/**
 * Created by cba50 on 27/12/2017.
 */
public class Character implements CharacterInterface {

    String name;

    public void type(String expression){
        for(int i = 0; i < expression.length(); i++) {
            System.out.print(expression.charAt(i));
            try {
                Thread.sleep(20);
            }
            catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
