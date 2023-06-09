package ex2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testBank {
    @Test
    void testBank() {
        Account account = new Account("Account1", 1000.0, 0.01);
        Account account2 = new Account("Account2", 2000.0, 0.02);

        Bank bank = new Bank();
        bank.addAccount(account);
        bank.addAccount(account2);

        bank.transferer(0, 1, 100);
        Assertions.assertEquals(900, bank.getAccounts().get(0).getSolde());
        Assertions.assertEquals(2100, bank.getAccounts().get(1).getSolde());

        bank.showAccount(0);
        bank.showAccount(1);

        bank.removeAccount(account);
        bank.removeAccount(account2);
        Assertions.assertEquals(0, bank.getAccounts().size());
    }

}