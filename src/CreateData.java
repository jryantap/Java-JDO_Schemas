import javax.jdo.*;
import com.objectdb.Utilities;

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

        //Persistence Manager
        PersistenceManager pm = Utilities.getPersistenceManager("bank.odb");
        pm.currentTransaction().begin();

        pm.makePersistent(cd1);
        pm.makePersistent(cw1);
        pm.makePersistent(t1);
        pm.makePersistent(a1);
        pm.makePersistent(a2);
        pm.makePersistent(ah1);
        pm.makePersistent(bc1);
        pm.makePersistent(atm1);
        pm.makePersistent(b1);
        pm.makePersistent(td1);
        pm.makePersistent(td2);
        pm.makePersistent(td3);
        pm.makePersistent(td4);



        //a deposit or withdrawal or transfer made on td1, td2, td3
        //an expiration date on a bank card.
        td1.atmTransaction = cd1;
        td2.atmTransaction = cw1;
        td3.atmTransaction = t1;
        td4.expirationDate = bc1;

        //deposit or withdrawal or transfer ATM transaction ---> account
        a1.account.add(t1);
        a1.account.add(cd1);
        a1.account.add(cw1);

        //a transfer to a targetAccount; maybe different account number
        a2.targetAccount.add(t1);


        //a person's two different accounts (maybe checking or savings)
        a2.accounts.add(ah1);
        a1.accounts.add(ah1);

        //atm used for a withdrawal, deposit, transfer
        atm1.ATMused.add(cd1);
        atm1.ATMused.add(cw1);
        atm1.ATMused.add(t1);

        //branch where the ATM was used
        b1.ATMs.add(atm1);

        //bank card used for a withdrawal, transfer or deposit
        bc1.cardUsed.add(t1);
        bc1.cardUsed.add(cd1);
        bc1.cardUsed.add(cw1);

        pm.currentTransaction().commit();  //end to modify database




    }
}