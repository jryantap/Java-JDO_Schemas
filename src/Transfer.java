import java.util.HashSet;

public class Transfer extends ATMTransaction {
    float targetBalance;

    Account targetAccount;

    // TODO:  see Project dot 3...
    // TODO:  TreeSet<E> requires class E to implement Comparable<E> or Comparator<E>
    // TODO: by providing, respectively, compareTo or compare function to define a linear ordering.


    public Transfer(String idCode, float amount, float balance, float targetBalance)
    {
        this.IDcode = idCode;
        this.amount = amount;
        this.balance = balance;
        this.targetBalance = targetBalance;
    }

    @Override
    public String toString(){
        return targetBalance + " ";
    }




}
