package PremierLeague;

import java.io.Serializable;

public class Date implements Serializable {

    private int year;
    private int month;
    private int day;


    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

   // public String show() {
    //   return day + "." + month + "." + year;
   //}

    @Override
    public String toString() {
        return day + "." + month + "." + year;
   }
}
