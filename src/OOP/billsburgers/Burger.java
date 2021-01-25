package OOP.billsburgers;

/**
 * @author Hammad on 23/01/2021.
 * @project Java_Masterclass
 * <p>
 * Exercise - design and implement the basic application for a fictitious burger shop
 * Associated classes HealthyBurger and Deluxe Burger
 */
public class Burger {

    private String name;
    private String breadRollType;
    private String meat;
    private double price;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Burger(String name, String breadRollType, String meat, double price) {

        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;

    }

    public void burgerAddition1(String item, double itemPrice) {
        this.addition1Name = item;
        this.addition1Price = itemPrice;
    }

    public void burgerAddition2(String item, double itemPrice) {
        this.addition2Name = item;
        this.addition2Price = itemPrice;
    }

    public void burgerAddition3(String item, double itemPrice) {
        this.addition3Name = item;
        this.addition3Price = itemPrice;
    }

    public void burgerAddition4(String item, double itemPrice) {
        this.addition4Name = item;
        this.addition4Price = itemPrice;
    }

    public double itemizedBurger() {
        System.out.println(this.name + " on a " + this.breadRollType + " bread with " + meat +
                " meat. Price is " + this.price);

        if (addition1Name != null) {
            System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
            price += addition1Price;
        }

        if (addition2Name != null) {
            System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
            price += addition2Price;
        }

        if (addition3Name != null) {
            System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
            price += addition3Price;
        }

        if (addition4Name != null) {
            System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
            price += addition4Price;
        }

        return price;
    }
}


class MainBurger {
    public static void main(String[] args) {
        Burger burger = new Burger("basic", "white", "chicken", 4.99);
        burger.burgerAddition1("lettuce", 0.50);
        burger.burgerAddition2("tomato", 0.70);
        burger.burgerAddition3("Cucumber", 0.30);
        System.out.println("Total price: " + burger.itemizedBurger());
        System.out.println("*********************************************");

        HealthyBurger healthyBurger = new HealthyBurger("Lamb", 3.99);
        healthyBurger.healthAddition1("Cheese", 1.1);
        healthyBurger.healthAddition2("Onion", 0.80);
        System.out.println("Total Price is " + healthyBurger.itemizedBurger());
        System.out.println("*********************************************");

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.burgerAddition1("lettuce", 0.50);
        deluxeBurger.burgerAddition2("tomato", 0.70);
        deluxeBurger.burgerAddition3("Cucumber", 0.30);
        System.out.println("Total Price is " + deluxeBurger.itemizedBurger());
    }
}
