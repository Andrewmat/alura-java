package br.com.alura.banco.account;

public class SavingsAccount extends Account {
  @Override
  public void update(Double tax) {
    this.balance += this.balance * tax * 3;
  }

  public void deposit(double value) throws Exception {
    if (value < 0) {
      throw new RuntimeException("Account::deposit only works for positive values");
    }
    this.balance += value - 0.1;
  }
}
