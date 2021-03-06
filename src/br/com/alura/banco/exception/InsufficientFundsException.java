package br.com.alura.banco.exception;

public class InsufficientFundsException extends RuntimeException {
  private Double currentFunds;

  public InsufficientFundsException(Double currentFunds) {
    super("Insufficient Funds");
    this.currentFunds = currentFunds;
  }

  public Double getCurrentFunds() {
    return currentFunds;
  }
}
