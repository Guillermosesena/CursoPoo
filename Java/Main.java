class Main{
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Car car = new Car();
        car.license = "AMQ123";
        car.driver = "Andre Herrera";
        car.passengers = 4;
        car.printDataCar();

        Car car2 = new Car();
        car2.license = "RGREGR";
        car2.driver = "Andre Herrera";
        car2.passengers = 2;
        car2.printDataCar();    
    }
}