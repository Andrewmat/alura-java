package br.com.alura.java.model;

public class Account {

  public Account() {
    this.balance = 0.0;
  }

  protected Double balance;
  public Double getBalance() {
    return balance;
  }

  public void deposit(Double value) throws Exception {
    if (value < 0) {
      throw new Exception("Account::deposit only works for positive values");
    }
    this.balance += value;
  }
  public void draw(Double value) throws Exception {
    if (value < 0) {
      throw new Exception("Account::draw only works for positive values");
    }
    this.balance -= value;
  }

  public void update(Double tax) {
    this.balance += this.balance * tax;
  }
}
