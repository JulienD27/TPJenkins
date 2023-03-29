package ex2;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<Account>();
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public void removeAccount(Account account) {
        this.accounts.remove(account);
    }

    public void showAccount(int index) {
        System.out.println("Account " + (index + 1) + ":");
        System.out.println("ID: " + this.accounts.get(index).getId());
        System.out.println("Solde: " + this.accounts.get(index).getSolde());
        System.out.println("Taux: " + this.accounts.get(index).getTaux());
        System.out.println();
    }

    public void showAllAccounts() {
        for (int i = 0; i < this.accounts.size(); i++) {
            this.showAccount(i);
        }
    }

    public void transferer(int index1, int index2, double montant) {
        this.accounts.get(index1).transfer(this.accounts.get(index2), montant);
    }
}