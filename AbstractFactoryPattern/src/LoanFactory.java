public class LoanFactory extends AbstractFactory{

    public  Loan getLoan(String loanName){
            if(loanName.equalsIgnoreCase("BusinessLoan")){
                return new BuisnessLoan();
            }
            else if(loanName.equalsIgnoreCase("homeloan")){
                return new HomeLoan();
            }
            else if(loanName.equalsIgnoreCase("educationallaon")){
                return new EducationalLoan();
            }
            else return null;
    }

    @Override
    public Bank getBank(String bankName) {
        return null;
    }
}
