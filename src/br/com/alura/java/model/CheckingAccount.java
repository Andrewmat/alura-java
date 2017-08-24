package br.com.alura.java.model;

public class CheckingAccount extends Account implements Taxable {
  public void update(Double tax) {
    this.balance += this.balance * tax * 2;
  }

  @Override
  public Double calcTaxes() {
    return this.balance * 0.01;
  }
}
