import java.util.HashSet;
import java.util.TreeSet;

@javax.jdo.annotations.PersistenceCapable

public class Account {
    String number;
    float currentBalance;

    TreeSet<Transfer> targetAccount = new TreeSet<Transfer>();
    TreeSet<ATMTransaction> account = new TreeSet<ATMTransaction>();
    HashSet<AccountHolder> accounts = new HashSet<AccountHolder>();

    // TODO:  see Project dot 3...
    // TODO:  TreeSet<E> requires class E to implement Comparable<E> or Comparator<E>
    // TODO: by providing, respectively, compareTo or compare function to define a linear ordering.

    public Account(String number, float currentBalance)
    {
        this.number = number;
        this.currentBalance = currentBalance;
    }

}
