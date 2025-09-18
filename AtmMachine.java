import java.util.Scanner;
class bankAccount {
    int balance=5000;
}
public class AtmMachine extends bankAccount {
    int ch,Wamount,Damount;
    Scanner sc = new Scanner(System.in);
    void options(){
        System.out.println("Enter Your Choice : ");
        System.out.println("1.Withdraw");
        System.out.println("2.Deposite");
        System.out.println("3.Check Balance");
        System.out.println("4.Exit");
        ch =sc.nextInt();

        switch (ch) {
            case 1:withdraw();
                
                break;
            case 2:deposite();
                
                break;
            case 3:Cbalance();
                
                break;
            case 4: System.out.println("Good Bye...");
                    return;
        
            default: System.out.println("Invalis Choice!");
            System.out.println();
                    options();
                break;
        }

    }
    void withdraw(){
        System.out.println("Enter Withdrawal Amount : ");
        Wamount=sc.nextInt();
        if(Wamount<balance){
            System.out.println("Sufficent balance for withdrawals");
            balance=balance-Wamount;
            System.out.println("Withdrawal Successfull...");
            System.out.println();
            options();
        }else{
            System.out.println("Insufficent balance for withdrawals");
            System.out.println();
            options();
        }
       
    }
    void deposite(){
        System.out.println("Enter Amount to be Deposite : ");
        Damount=sc.nextInt();
        balance=balance+Damount;
        System.out.println("Deposite Successfull...");
        System.out.println();
        options();
    }
    void Cbalance(){
        System.out.println("Your Current Balance = "+balance);
        System.out.println();
        options();
    }

    public static void main(String[] args) {
        AtmMachine am= new AtmMachine();
        am.options();
    }
}

