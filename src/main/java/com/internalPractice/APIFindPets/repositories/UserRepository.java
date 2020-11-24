package com.internalPractice.APIFindPets.repositories;

import com.internalPractice.APIFindPets.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
