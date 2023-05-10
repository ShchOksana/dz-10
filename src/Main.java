import exceprions.WrongAccountException;
import exceprions.WrongCurrencyException;
import exceprions.WrongOperationException;

public class Main {

    public static void main(String[] args) {
        BankApplication bankApplication = new BankApplication();

        getException(bankApplication,"accountId000", 50, "USD");
        getException(bankApplication,"accountId003", 250, "HRV");
        getException(bankApplication,"accountId001", 50, "EUR");
        getException(bankApplication,"accountId001", 50, "USD");
        getException(bankApplication,"accountId001", 51, "USD");

    }

        private static void getException(BankApplication bankApplication, String accountId, int amount, String currency){
        try {
            bankApplication.process(accountId, amount, currency);
        } catch (WrongOperationException | WrongAccountException | WrongCurrencyException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception e) {
            System.out.println("Сталася помилка при процесінгу, спробуйте ще раз");
        } finally {
            System.out.println("Дякуємо, що скористалися нашим сервісом");
        }

        System.out.println("-----------------------------------");
    }
}
