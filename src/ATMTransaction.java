@javax.jdo.annotations.PersistenceCapable


public abstract class ATMTransaction implements Comparable<ATMTransaction>{

    String IDcode;
    float amount;
    float balance;

    // TODO:  see Project dot 3...
    // TODO:  TreeSet<E> requires class E to implement Comparable<E> or Comparator<E>
    // TODO: by providing, respectively, compareTo or compare function to define a linear ordering.

    @Override
    public int compareTo(ATMTransaction that)
    {
        return this.IDcode.compareTo(that.IDcode);

//        if(this.amount > that.amount)
//            return 1;
//        else if(this.amount < that.amount)
//            return -1;
//        else if(this.balance > that.balance)
//            return 1;
//        else if(this.balance < that.balance)
//            return -1;
//
//        return this.IDcode.compareTo(this.IDcode);

    }


}
