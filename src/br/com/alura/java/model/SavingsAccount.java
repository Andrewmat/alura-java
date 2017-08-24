package br.com.alura.java.model;

public class SavingsAccount extends Account {
  public void update(Double tax) {
    this.balance += this.balance * tax * 3;
  }

  public void deposit(double value) throws Exception {
    if (value < 0) {
      throw new Exception("Account::deposit only works for positive values");
    }
    this.balance += value - 0.1;
  }
}
