package app.challenge.tugas2;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BankAccount {

        private String accountNumber;
        private double balance;
        private String customerName;
        private String customerEmail;
        private String customerPhone;

        // Constructor
        public BankAccount(String accountNumber, double balance, String customerName,
                           String customerEmail, String customerPhone) {
            this.accountNumber = accountNumber;
            this.balance = balance;
            this.customerName = customerName;
            this.customerEmail = customerEmail;
            this.customerPhone = customerPhone;
        }

        // Deposit method
        public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposit successful. New balance: $" + balance);
        }

        // Withdraw method
        public void withdraw(double amount) {
            if (amount > balance) {
                System.out.println("Saldo tidak mencukupi");
            } else {
                balance -= amount;
                System.out.println("Withdrawal successful. New balance: $" + balance);
            }
        }
    }
