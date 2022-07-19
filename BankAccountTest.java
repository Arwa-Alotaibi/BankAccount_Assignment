public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount user1 = new BankAccount(10,55);

        //deposit money by savings_balance:
        System.out.println("the check is:"+user1.getChecking_balance());

        user1.deposit_savings(4);
        System.out.println("the saving balance is:"+user1.getSavings_balance());
        user1.deposit_savings(4);

        user1.withdraw(10);
        user1.total_money();





        //deposit money by check:
        BankAccount user2 = new BankAccount(10,55);


        System.out.println("the saving balance is:"+user2.getSavings_balance());
        user2.deposit_check(4);
        System.out.println("the check is:"+user2.total_amount);
        user2.deposit_check(4);
        user2.total_money();


        System.out.println(BankAccount.number_accounts_created);








        




    }
}


