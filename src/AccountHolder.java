import java.util.HashSet;
import java.util.TreeSet;

public class AccountHolder {

    String name;
    String address;
    String SSN;

    HashSet<Account> accounts = new HashSet<Account>();

    public AccountHolder(String name, String address, String SSN)
    {
        this.name = name;
        this.address = address;
        this.SSN = SSN;
    }
}
