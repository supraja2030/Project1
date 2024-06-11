public class Main {
    public static void main(String args[]){
        Vehicle vehicle = new Vehicle("Generic Engine");
        Car car = new Car("car engine", 4);
        Truck truck = new Truck("truck engine","Cargo");
        System.out.println(" Hierarchical inheritance with parameters");
        vehicle.displayEngine();
        car.displayEngine();
        car.doors();
        truck.displayEngine();
        truck.displayUse();
    }

}