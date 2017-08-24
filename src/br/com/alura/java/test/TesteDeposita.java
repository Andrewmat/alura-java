package br.com.alura.java.test;

import br.com.alura.java.model.Account;
import br.com.alura.java.model.CheckingAccount;

public class TesteDeposita {
  public static void main(String[] args) {
    Account ac = new CheckingAccount();
    try {
      ac.deposit(-100.0);
    } catch(IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }
}
