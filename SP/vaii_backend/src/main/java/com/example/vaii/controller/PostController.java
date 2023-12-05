package com.example.vaii.controller;

import com.example.vaii.model.Post;
import com.example.vaii.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/posts")
public class PostController {
    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public List<Post> getAllPosts() {
        return this.postService.getAllPosts();
    }

    @PostMapping
    public void createNewPost(@RequestBody Post post) {
        this.postService.createNewPost(post);
    }
}
