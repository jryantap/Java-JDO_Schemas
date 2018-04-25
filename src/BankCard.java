
import java.util.HashSet;

public class BankCard {

    String number;
    String securityCode;
    String PIN;

    HashSet<ATMTransaction> cardUsed= new HashSet<ATMTransaction>();
    HashSet<AccountHolder> cards = new HashSet<AccountHolder>();
    HashSet<TimeDate> expirationDate = new HashSet<TimeDate>();

    public BankCard(String number, String securityCode, String pin){
        this.number = number;
        this.securityCode = securityCode;
        this.PIN = pin;
    }
}
