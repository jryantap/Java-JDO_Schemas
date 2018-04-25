import java.util.HashSet;

@javax.jdo.annotations.PersistenceCapable


public class BankCard {

    String number;
    String securityCode;
    String PIN;

    HashSet<ATMTransaction> cardUsed= new HashSet<ATMTransaction>();
    HashSet<AccountHolder> cards = new HashSet<AccountHolder>();

    public BankCard(String number, String securityCode, String pin){
        this.number = number;
        this.securityCode = securityCode;
        this.PIN = pin;
    }
}
