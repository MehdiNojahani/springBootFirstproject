package springboot.learningwithguru.spring6.bootstrap;

import org.hibernate.annotations.Comment;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import springboot.learningwithguru.spring6.domain.Author;
import springboot.learningwithguru.spring6.domain.Book;
import springboot.learningwithguru.spring6.repository.AuthorRepository;
import springboot.learningwithguru.spring6.repository.BookRepository;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author detail = new Author();
        Book javaProgramming=new Book();

        detail.setFirstName("jayson");
        detail.setLastName("detail");

        javaProgramming.setTitle("Java_Programming");
        javaProgramming.setIsbn("4152");

        Author detailSaved= authorRepository.save(detail);
        Book javaProgrammingSaved=bookRepository.save(javaProgramming);

        detailSaved.getBooks().add(javaProgrammingSaved);

        authorRepository.save(detailSaved);

        System.out.println("*****************************");
        System.out.println("/Boot strap/");
        System.out.println("author count: " + authorRepository.count());
        System.out.println("book count: " + bookRepository.count());
    }
}
