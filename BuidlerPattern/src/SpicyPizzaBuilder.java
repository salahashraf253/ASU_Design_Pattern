public class SpicyPizzaBuilder extends PizzaBuilder{

    @Override
    public void buildDough() {
        pizza.setDough("pan haked");
    }

    @Override
    public void buildSouce() {
        pizza.setSouce("hot");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("pepperoni+salami");
    }
}
