package com.example.vaii.controller;

import com.example.vaii.model.Comment;
import com.example.vaii.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommentController {
    private final CommentService commentService;

    @Autowired
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping
    public List<Comment> getAllComments() {
        return this.commentService.getAllComments();
    }

    @PostMapping
    public void addNewComment(@RequestBody Comment comment) {
        this.commentService.addNewComment(comment);
    }
}
