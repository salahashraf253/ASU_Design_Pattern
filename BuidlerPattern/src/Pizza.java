public class Pizza {
    private String dough;
    private String topping;
    private String souce;

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }
    public String getSouce(){
        return this.souce;
    }
    public void setSouce(String souce){
        this.souce=souce;
    }

    public void displayIngredients(){
        System.out.printf("Topping:%s\nSouce:%s\nDough:%s",topping,souce,dough);
    }
}
