public class TimeDate {

    int minute;
    int hour;
    int day;
    int month;
    int year;

    BankCard dateExpiration;
    ATMTransaction dateTime;

    public TimeDate(int minute, int hour, int day, int month, int year)
    {
        this.minute = minute;
        this.hour = hour;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString(){
        return minute + " " + hour + " " + day + " " + month + " " + year + " ";
    }

}
