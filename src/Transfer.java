import java.util.HashSet;

public class Transfer extends ATMTransaction {
    float targetBalance;


    public Transfer(String idCode, float amount, float balance)
    {

        this.IDcode = idCode;
        this.amount = amount;
        this.balance = balance;
    }

}
