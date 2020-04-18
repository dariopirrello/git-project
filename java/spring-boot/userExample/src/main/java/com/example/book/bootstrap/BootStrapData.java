package com.example.book.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.book.entity.User;
import com.example.book.repository.UserRepository;

/**  @Author Dario Pirrello
 */

@Component
public class BootStrapData implements CommandLineRunner {
	private final UserRepository userRepository;

    
    public BootStrapData(UserRepository userRepository) 
    {
    	this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception 
    {
    	User dario = new User();
    	
    	dario.setName("Dario");
    	dario.setSurname("Pirrello");
    	
    	userRepository.save(dario);

    	User enea = new User();
    	
    	enea.setName("Enea");
    	enea.setSurname("Roat");
    	
    	userRepository.save(enea);
    	
        System.out.println("Started in Bootstrap");
        System.out.println("Number of User: " + userRepository.count());
    }
}