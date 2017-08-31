package br.com.alura.banco;

import br.com.alura.banco.account.Account;
import br.com.alura.banco.account.CheckingAccount;
import br.com.alura.banco.account.SavingsAccount;
import br.com.alura.banco.system.AccountUpdater;

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
