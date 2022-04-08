public class NonVegFood extends FoodDecorator{

    public NonVegFood(Food newFood) {
        super(newFood);
    }

    @Override
    public void prepareFood() {
        System.out.println("Non veg food is preparing");
    }

    @Override
    public double foodPrice() {
        return super.foodPrice()+150.0;
    }
}
