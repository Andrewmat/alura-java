package br.com.alura.java.controller;

import br.com.alura.java.model.Taxable;

public class IncomeTaxManager {
  private Double total = 0.0;

  public void add(Taxable taxable) {
    System.out.println("Adding taxable: " + taxable);

    this.total += taxable.calcTaxes();
  }

  public Double getTotal() {
    return total;
  }
}
