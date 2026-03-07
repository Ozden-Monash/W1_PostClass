public class SmartHomeDriver {

    public static void main(String[] args) {

        System.out.println("Welcome to the Smart Home System hello");

        SmartBulb bulb1 = new SmartBulb();

        bulb1.turnOn();
        bulb1.setColour("red");

        SmartBulb blub2 = new SmartBulb(false, "Yellow");




    }

}
