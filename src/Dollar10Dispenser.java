public class Dollar10Dispenser  implements DispenseChain{
    private DispenseChain dispenseChain;
    @Override
    public void setNextChain(DispenseChain dispenseChain) {
        this.dispenseChain=dispenseChain;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount()>=10){
            int rem=currency.getAmount()%10;
            int num=currency.getAmount()/10;
            System.out.println("Dispensing "+num+" 10$ note");
            if(rem !=0){
                this.dispenseChain.dispense(new Currency(rem));
            }
        }
        else this.dispenseChain.dispense(currency);
    }
}
