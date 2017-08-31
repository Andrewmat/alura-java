package br.com.alura.banco;

import br.com.alura.banco.account.Account;
import br.com.alura.banco.account.CheckingAccount;
import br.com.alura.banco.account.SavingsAccount;

public class AccountTest {
  public static void main(String[] args) {
    Account account = new CheckingAccount();
    CheckingAccount cAccount = new CheckingAccount();
    SavingsAccount sAccount = new SavingsAccount();

    try {
      account.deposit(1000.0);
      cAccount.deposit(1000.0);
      sAccount.deposit(1000.0);
    } catch(Exception e) {
      System.err.println("Error using deposit");
      e.printStackTrace(System.err);
    }

    account.update(0.01);
    cAccount.update(0.01);
    sAccount.update(0.01);

    System.out.println(account.getBalance());
    System.out.println(cAccount.getBalance());
    System.out.println(sAccount.getBalance());
	}
}
