public class VegFood implements Food{

    @Override
    public void prepareFood() {
        System.out.println("Veg food is preparing");
    }

    @Override
    public double foodPrice() {
        return 50.0;
    }
}
