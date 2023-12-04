package com.example.vaii.service;

import com.example.vaii.dataAccess.PostRepository;
import com.example.vaii.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private final PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getAllPosts() {
        return this.postRepository.findAll();
    }

    public void createNewPost(Post post) {
        this.postRepository.save(post);
    }
}
