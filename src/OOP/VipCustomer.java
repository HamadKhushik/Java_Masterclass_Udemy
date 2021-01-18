package OOP;

/**
 * @author Hammad on 18/01/2021.
 * @project Java_Masterclass
 */
public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer() {
        this("Tim", 12345, "tim@myemail.com");
        System.out.println("empty constructor");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, name + "@myemail.com");
        System.out.println("constructor with 2 arguments");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        System.out.println("main construtor");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
