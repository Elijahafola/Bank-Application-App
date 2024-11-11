import java.util.Scanner;

public class BankApplicationApp {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
   BankAccount obj1 = new BankAccount(" ", " ");
   obj1.showMenu();
}
}
class BankAccount{
    int balance;
    int previoustransaction;
    String customername;
    String customerid;

    BankAccount(String cname, String cid){
        customername = cname;
        customerid = cid;
    }

    void deposit(int amount){
        if (amount!=0) {
            balance = balance + amount;
            previoustransaction = amount;

        }
    }
    void withdraw(int amount){
        if (amount!=0) {
            balance = balance - amount;
            previoustransaction = -amount;
            
        }
    }
    void getprevioustransaction(){
        if (previoustransaction>0) {
            System.out.println("Deposit : "+previoustransaction);
            
        }
        else if (previoustransaction<0) {
            System.out.println("Withdrawn: "+Math.abs(previoustransaction));
        }
        else{
            System.out.println("No transaction occurred");
        }
    }
    void showMenu(){
        char option = '\0';

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome "+customername);
        System.out.println("Your ID is "+customerid);
        System.out.println("\n");
        System.out.println("A - Check balance");
        System.out.println("B - Deposit");
        System.out.println("C - Withdraw");
        System.out.println("D - Previous transaction");
        System.out.println("E - Exit");

        do
        {
            System.out.println("*************************************************************");
            System.out.println("Enter an option");
            System.out.println("*************************************************************");
            option = scanner.next().charAt(0);
            System.out.println("\n");
            
            switch(option){
                case 'A':
                System.out.println("---------------------------------------------------");
                System.out.println("Balance = "+balance);
                System.out.println("---------------------------------------------------");
                System.out.println("\n");
                break;

                case 'B':
                System.out.println("------------------------------------------------------");
                System.out.println("Enter an amount to deposit:");
                System.out.println("------------------------------------------------------");
                int amount = scanner.nextInt();
                deposit(amount);
                System.out.println("\n");
                break;

                case 'C':
                System.out.println("------------------------------------------------------");
                System.out.println("Enter an amount to withdraw");
                System.out.println("-------------------------------------------------------");
                int amount2 = scanner.nextInt();
                withdraw(amount2);
                System.out.println("\n");
                break;

                case 'D':
                System.out.println("-------------------------------------------------------");
                getprevioustransaction();
                System.out.println("-------------------------------------------------------");
                System.out.println("\n");
                break;

                case 'E':
                System.out.println("*******************************************************");
                break;

                default:
                System.out.println("Invalid option! Please enter again");
                break;
            }
            }while (option !='E');
            System.out.println("Thank you for using our services"); 
                
            }
    }
