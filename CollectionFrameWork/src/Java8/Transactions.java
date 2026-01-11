package Java8;


public class Transactions {
    private String date;
    private int dailyExpense;

    public Transactions() {
    }

    public Transactions(String date, int dailyExpense) {
        this.date = date;
        this.dailyExpense = dailyExpense;
    }

    public int getDailyExpense() {
        return dailyExpense;
    }

    public void setDailyExpense(int dailyExpense) {
        this.dailyExpense = dailyExpense;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
