package br.com.alura.java.test;

import br.com.alura.java.model.CheckingAccount;
import br.com.alura.java.model.Taxable;

public class TaxableTest {
  public static void main(String[] args) {
    CheckingAccount cAccount = new CheckingAccount();
    try {
      cAccount.deposit(100.0);
    } catch (Exception e) {
      System.err.println("Error using deposit");
      e.printStackTrace(System.err);
    }
    System.out.println(cAccount.calcTaxes());

    Taxable taxable = cAccount;
    System.out.println(taxable.calcTaxes());
  }
}
