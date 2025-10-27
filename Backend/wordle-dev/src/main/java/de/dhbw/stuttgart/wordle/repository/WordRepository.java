package de.dhbw.stuttgart.wordle.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import de.dhbw.stuttgart.wordle.model.Word;

public interface WordRepository extends JpaRepository<Word, Long>{

	List<Word> findAll();
	
	Optional<Word> findByValue(String value);

}
