package br.com.alura.banco.model;

public class LifeInsurance implements Taxable {
  @Override
  public Double calcTaxes() {
    return 42.0;
  }
}
