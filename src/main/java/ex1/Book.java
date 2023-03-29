package ex1;

public class Book {
    private String title;
    private String auteur;
    private String datePublication;

    public Book(String title, String auteur, String datePublication) {
        this.title = title;
        this.auteur = auteur;
        this.datePublication = datePublication;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(String datePublication) {
        this.datePublication = datePublication;
    }
}