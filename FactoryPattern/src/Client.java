import java.util.Scanner;

public class Client {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the type of garments which you want : ");
        String garmentType = input.next();
        GarmentType unknownGarmentType = GarmentFactory.createGarments(garmentType);
        unknownGarmentType.print();
    }
}
