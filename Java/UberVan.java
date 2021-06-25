import java.util.Map;
import java.util.ArrayList;


public class UberVan extends Car{
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberVan(Map<String, Map<String,Integer>> typeCarAccepted,
    ArrayList<String> seatsMaterial, String license, Account driver){
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;

    }
}
