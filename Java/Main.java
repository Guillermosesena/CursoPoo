import java.util.Map;
import java.util.ArrayList;

class Main{
    public static void main(String[] args) {
 
        UberX uberX= new UberX("RGREGR", new Account("Andre Herrera", "AND124"),"Chevrolet","Spark");
        uberX.setPassegers(4);
        uberX.printDataCar();

        //Initialize array and maps 
        ArrayList<String> seatsMaterial = new ArrayList<>();
        seatsMaterial.add("Leather");
        Map<String,Integer> model = Map.of("Class V", 2019);
        Map<String, Map<String,Integer>> typeCarAccepted = Map.of("Mercerdes", model);

        UberVan uberVan= new UberVan("RGREGR", new Account("Andre Herrera", "AND124"),typeCarAccepted, seatsMaterial);
        uberVan.setPassegers(6);
        uberVan.printDataCar();
        
        /*User user = new User("Juan Vazquez","DQW9821");
        user.auth("juanvazque@gmail.com", "123");
        user.printDataAccount();*/
    }
}