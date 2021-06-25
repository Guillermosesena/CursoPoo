import java.util.Map;
import java.util.ArrayList;


public class UberBlack extends Car{
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberBlack(Map<String, Map<String,Integer>> typeCarAccepted,
    ArrayList<String> seatsMaterial, String license, Account driver){
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;

    }
}
