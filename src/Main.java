import com.digitalbank.interfaces.account.IAccount;
import com.digitalbank.models.account.CheckingAccount;
import com.digitalbank.models.client.Client;
import com.digitalbank.models.account.SavingsAccount;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Client welliton = new Client();
        welliton.setName("Welliton");

        IAccount ca = new CheckingAccount(welliton);
        IAccount savingsAccount = new SavingsAccount(welliton);

        ca.put(100);
        ca.transfer(100, savingsAccount);

        ca.printStatement();
        savingsAccount.printStatement();
    }
}