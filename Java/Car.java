public class Car {
    Integer id;
    String license;
    Account driver;
    private Integer passengers;
    
    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }
    void printDataCar(){
        System.out.println("License: " + license + " Driver: " + driver.name
        + " Passegers: " + passengers);
    }

    public Integer getPassegers()
    {   
        return this.passengers;
    }

    public void setPassegers(Integer passengers)
    {
        if(passengers == 4)
            this.passengers=passengers;
        else
            System.out.println("You must assign four passengers");
    }
}
