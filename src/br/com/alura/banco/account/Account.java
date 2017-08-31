package br.com.alura.banco.account;

import br.com.alura.banco.exception.InsufficientFundsException;

import java.util.Objects;

public abstract class Account {

  protected Integer number;

  protected String name;
  protected Double balance;

  public Account() {
    this.balance = 0.0;
  }

  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

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

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Account)) {
      return false;
    }
    Account acc = (Account) obj;
    return Objects.equals(getNumber(), acc.getNumber())
            && Objects.equals(getName(), acc.getName());
  }

  public abstract void update(Double tax);
}
