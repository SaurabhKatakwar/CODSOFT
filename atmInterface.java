package TASK3;
import java.util.Scanner;

class BankAccount{
    private double balance;
    BankAccount(double balance){
        this.balance= balance;
    }
    public void deposit(double amount){
        balance += amount;
        System.out.println("Your Balance After Deposit: " + balance);
    }
    public void withdraw(double amount){
        if(balance>=amount && amount>0){
            balance-=amount;
            System.out.println("Your Balance After Withdraw: " + balance);
        }
        else{
            System.out.println("Invalid Balance To Complete Transaction.");
        }
    }
    public void checkBalance(){
        System.out.println("Your Balance Is: " + balance);
    }
}
class ATM{
    void runATM(){
        Scanner scan = new Scanner(System.in);
        double balance=1000,amount;
        BankAccount objBankAccount = new BankAccount(balance);
        System.out.print("1.Check Balance\t2.Deposit\n3.Withdraw\t4.Exit\nEnter Your Choice: ");
        int choice = scan.nextInt();
        switch (choice){
            case 1:
                objBankAccount.checkBalance();
                break;
            case 2:
                System.out.print("Enter Amount To Deposit: ");
                amount = scan.nextInt();
                objBankAccount.deposit(amount);
                break;
            case 3:
                System.out.print("Enter Amount To Withdraw: ");
                amount = scan.nextInt();
                objBankAccount.withdraw(amount);
                break;
            case 4:
                System.out.println("Thanks You For Using ATM\nPlease Visit Again");
                break;
            default:
                System.out.println("You Enter Invalid Choice.");
                System.exit(0);
        }
    }
}

public class atmInterface {
    public static void main(String[] args) {
        ATM objATM = new ATM();
        Scanner scan = new Scanner(System.in);
            System.out.print("Enter Your Secret Pin: ");
            int pin = scan.nextInt();
            if(pin == 1234){
                objATM.runATM();
            }else{
                System.out.println("You Enter Incorrect Pin.");
            }
    }
}
