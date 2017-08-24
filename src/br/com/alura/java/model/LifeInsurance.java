package br.com.alura.java.model;

public class LifeInsurance implements Taxable {
  @Override
  public Double calcTaxes() {
    return 42.0;
  }
}
