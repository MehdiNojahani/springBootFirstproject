package springboot.learningwithguru.spring6.repository;

import org.springframework.data.repository.CrudRepository;
import springboot.learningwithguru.spring6.domain.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {


}
