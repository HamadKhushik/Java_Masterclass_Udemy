package OOP;

/**
 * @author Hammad on 18/01/2021.
 * @project Java_Masterclass
 */
public class Main {
    public static void main(String[] args) {
        VipCustomer defaul_t = new VipCustomer();
        VipCustomer sam = new VipCustomer("Sam", 123344);
        VipCustomer samantha = new VipCustomer("Samantha", 98765, "samantha@myemail.com");

        System.out.println("name " + defaul_t.getName() + ", credit limit " + defaul_t.getCreditLimit() + ", " +
                "email " + defaul_t.getEmail());
        System.out.println("name " + sam.getName() + ", credit limit " + sam.getCreditLimit() + ", " +
                "email " + sam.getEmail());
        System.out.println("name " + samantha.getName() + ", credit limit " + samantha.getCreditLimit() + ", " +
                "email " + samantha.getEmail());
    }

}
