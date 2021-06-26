class Main{
    public static void main(String[] args) {
        //System.out.println("Hola mundo");

        /*Car car = new Car("AMQ123", new Account("Andre Herrera", "AND123"));
        car.passengers = 4;
        car.printDataCar();

        Car car2 = new Car("RGREGR", new Account("Andre Herrera", "AND124"));
        car2.passengers = 2;
        car2.printDataCar();        
        
        UberX uberX= new UberX("RGREGR", new Account("Andre Herrera", "AND124"),"Chevrolet","Spark");
        uberX.printDataCar();*/

        User user = new User("Juan Vazquez","DQW9821");
        user.auth("juanvazque@gmail.com", "123");
        user.printDataAccount();
    }
}