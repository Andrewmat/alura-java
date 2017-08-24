package br.com.alura.java.model;

public class CheckingAccount extends Account {
  public void update(Double tax) {
    this.balance += this.balance * tax * 2;
  }
}
