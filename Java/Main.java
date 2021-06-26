class Main{
    public static void main(String[] args) {
 
        UberX uberX= new UberX("RGREGR", new Account("Andre Herrera", "AND124"),"Chevrolet","Spark");
        uberX.setPassegers(4);
        uberX.printDataCar();
        
        /*User user = new User("Juan Vazquez","DQW9821");
        user.auth("juanvazque@gmail.com", "123");
        user.printDataAccount();*/
    }
}