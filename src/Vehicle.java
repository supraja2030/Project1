public class Vehicle {
    String engineType;
    Vehicle(String engineType){
        this.engineType = engineType;
    }
    void displayEngine(){
        System.out.println(engineType + " is the main part in any vehicle" );
    }
}
