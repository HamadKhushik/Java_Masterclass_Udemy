package OOP.billsburgers;

/**
 * @author Hammad on 24/01/2021.
 * @project Java_Masterclass
 */
public class DeluxeBurger extends Burger {

    public DeluxeBurger() {
        super("Deluxe Burger", "White", "Mix meat", 9.25);
        super.burgerAddition1("chips", 2.50);
        super.burgerAddition2("Drink", 1.99);
    }

    @Override
    public void burgerAddition1(String item, double itemPrice) {
        System.out.println("additions not possible in a deluxe burger");
    }

    @Override
    public void burgerAddition2(String item, double itemPrice) {
        System.out.println("additions not possible in a deluxe burger");
    }

    @Override
    public void burgerAddition3(String item, double itemPrice) {
        System.out.println("additions not possible in a deluxe burger");
    }

    @Override
    public void burgerAddition4(String item, double itemPrice) {
        System.out.println("additions not possible in a deluxe burger");
    }
}
