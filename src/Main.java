import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ATMDispenseChain atmDispenseChain=new ATMDispenseChain();
        Scanner input=new Scanner(System.in);
        while(1==1){
            int amount=0;
            System.out.print("Enter amount to dispense: " );
            amount=input.nextInt();
            if(amount % 10 !=0){
                System.out.println("ERROR: Amount should be multiple of 10");
            }
            else
                atmDispenseChain.dispenseChain.dispense(new Currency(amount));
        }
    }
}
class ATMDispenseChain{
    public DispenseChain dispenseChain;
    public ATMDispenseChain(){
        this.dispenseChain=new Dollar50Dispenser();
        dispenseChain.setNextChain(new Dollar20Dispenser());
        dispenseChain.setNextChain(new Dollar10Dispenser());
    }
}