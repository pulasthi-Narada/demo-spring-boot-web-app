package lk.oulasthi.frist.boostratp;

import lk.oulasthi.frist.model.Autor;
import lk.oulasthi.frist.model.Book;
import lk.oulasthi.frist.model.Publisher;
import lk.oulasthi.frist.repostories.AutorRepo;
import lk.oulasthi.frist.repostories.BookRepo;
import lk.oulasthi.frist.repostories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AutorRepo autorRepo;
    private final BookRepo bookRepo;
    private  final PublisherRepository publisherRepository;

    public BootStrapData(AutorRepo autorRepo, BookRepo bookRepo, PublisherRepository publisherRepository) {
        this.autorRepo = autorRepo;
        this.bookRepo = bookRepo;
        this.publisherRepository = publisherRepository;
    }


    @Override
    public void run(String... args) throws Exception {

        Publisher publisher = new Publisher();
        publisher.setName("SFG Publishing");
        publisher.setCity("St Petersburg");
        publisher.setState("FL");

        publisherRepository.save(publisher);

        Autor eric = new Autor("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "123123");
        eric.getBooks().add(ddd);
        ddd.getAutors().add(eric);

        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);

        autorRepo.save(eric);
        bookRepo.save(ddd);

        Autor rod = new Autor("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "3939459459");
        rod.getBooks().add(noEJB);
        noEJB.getAutors().add(rod);

        noEJB.setPublisher(publisher);
        publisher.getBooks().add(noEJB);

        autorRepo.save(rod);
        bookRepo.save(noEJB);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: " + bookRepo.count());
        System.out.println("Publisher Number of Books: " + publisher.getBooks().size());

    }
}
