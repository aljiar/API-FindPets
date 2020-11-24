package com.internalPractice.APIFindPets.repositories;

import com.internalPractice.APIFindPets.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
