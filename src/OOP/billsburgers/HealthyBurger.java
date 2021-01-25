package OOP.billsburgers;

/**
 * @author Hammad on 24/01/2021.
 * @project Java_Masterclass
 */
class HealthyBurger extends Burger {

    private String healthAddition1Name;
    private double healthAddition1Price;
    private String healthAddition2Name;
    private double healthAddition2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy Burger", "rye bread roll", meat, price);
    }

    public void healthAddition1(String item, double itemPrice) {
        this.healthAddition1Name = item;
        this.healthAddition1Price = itemPrice;
    }

    public void healthAddition2(String item, double itemPrice) {
        this.healthAddition2Name = item;
        this.healthAddition2Price = itemPrice;
    }

    @Override
    public double itemizedBurger() {
        double burgerPrice = super.itemizedBurger();
        if (healthAddition1Name != null) {
            System.out.println("Added " + healthAddition1Name + " for an extra " + healthAddition1Price);
            burgerPrice += healthAddition1Price;
        }

        if (healthAddition2Name != null) {
            System.out.println("Added " + healthAddition2Name + " for an extra " + healthAddition2Price);
            burgerPrice += healthAddition2Price;
        }
        return burgerPrice;
    }
}
