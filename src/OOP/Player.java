package OOP;

/**
 * @author Hammad on 23/01/2021.
 * @project Java_Masterclass
 * <p>
 * Encpsulation Example
 * Associated Classes - Enhanced Player
 */
public class Player {

    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = health - damage;
        if (this.health <= 0) {
            System.out.println("Player Knocked Out");
            // Reduce number of remaining lives for the player
        }
    }

    public int healthRemaining() {
        return this.health;
    }

}
