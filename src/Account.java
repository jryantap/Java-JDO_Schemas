import java.util.TreeSet;

public class Account {
    String number;
    float currentBalance;

    TreeSet<Transfer> targetAccount = new TreeSet<Transfer>();
    TreeSet<ATMTransaction> account = new TreeSet<ATMTransaction>();

    public Account(String number, float currentBalance)
    {
        this.number = number;
        this.currentBalance = currentBalance;
    }

}
