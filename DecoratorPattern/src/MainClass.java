public class MainClass {
    //Decorator pattern is a structural DP
    public static void main(String []args){
        VegFood vegFood=new VegFood();
        vegFood.prepareFood();
        System.out.println("Price: "+vegFood.foodPrice());

        Food nonVegFood=new NonVegFood((Food) new VegFood());
        nonVegFood.prepareFood();
        Food chineseFood=new ChineseFood(new VegFood());
        chineseFood.prepareFood();
        System.out.println("Price: "+chineseFood.foodPrice());
    }
}
