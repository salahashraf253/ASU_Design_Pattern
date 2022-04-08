public class ChineseFood extends FoodDecorator{

    public ChineseFood(Food newFood) {
        super(newFood);
    }

    @Override
    public void prepareFood() {
        System.out.println("Chinese Food is preparing");
    }
    public double foodPrice() {
        return super.foodPrice()+65.0;
    }
}
