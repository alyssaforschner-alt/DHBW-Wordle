package de.dhbw.stuttgart.wordle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import de.dhbw.stuttgart.wordle.model.Game;
import de.dhbw.stuttgart.wordle.model.Status;
import de.dhbw.stuttgart.wordle.model.User;

public interface GameRepository extends JpaRepository<Game, Long>
{
	Game findByGameID(Long gameID);
	Game findByUser2ID(Long userID);
	Game findByUser2IDAndStatus(Long userID, Status status);
}
