package springboot.learningwithguru.spring6.repository;

import org.springframework.data.repository.CrudRepository;
import springboot.learningwithguru.spring6.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Integer> {


}
