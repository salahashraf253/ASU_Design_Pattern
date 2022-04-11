public abstract class PizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza(){
        return this.pizza;
    }

    public void createNewPizzaProduct(){
        pizza=new Pizza();
    }
    public abstract void buildDough();
    public abstract void buildSouce();
    public abstract void buildTopping();
}
