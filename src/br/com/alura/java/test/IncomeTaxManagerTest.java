package br.com.alura.java.test;

import br.com.alura.java.controller.IncomeTaxManager;
import br.com.alura.java.model.CheckingAccount;
import br.com.alura.java.model.LifeInsurance;

public class IncomeTaxManagerTest {
  public static void main(String[] args) {
    IncomeTaxManager taxManager = new IncomeTaxManager();

    LifeInsurance li = new LifeInsurance();
    taxManager.add(li);

    CheckingAccount cAccount = new CheckingAccount();
    try {
      cAccount.deposit(1000.0);
    } catch (Exception e) {
      System.err.println("Error using deposit");
      e.printStackTrace(System.err);
    }
    taxManager.add(cAccount);

    System.out.println(taxManager.getTotal());
  }
}
