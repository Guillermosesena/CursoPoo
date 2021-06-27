public class Car {
    private Integer id;
    private Account driver;
    private String license;
    protected Integer passengers;
    
    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }
    
    public void printDataCar(){
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    
}
