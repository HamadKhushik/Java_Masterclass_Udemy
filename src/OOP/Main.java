package OOP;

/**
 * @author Hammad on 18/01/2021.
 * @project Java_Masterclass
 */
public class Main {
    public static void main(String[] args) {

        // PC Testing
//        Dimension dimension = new Dimension(20, 20, 5);
//        Case theCase = new Case("220B", "Dell", "240", dimension);
//        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
//        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
//
//        PC thePC = new PC(theCase, theMonitor, theMotherboard);
//        thePC.powerUp();
//
//        // Bedroom Testing
//        System.out.println("\r\n****************BEDROOM EXAMPLE************");
//        BedroomWall wall1 = new BedroomWall("West");
//        BedroomWall wall2 = new BedroomWall("East");
//        BedroomWall wall3 = new BedroomWall("South");
//        BedroomWall wall4 = new BedroomWall("North");
//
//        BedroomCeiling ceiling = new BedroomCeiling(12, 55);
//
//        Bed bed = new Bed("Modern", 4, 3, 2, 1);
//
//        BedroomLamp lamp = new BedroomLamp("Classic", false, 75);
//        Bedroom bedRoom = new Bedroom("Tims", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
//        // Composition/Abstraction
//        bedRoom.makeBed();
//        bedRoom.getLamp().turnOn();

        // Player Testing
        Player player = new Player();

//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//        int damage = 10;
//
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

//        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Tim", 500, "Sword");
//        System.out.println("Initial Health is = " + enhancedPlayer.getHealth());

        // Testing Printer Class
        Printer printer = new Printer(50, false);
        System.out.println("initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.print(4);
        System.out.println("Pages Printed was " + pagesPrinted);
        System.out.println("new total print count for printer = " + printer.getPagesPrinted());
        System.out.println("Toner level is " + printer.getTonerLevel() + "%");
        pagesPrinted = printer.print(2);
        System.out.println("Pages Printed was " + pagesPrinted);
        System.out.println("new total print count for printer = " + printer.getPagesPrinted());
    }

}
