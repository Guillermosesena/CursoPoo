import java.util.Map;
import java.util.ArrayList;


public class UberVan extends Car{
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberVan(String license, Account driver, 
    Map<String, Map<String,Integer>> typeCarAccepted,
    ArrayList<String> seatsMaterial ){
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;

    }

    @Override
    public void setPassegers(Integer passengers) {
        if(passengers == 6)
        this.passengers=passengers;
    else
        System.out.println("You must assign six passengers");
    }

}
