public class FactoryCreator {
    public static AbstractFactory getFactory(String factoryName){
        if(factoryName.equalsIgnoreCase("bank")){
            return new BankFactory();
        }
        else if(factoryName.equalsIgnoreCase("loan")){
            return new LoanFactory();
        }
        else return null;
    }
}
