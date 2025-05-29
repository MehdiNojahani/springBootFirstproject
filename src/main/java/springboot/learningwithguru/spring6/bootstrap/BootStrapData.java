package springboot.learningwithguru.spring6.bootstrap;

import org.hibernate.annotations.Comment;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import springboot.learningwithguru.spring6.domain.Author;
import springboot.learningwithguru.spring6.domain.Book;
import springboot.learningwithguru.spring6.domain.Publisher;
import springboot.learningwithguru.spring6.repository.AuthorRepository;
import springboot.learningwithguru.spring6.repository.BookRepository;
import springboot.learningwithguru.spring6.repository.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository=publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        //instance of entity
        Author detail = new Author();
        Book javaProgramming=new Book();
        Publisher john = new Publisher();

        //initialize instance
        detail.setFirstName("jayson");
        detail.setLastName("detail");

        javaProgramming.setTitle("Java_Programming");
        javaProgramming.setIsbn("4152");

        john.setPublisherName("John Thompson");
        john.setAddress("hulk blvd. 412 line ");
        john.setCity("London");
        john.setZipCode("8745");
        john.setState("df");

        //save instance (CRUD) in table automatic with Repository design pattern :
        Author detailSaved= authorRepository.save(detail);
        Book javaProgrammingSaved=bookRepository.save(javaProgramming);
        Publisher johnPublisherSaved=publisherRepository.save(john);

        detailSaved.getBooks().add(javaProgrammingSaved);

        authorRepository.save(detailSaved);


        publisherRepository.save(johnPublisherSaved);


        System.out.println("*****************************");
        System.out.println("/Boot strap/");
        System.out.println("author count: " + authorRepository.count());
        System.out.println("book count: " + bookRepository.count());
        System.out.println("publisher: " + publisherRepository.count());
    }
}
