package Day12;


import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class InvalidAmountException extends Exception {
    InvalidAmountException(String msg) {
        super(msg);
    }
}

class AccountNotFoundException extends Exception {
    AccountNotFoundException(String msg) {
        super(msg);
    }
}

public class BankingExceptionSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String account = "101";
        double balance = 5000;

        try {
            System.out.print("Enter account number: ");
            String acc = sc.nextLine();

            if (!acc.equals(account)) {
                throw new AccountNotFoundException("Account not found!");
            }

            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();

            if (amount <= 0) {
                throw new InvalidAmountException("Invalid amount!");
            }

            if (amount > balance) {
                throw new InsufficientBalanceException("Insufficient balance!");
            }

            balance -= amount;
            System.out.println("Withdrawal successful!");
            System.out.println("Remaining balance: " + balance);

        } catch (AccountNotFoundException |
                 InvalidAmountException |
                 InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

       
    }
}
