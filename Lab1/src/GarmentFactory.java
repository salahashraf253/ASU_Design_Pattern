public class GarmentFactory {
    static GarmentType createGarments(String selection){
        if(selection.equalsIgnoreCase("trouser")){
            return new Trouser();
        }
        else if(selection.equalsIgnoreCase("shirt")){
            return new Shirt();
        }
        else return null;
    }
}
