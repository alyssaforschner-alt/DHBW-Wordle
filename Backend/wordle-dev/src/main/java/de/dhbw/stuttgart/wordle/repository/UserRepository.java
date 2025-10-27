package de.dhbw.stuttgart.wordle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import de.dhbw.stuttgart.wordle.model.User;

public interface UserRepository extends JpaRepository<User, Long>
{
	User findByUsername(String username);
	User findByUserID(Long userID);
}
