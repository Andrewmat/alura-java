package br.com.alura.java.model;

import br.com.alura.java.exception.InsufficientFundsException;

public abstract class Account {

  public Account() {
    this.balance = 0.0;
  }

  protected Double balance;
  public Double getBalance() {
    return balance;
  }

  public void deposit(Double value) {
    if (value < 0) {
      throw new IllegalArgumentException("Account::deposit only works for positive values");
    }
    this.balance += value;
  }
  public void draw(Double value) throws InsufficientFundsException {
    if (value < 0) {
      throw new IllegalArgumentException("Account::draw only works for positive values");
    }
    if (balance < value) {
      throw new InsufficientFundsException(balance);
    }
    this.balance -= value;
  }

  public abstract void update(Double tax);
}
