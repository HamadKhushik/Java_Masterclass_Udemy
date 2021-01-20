package OOP;

/**
 * @author Hammad on 18/01/2021.
 * @project Java_Masterclass
 */
public class Main {
    public static void main(String[] args) {

        // PC Testing
        Dimension dimension = new Dimension(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimension);
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();

        // Bedroom Testing
        System.out.println("\r\n****************BEDROOM EXAMPLE************");
        BedroomWall wall1 = new BedroomWall("West");
        BedroomWall wall2 = new BedroomWall("East");
        BedroomWall wall3 = new BedroomWall("South");
        BedroomWall wall4 = new BedroomWall("North");

        BedroomCeiling ceiling = new BedroomCeiling(12, 55);

        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        BedroomLamp lamp = new BedroomLamp("Classic", false, 75);
        Bedroom bedRoom = new Bedroom("Tims", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        // Composition/Abstraction
        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();
    }

}
