public class Account {
    Integer id;
    String name;
    String document;
    String email;
    String password;

    public Account(String name, String document){
        this.name = name;
        this.document = document;
    }

    //method to set account credentials
    public void auth(String email, String password){
        this.email = email;
        this.password = password;
    }

    //Metho to print account data
    public void printDataAccount()
    {
        System.out.println("Name: " + this.name + " Document: " + this.document +
        " Email: " + this.email + " Password: " + this.password);
    }
}
