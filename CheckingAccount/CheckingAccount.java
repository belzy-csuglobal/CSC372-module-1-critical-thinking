package CheckingAccount;

import BankAccount.BankAccount;

public class CheckingAccount extends BankAccount {
  double interestRate = 0.10;

  public void processWithdrawal() {
    System.out.println("\nBalance: -$30");
    System.out.println("\nAn overdraft fee has been accessed");
  }

  public  void displayAccount() {
    System.out.printf("\nAccount ID: %s\nName: %s, %s\nInterest Rate: %.0f%%\nBalance: $%.2f\n", 
      this.getAccountID(), this.getLastName(), this.getFirstName(), this.interestRate * 100, this.getBalance());
  }
}
