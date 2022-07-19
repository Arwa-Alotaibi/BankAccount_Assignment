import java.util.Random;


public class BankAccount {
    //The class should have the following attributes: (double) checking balance, (double) savings balance.
    private double checking_balance;
    private double savings_balance;
    //Create a class member (static) that has the number of accounts created thus far.
    public static int number_accounts_created=0;
    //Create a class member (static) that tracks the total amount of money stored in every account created.
    public static double total_amount=0;

    //NINJA BONUS: Add the the following class attribute: account number. 
    //The type is up to you, can be a String or a Long or another type.
    private long account_number;


    //In the constructor, be sure to increment the account count.
    public BankAccount(double checking_balance, double savings_balance){
        this.checking_balance=checking_balance;
        this.savings_balance=savings_balance;
        number_accounts_created++;
    }


    public double getChecking_balance() {

        return checking_balance;
    }


    public double getSavings_balance() {
        return savings_balance;
    }

    //Create a method that will allow a user to deposit money into either the checking or saving, 
    //be sure to add to total amount stored.
    public void deposit_savings(double savings_balance){
        total_amount+= savings_balance;
        double save =savings_balance +savings_balance;
        System.out.println("Deposit an amount into your account by savings balance and total amount is:$"+save);
        System.out.println("Deposit an amount into your account by savings balance and total amount is:$"+total_amount);


    }

    public void deposit_check(double checking){
        total_amount+= checking;
        System.out.println("Deposit an amount into your account by check and total amount is:$"+total_amount);

    }



//Create a method to withdraw money from one balance.
// Do not allow them to withdraw money if there are insufficient funds.

    public void withdraw(double savings_balance){
        if (savings_balance >total_amount){
            System.out.println("insufficient funds.");
        }

        else{
            total_amount-=savings_balance;
            System.out.println("Money has been withdrawn successfully"+total_amount);

        }


    }

    //Create a method to see the total money from the checking and saving.
    public void total_money(){
        double check=  checking_balance +total_amount;
        System.out.println("your total money from checking  is:$"+check);

        double balance = savings_balance + total_amount;
        System.out.println("your total money from saving  is:$"+balance);

        total_amount=checking_balance+savings_balance;
        System.out.println("your total money from the checking and saving is:$"+total_amount);




}
// // long account
// public long getAccount_number() {
//     return account_number;
// }


// public void setAccount_number(long account_number) {
//     this.account_number = account_number;
// }

//     //Create a private method that returns a random ten digit account number.
//     private String random_digit(){
//         Random a =new random();
//         int max = 10;
//         int account_random= a.nextInt(max);
//         return account_random;

//     }


    
    

}






