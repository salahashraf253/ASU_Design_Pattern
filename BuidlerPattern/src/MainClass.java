public class MainClass {
    public static void main(String []args){
        Waiter waiter=new Waiter();
        PizzaBuilder hawaiinPizzaBuilder=new HawaiianPizzaBuilder();
        PizzaBuilder spicyPizzaBuilder=new SpicyPizzaBuilder();
        waiter.setPizzaBuilder(hawaiinPizzaBuilder);
        waiter.constructPizza();
        Pizza pizza= waiter.getPizza();
        pizza.displayIngredients();
    }
}
