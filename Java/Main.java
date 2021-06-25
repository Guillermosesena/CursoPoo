class Main{
    public static void main(String[] args) {
        System.out.println("Hola mundo");

        Car car = new Car("AMQ123", new Account("Andre Herrera", "AND123"));
        //car.license = "AMQ123";
        //car.driver = "Andre Herrera";
        car.passengers = 4;
        car.printDataCar();

        Car car2 = new Car("RGREGR", new Account("Andre Herrera", "AND124"));
        //car2.license = "RGREGR";
        //car2.driver = "Andre Herrera";
        car2.passengers = 2;
        car2.printDataCar();    
    }
}