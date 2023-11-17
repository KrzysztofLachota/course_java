import java.time.LocalDate;

public class P5Q5 {
        static class BankAccount {
            String account;
            double balance;
            }
        static class CheckingAccount extends BankAccount {
            double limit;
            }
        static class SavingsAccount extends BankAccount {
            String transfers;
            }
        static class COD extends BankAccount {
            LocalDate expDate;
            }

    public static void main(String[] args) {
        CheckingAccount chAcc = new CheckingAccount();
    chAcc.account = "1234-4321";
    chAcc.balance = 167235;
    chAcc.limit = 100000;

    System.out.println("nr konta : " + chAcc.account);
    System.out.println("stan konta : " + chAcc.balance);
    System.out.println("limit : " + chAcc.limit);

    }
    
}
