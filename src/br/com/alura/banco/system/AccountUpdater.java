package br.com.alura.banco.system;

import br.com.alura.banco.account.Account;

public class AccountUpdater {

  private Double totalBalance = 0.0;
  private final Double tax;

  public AccountUpdater(double tax) {
    this.tax = tax;
  }

  public void run(Account ac) {
    System.out.println(ac.getBalance());
    ac.update(this.tax);
    System.out.println(ac.getBalance());
    this.totalBalance += ac.getBalance();
  }

  public double getTotalBalance() {
    return totalBalance;
  }
}
