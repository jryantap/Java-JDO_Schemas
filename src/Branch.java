import java.util.HashSet;

@javax.jdo.annotations.PersistenceCapable

public class Branch {

    String IDcode;
    String name;
    String address;

    HashSet<ATM> ATMs = new HashSet<ATM>();

    public Branch(String IDcode, String name, String address){
        this.IDcode = IDcode;
        this.name = name;
        this.address = address;
    }

}
