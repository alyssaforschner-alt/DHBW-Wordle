package de.dhbw.stuttgart.wordle;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import de.dhbw.stuttgart.wordle.repository.RandomWordRepository;
import de.dhbw.stuttgart.wordle.repository.WordRepository;

@SpringBootApplication
public class WordleApplication {

	public static void main(String[] args) {
		SpringApplication.run(WordleApplication.class, args);
	}
	
	@Bean
    @Order(Ordered.LOWEST_PRECEDENCE)
    CommandLineRunner check(WordRepository repo) {
        return args -> System.out.println("Wörter in DB: " + repo.count());
    }
	
	@Bean
    @Order(Ordered.LOWEST_PRECEDENCE)
    CommandLineRunner checkRandom(RandomWordRepository repo) {
        return args -> System.out.println("Random-Wörter in DB: " + repo.count());
    }
}
