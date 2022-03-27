public class Laptop extends Device{
    private String keyboardType;

    public Laptop(String manufacture, String screenSize, String ram, String operatingSystem, String capacity, float price, int quantity, String keyboardType) {
        super(manufacture, screenSize, ram, operatingSystem, capacity, price, quantity);
        this.keyboardType=keyboardType;
    }
    public void displayCharacteristics(){
        super.displayCharacteristics();
        System.out.println("Keyboard type: "+keyboardType);
    }

    public void setKeyboardType(String keyboardType) {
        this.keyboardType = keyboardType;
    }
}
