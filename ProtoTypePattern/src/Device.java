public abstract class Device implements Cloneable {
    private String manufacture;
    private String screenSize;
    private String ram;
    private String operatingSystem;
    private String capacity;
    private float price;
    private int quantity;

    public Device(String manufacture, String screenSize, String ram, String operatingSystem, String capacity, float price, int quantity) {
        this.manufacture = manufacture;
        this.screenSize = screenSize;
        this.ram = ram;
        this.operatingSystem = operatingSystem;
        this.capacity = capacity;
        this.price = price;
        this.quantity = quantity;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void showTotalPrice(){
        float totalPrice=quantity*price;
        System.out.println("Total Price is "+totalPrice);
    }
    public void displayCharacteristics(){
        System.out.print("Manufacture: "+manufacture+"\nScreen size: " +
                screenSize+"\nRam: "+ram+"\nOperating System: "+operatingSystem+
                "\nCapacity: "+capacity+"Price: "+price+"\n");
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
