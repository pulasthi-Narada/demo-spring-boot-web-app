package lk.oulasthi.frist.repostories;

import lk.oulasthi.frist.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;


public interface BookRepo extends CrudRepository<Book,Integer> {
}
