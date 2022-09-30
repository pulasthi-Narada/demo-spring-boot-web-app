package lk.oulasthi.frist.repostories;

import lk.oulasthi.frist.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book,Integer> {
}
