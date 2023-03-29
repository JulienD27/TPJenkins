package ex2;

import exercice2.Account;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testAccount {
    private static Stream<Account> accountProvider() {
        return Stream.of(
                new Account("A1", 100.0, 0.01),
                new Account("A2", 500.0, 0.02),
                new Account("A3", 1000.0, 0.03)
        );
    }
    @ParameterizedTest
    @MethodSource("accountProvider")
    public void testGetId(Account account) {
        assertEquals(account.getId(), account.getId());
    }

    @ParameterizedTest
    @MethodSource("accountProvider")
    public void testGetSolde(Account account) {
        assertEquals(account.getSolde(), account.getSolde());
    }

    @ParameterizedTest
    @MethodSource("accountProvider")
    public void testGetTaux(Account account) {
        assertEquals(account.getTaux(), account.getTaux());
    }

    @ParameterizedTest
    @MethodSource("accountProvider")
    public void testDepot(Account account) {
        double montant = 50.0;
        double expected = account.getSolde() + montant;
        account.depot(montant);
        assertEquals(expected, account.getSolde());
    }

    @ParameterizedTest
    @MethodSource("accountProvider")
    public void testRetrait(Account account) {
        double montant = 50.0;
        double expected = account.getSolde() - montant;
        account.retrait(montant);
        assertEquals(expected, account.getSolde());
    }

    @ParameterizedTest
    @MethodSource("accountProvider")
    public void testTransfer(Account account) {
        Account account2 = new Account("A4", 200.0, 0.02);
        double montant = 50.0;
        double expectedSolde1 = account.getSolde() - montant;
        double expectedSolde2 = account2.getSolde() + montant;
        account.transfer(account2, montant);
        assertEquals(expectedSolde1, account.getSolde());
        assertEquals(expectedSolde2, account2.getSolde());
    }

    @ParameterizedTest
    @MethodSource("accountProvider")
    public void testCalculInteret(Account account) {
        double expected = account.getSolde() * (1 + account.getTaux());
        account.calculInteret();
        assertEquals(expected, account.getSolde());
    }
}