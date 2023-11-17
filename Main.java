import CheckingAccount.CheckingAccount;

class Main {
  public static void main(String[] args) {
    CheckingAccount checkingAccount = new CheckingAccount();

    checkingAccount.setAccountID(821954);
    checkingAccount.setFirstName("John");
    checkingAccount.setLastName("Doe");

    checkingAccount.deposit(10.95);
    checkingAccount.withdrawal(6.99);

    checkingAccount.accountSummary();
    checkingAccount.displayAccount();

    checkingAccount.processWithdrawal();
  }
}