package springboot.learningwithguru.spring6.repository;

import org.springframework.data.repository.CrudRepository;
import springboot.learningwithguru.spring6.domain.Publisher;

//Publisher entity repository design pattern implemented for CRUD in db JPA
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
