public class InstallemntMonth {
     private double loanAmount;
     private int Months;

    public InstallemntMonth(double loanAmount, int months) {
        this.loanAmount = loanAmount;
        Months = months;
    }

    public InstallemntMonth(){}

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public int getMonths() {
        return Months;
    }

    public void setMonths(int months) {
        Months = months;
    }

    public double monthlyinstalmment(double loanAmount ,int Months){
        return  loanAmount/Months;
    }

}
