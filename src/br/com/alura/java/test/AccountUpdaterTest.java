package br.com.alura.java.test;

import br.com.alura.java.model.Account;
import br.com.alura.java.model.CheckingAccount;
import br.com.alura.java.model.SavingsAccount;
import br.com.alura.java.controller.AccountUpdater;

public class AccountUpdaterTest {
  public static void main(String[] args) {
    Account account = new CheckingAccount();
    Account cAccount = new CheckingAccount();
    Account sAccount = new SavingsAccount();

    try {
      account.deposit(1000.0);
      cAccount.deposit(1000.0);
      sAccount.deposit(1000.0);
    } catch(Exception e) {
      System.err.println("Error using deposit");
      e.printStackTrace(System.err);
    }

    AccountUpdater updater = new AccountUpdater(0.01);

    updater.run(account);
    updater.run(cAccount);
    updater.run(sAccount);

    System.out.println("Total balance: " + updater.getTotalBalance());
  }
}
