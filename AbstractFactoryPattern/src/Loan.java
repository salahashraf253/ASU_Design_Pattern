public abstract class Loan {
    protected double rate;

    public void setInterestRate(double rate){
        this.rate=rate;
    }
    public void calculateLoanPayment(double loanAmount,int years){
        System.out.println("Your monthly EMI is ");
    }
}
