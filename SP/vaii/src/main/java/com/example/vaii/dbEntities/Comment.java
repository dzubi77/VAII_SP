package com.example.vaii.dbEntities;

import java.time.LocalDate;

public class Comment {
    private Long commentId;
    private Long postId;
    private Long userId;
    private String content;
    private LocalDate commentDate;

    public Comment(Long commentId, Long postId, Long userId, String content, LocalDate commentDate) {
        this.commentId = commentId;
        this.postId = postId;
        this.userId = userId;
        this.content = content;
        this.commentDate = commentDate;
    }

    public Long getCommentId() {
        return this.commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public Long getPostId() {
        return this.postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getCommentDate() {
        return this.commentDate;
    }

    public void setCommentDate(LocalDate commentDate) {
        this.commentDate = commentDate;
    }
}
