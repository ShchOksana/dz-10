package exceprions;

public class WrongCurrencyException extends Exception{
    public WrongCurrencyException() {
        super("Акаунт має рахунок в іншій валюті");
    }
}
