package br.com.alura.banco.account;

import br.com.alura.banco.model.Taxable;

public class CheckingAccount extends Account implements Taxable {
  public void update(Double tax) {
    this.balance += this.balance * tax * 2;
  }

  @Override
  public Double calcTaxes() {
    return this.balance * 0.01;
  }
}
