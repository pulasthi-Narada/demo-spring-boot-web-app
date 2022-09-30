package lk.oulasthi.frist;

import lk.oulasthi.frist.model.Book;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.Set;

@SpringBootTest
class FristApplicationTests {

	@Test
	void contextLoads() {
		Book b = new Book();
		Book bb = new Book();
		b.setBookId(1);
		b.setIsbn("a");
		b.setTitle("a");

		bb.setBookId(1);
		bb.setIsbn("a");
		bb.setTitle("a");

		Set<Book> bookSet =  new HashSet<>();
		bookSet.add(b);
		bookSet.add(bb);

		System.out.println(bookSet);


	}

}
