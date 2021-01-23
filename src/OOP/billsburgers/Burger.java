package OOP.billsburgers;

/**
 * @author Hammad on 23/01/2021.
 * @project Java_Masterclass
 * <p>
 * Exercise - design and implement the basic application for a fictitious burger shop
 */
public class Burger {

    private String name;
    private String breadRollType;
    private String meat;
    private double price;
    private String add1 = null;
    private String add2 = null;
    private String add3 = null;
    private String add4 = null;
    private int itemsAdded;

    public int getItemsAdded() {
        return itemsAdded;
    }

    public Burger(String name, String breadRollType, String meat) {
        itemsAdded = 0;
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        switch (meat) {
            case "chicken":
                price = 2.1;
            case "lamb":
                price = 3.0;
            case "vegetable":
                price = 2.0;
            default:
                price = 1.0;
        }


    }

    public double addItem(String item) {
        if (itemsAdded >= 4) {
            System.out.println(itemsAdded + " items already added, unable to add any more items");
            return price;
        }
        switch (itemsAdded) {
            case 0:
                add1 = item;
            case 1:
                add2 = item;
            case 2:
                add3 = item;
            case 4:
                add4 = item;
        }
        price += 0.5;
        return price;
    }
}


class HealthyBurger extends Burger {

    private String add5 = null;
    private String add6 = null;

    public HealthyBurger(String meat) {
        super("Healthy Burger", "rye bread roll", meat);
    }

    @Override
    public double addItem(String item) {
        super.addItem(item);
        if (getItemsAdded() >= 4 && getItemsAdded() < 6) {
            switch (getItemsAdded()) {
                case
            }

        }
    }
}
