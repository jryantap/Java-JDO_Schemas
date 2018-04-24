import javax.jdo.*;

public class CreateData {

    public static void main(String argv[]) {
        //Cash Deposit
        CashDeposit cd1 = new CashDeposit("CD898760abc65", (float) 1000.00, (float) 4000.00);

        //CashWithdrawal
        CashWithdrawal cw1 = new CashWithdrawal("CW10000XYZ897", (float) 2000.00, (float) 2000.00);

        //Transfer
        Transfer t1 = new Transfer("T54378765sss765", (float) 1000.00, (float) 1000.00, (float) 7000.00);

        //Account
        Account a1 = new Account("87654008", (float) 1000.00);
        Account a2 = new Account("14358055", (float) 7000.00);

        //Account Holder
        AccountHolder ah1 = new AccountHolder("Jane Smith", "100 Main St. Flushing, NY", "123456789");

        //Bank Card
        BankCard bc1 = new BankCard("8765098742357651", "745", "60094");

        //ATM
        ATM atm1 = new ATM("20001111");

        //Branch
        Branch b1 = new Branch("20022", "Hillside", "200 Hillside St. Flushing, NY");

        //TimeDate
        TimeDate td1 = new TimeDate(15,9, 1, 3, 2018);
        TimeDate td2 = new TimeDate(30, 10, 15, 3, 2018);
        TimeDate td3 = new TimeDate(45, 15, 1, 4, 2018);
        TimeDate td4 = new TimeDate(59, 23, 1, 10, 2020);




    }
}