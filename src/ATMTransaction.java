public abstract class ATMTransaction implements Comparable<ATMTransaction> {

    String IDcode;
    float amount;
    float balance;

    // TODO:  see Project dot 3...
    // TODO:  TreeSet<E> requires class E to implement Comparable<E> or Comparator<E>
    // TODO: by providing, respectively, compareTo or compare function to define a linear ordering.


    /* TODO: implement compareTo method here

     */

    @Override
    public int compareTo(ATMTransaction that)
    {
        return this.IDcode.compareTo(this.IDcode);
    }
}
