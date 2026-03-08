public class SmartHomeDriver {

    public static void main(String[] args) {

        System.out.println("Welcome to the Smart Home System hello");

        SmartBulb bulb1 = new SmartBulb();

        bulb1.turnOn();
        bulb1.setColour("red");

        SmartBulb bulb2 = new SmartBulb(false, "Red");


        SmartBulb bulbArray[]= new SmartBulb[2];
        bulbArray[0] = bulb1;
        bulbArray[1] = bulb2;

        //dispolay bulb data
        System.out.println("BUlb 1 is on: " + bulbArray[0].isStatus());
        System.out.println("BUlb 2 is on: " + bulbArray[1].isStatus());

        for (int i = 0; i < bulbArray.length ; i++){
            System.out.println("BUlb " + (i+1) +" is on: " + bulbArray[i].isStatus());
        }
    }

}
