package com.example.vaii.service;

import com.example.vaii.dataAccess.CommentRepository;
import com.example.vaii.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    private final CommentRepository commentRepository;

    @Autowired
    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public List<Comment> getAllComments() {
        return this.commentRepository.findAll();
    }

    public void addNewComment(Comment comment) {
        this.commentRepository.save(comment);
    }
}
