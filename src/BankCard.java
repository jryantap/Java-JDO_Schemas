import java.util.HashSet;

public class BankCard {

    String number;
    String securityCode;
    String PIN;

    HashSet<ATMTransaction> carUsed = new HashSet<ATMTransaction>();
    HashSet<AccountHolder> cards = new HashSet<AccountHolder>();

    //TODO: may need HashSet<TimeDate> expirationDate here
}
