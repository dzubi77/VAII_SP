package com.example.vaii.dbEntities;

import java.time.LocalDate;

public class Post {
    private Long postId;
    private Long userId;
    private String title;
    private String content;
    private LocalDate postDate;

    public Post(Long postId, Long userId, String title, String content, LocalDate postDate) {
        this.postId = postId;
        this.userId = userId;
        this.title = title;
        this.content = content;
        this.postDate = postDate;
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

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getPostDate() {
        return this.postDate;
    }

    public void setPostDate(LocalDate postDate) {
        this.postDate = postDate;
    }
}
