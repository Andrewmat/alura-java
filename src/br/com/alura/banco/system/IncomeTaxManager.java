package br.com.alura.banco.system;

import br.com.alura.banco.model.Taxable;

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
