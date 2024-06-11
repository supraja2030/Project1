public class Truck extends Vehicle {
    String isUsed;
    Truck(String engineType, String isUsed){
        super(engineType);
        this.isUsed = isUsed;
    }
    void displayUse(){
        System.out.println("truck is used for " + isUsed);
    }
}
