import java.util.HashSet;

public class ATM {
    String IDcode;

    HashSet<ATMTransaction> ATMused = new HashSet<ATMTransaction>();
    Branch ATMs;

    public ATM(String IDcode)
    {
        this.IDcode = IDcode;
    }


}
