public class BankFactory extends AbstractFactory {

    public  Bank getBank(String bankName){
        if(bankName.equalsIgnoreCase("icici")){
            return new ICICI();
        }
        else if(bankName.equalsIgnoreCase("hdfc")){
            return new HDFC();
        }
        else if(bankName.equalsIgnoreCase("sbi")){
            return new SBI();
        }
        else return null;
    }

    @Override
    public Loan getLoan(String loanName) {
        return null;
    }
}
