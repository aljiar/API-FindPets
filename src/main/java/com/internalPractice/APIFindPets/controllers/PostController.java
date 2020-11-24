package com.internalPractice.APIFindPets.controllers;

import com.internalPractice.APIFindPets.entities.Post;
import com.internalPractice.APIFindPets.services.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    @Inject
    private PostService postService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createPost(@RequestBody Post post) {
        postService.storePost(post);
    }
    @GetMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Post> getPosts() {
        return postService.getAllPosts();
    }
    @GetMapping("/{postId}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Post getPost(@PathVariable Long postId){
        return postService.getPostById(postId);
    }
    @DeleteMapping("/{postId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleetPost(@PathVariable Long postId) {
        postService.deletePost(postId);
    }
    @PutMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updatePost(@RequestBody Post post) {
        postService.storePost(post);
    }
}
