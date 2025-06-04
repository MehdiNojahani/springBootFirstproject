package springboot.learningwithguru.spring6.repository;

import org.springframework.data.repository.CrudRepository;
import springboot.learningwithguru.spring6.domain.Author;

//this interface implement CRUD with Repository design pattern and extends
public interface AuthorRepository extends CrudRepository<Author, Integer> {
}
