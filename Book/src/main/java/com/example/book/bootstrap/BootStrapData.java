package com.example.book.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.book.domain.Author;
import com.example.book.domain.Book;
import com.example.book.domain.Publisher;
import com.example.book.repository.AuthorRepository;
import com.example.book.repository.BookRepository;
import com.example.book.repository.PublisherRepository;

/*
 * 
 */

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;
    
    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository,PublisherRepository publisherRepository) 
    {
		this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

//    	creazione dell'entity
    	Publisher publisher = new Publisher();
    	
    	publisher.setCity("Alcamo");
    	publisher.setAddress("SVG Address");
    	publisher.setState("Italy");
    	publisher.setZipCode("91011");
    	
    	publisherRepository.save(publisher);
    	
    	
//    	creazione delle entity
        Author eric = new Author("Eric1", "Evans");
        Book ddd = new Book("Domain Driven Design", "123123");
//      Set  
        eric.getBooks().add(ddd);
        
        ddd.getAuthors().add(eric);
        ddd.setPublisher(publisher);
        
        publisher.getBooks().add(ddd);
//       Save
        authorRepository.save(eric);
        bookRepository.save(ddd);
        publisherRepository.save(publisher);
        
        System.out.println("Number of Publisher: " + publisherRepository.count());
        
        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "3939459459");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);
        noEJB.setPublisher(publisher);
        publisher.getBooks().add(ddd);
        
        authorRepository.save(rod);
        bookRepository.save(noEJB);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: " + bookRepository.count());
    }
}