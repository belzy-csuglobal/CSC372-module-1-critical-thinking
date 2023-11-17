package BankAccount;

public class BankAccount {
  String firstName;
  String lastName;
  int accountID;
  double balance;

  public BankAccount() {
    this.balance = 0.0;
  }

  public void deposit(double value) {
    this.balance += value;
  }

  public void withdrawal(double value) {
    this.balance -= value;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAccountID() {
    return this.accountID;
  }

  public void setAccountID(int accountID) {
    this.accountID = accountID;
  }

  public double getBalance() {
    return this.balance;
  }

  public void accountSummary() {
    System.out.printf(
      "\nAccount ID: %s\nName: %s, %s\nBalance: $%.2f\n", 
      this.accountID, this.lastName, this.firstName, this.balance);
  }
}
