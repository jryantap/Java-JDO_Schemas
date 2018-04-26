import java.sql.Time;
import java.util.HashSet;

@javax.jdo.annotations.PersistenceCapable

public class TimeDate implements Comparable<TimeDate>{

    int minute;
    int hour;
    int day;
    int month;
    int year;

    BankCard expirationDate;
    ATMTransaction atmTransaction;

    public TimeDate(int minute, int hour, int day, int month, int year)
    {
        this.minute = minute;
        this.hour = hour;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public int compareTo(TimeDate that){
        if(this.year > that.year)
            return 1;
        else if(this.year < that.year)
            return -1;
        else if(this.month > that.month)
            return 1;
        else if(this.month < that.month)
            return -1;
        else if(this.day > that.day)
            return 1;
        else if(this.day < that.day)
            return -1;
        else if(this.hour > that.hour)
            return 1;
        else if(this.hour < that.hour)
            return -1;
        else if (this.minute > that.minute)
            return 1;
        else if (this.minute < that.minute)
            return -1;
        else
            return this.atmTransaction.IDcode.compareTo(that.atmTransaction.IDcode);
    }




//    public String toString(){
//        return minute + " " + hour + " " + day + " " + month + " " + year + " ";
//    }

}
