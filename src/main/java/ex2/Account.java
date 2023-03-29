package ex2;

public class Account {
    private String id;
    private double solde;
    private double taux;

    public Account(String id, double solde, double taux) {
        this.id = id;
        this.solde = solde;
        this.taux = taux;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    public void depot(double montant) {
        this.solde += montant;
    }

    public void retrait(double montant) {
        this.solde -= montant;
    }

    public void transfer(Account account, double montant) {
        this.retrait(montant);
        account.depot(montant);
    }

    public void afficher() {
        System.out.println("Account " + this.id + " : " + this.solde);
    }
    public void calculInteret() {
        this.solde += this.solde * this.taux;
    }
}