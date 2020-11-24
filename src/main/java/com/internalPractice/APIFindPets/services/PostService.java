package com.internalPractice.APIFindPets.services;

import com.internalPractice.APIFindPets.entities.Post;
import com.internalPractice.APIFindPets.repositories.PostRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class PostService {

    @Inject
    private PostRepository postRepository;

    public List<Post> getAllPosts(){return postRepository.findAll(); }
    public Post getPostById(Long id) { return  postRepository.findById(id).get(); }
    public void storePost(Post post) {postRepository.save(post) ;}
    public void deletePost( Long id) { postRepository.deleteById(id);}

}
