package ex1;

import exercice1.Book;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.Assert.assertEquals;

public class testBook {
    @DisplayName("Test Book")
    @ParameterizedTest(name = "converting {0} should result in {1}")
    @CsvSource({
            "Harry Potter, J.K. Rowling, 1997",
            "Le Seigneur des Anneaux, J.R.R. Tolkien, 1954",
            "Le Hobbit, J.R.R. Tolkien, 1937",
    })
    public void testBook(String title, String auteur, String datePublication) {
        Book book = new Book(title, auteur, datePublication);
        assertEquals(title, book.getTitle());
        assertEquals(auteur, book.getAuteur());
        assertEquals(datePublication, book.getDatePublication());
    }
}