public class CashWithdrawal extends ATMTransaction {

    public CashWithdrawal(String idCode, float amount, float balance)
    {
        this.IDcode = idCode;
        this.amount = amount;
        this.balance = balance;
    }
}
