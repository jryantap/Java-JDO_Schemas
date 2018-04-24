import java.sql.Time;
import java.util.HashSet;

public class BankCard {

    String number;
    String securityCode;
    String PIN;

    HashSet<ATMTransaction> usedCard = new HashSet<ATMTransaction>();
    HashSet<AccountHolder> cardsThis = new HashSet<AccountHolder>();
    HashSet<TimeDate> dateTime = new HashSet<TimeDate>();

    public BankCard(String number, String securityCode, String pin){
        this.number = number;
        this.securityCode = securityCode;
        this.PIN = pin;
    }
}
