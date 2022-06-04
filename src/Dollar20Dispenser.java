public class Dollar20Dispenser implements DispenseChain{
    private DispenseChain dispenseChain;
    @Override
    public void setNextChain(DispenseChain dispenseChain) {
        this.dispenseChain=dispenseChain;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount()>=20){
            int rem=currency.getAmount()%20;
            int num=currency.getAmount()/20;
            System.out.println("Dispensing "+num+" 50$ note");
            if(rem !=0){
                this.dispenseChain.dispense(new Currency(rem));
            }
        }
        else this.dispenseChain.dispense(currency);
    }
}
