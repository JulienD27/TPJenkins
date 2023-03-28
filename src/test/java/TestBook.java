import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Calendar;
import java.util.Date;

class TestBook {
    @Test
    @MethodSource("testBook")
    void testBook() {
        Book book = new Book("The Hobbit", "J.R.R. Tolkien", new Date(1937, Calendar.OCTOBER, 21));
        assertEquals("The Hobbit", book.title);
        assertEquals("J.R.R. Tolkien", book.author);
        assertEquals(new Date(1937, Calendar.OCTOBER, 21), book.published);
    }
}
