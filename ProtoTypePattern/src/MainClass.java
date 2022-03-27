public class MainClass {
    public static void main (String[]args){
        Registry reg=new Registry();
        Device device1= reg.getClone("laptop");
        device1.displayCharacteristics();
        System.out.println("\n\n==================\n\n");

        Device device2=reg.getClone("tablet");
        device2.displayCharacteristics();
    }
}
