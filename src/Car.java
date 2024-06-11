public class Car extends Vehicle {
    int doors;
    Car(String engineType,int doors){
        super(engineType);
        this.doors = doors;
    }
    void doors(){
        System.out.println("Car has " + doors + " doors");

    }
}
