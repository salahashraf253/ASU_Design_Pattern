import java.util.HashMap;

public class Registry {
    private HashMap<String,Device>registry;

    public Registry() {
        this.registry = new HashMap();
        initialize();
    }
    private void initialize(){
        registry.put("laptop",new Laptop("MSI","15.6","16 GB",
                "windows 11","512 GB",
                20000.0F,10,"normal"));
        registry.put("tablet",new Tablet("samsung","10","8 GB","android 11",
                "128 GB",1000.0F,20));
    }
    public Device getClone(String objectName){
        Object clone=null;
        try {
            clone=registry.get(objectName).clone();
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return (Device)(clone);
    }
}
