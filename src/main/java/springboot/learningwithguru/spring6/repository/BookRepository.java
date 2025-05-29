package springboot.learningwithguru.spring6.repository;

import org.springframework.data.repository.CrudRepository;
import springboot.learningwithguru.spring6.domain.Book;

//this interface implement CRUD with Repository design pattern and extends
public interface BookRepository extends CrudRepository<Book, Integer> {


}
