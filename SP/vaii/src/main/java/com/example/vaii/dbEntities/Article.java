package com.example.vaii.dbEntities;

import java.time.LocalDate;

public class Article {
    private Long articleId;
    private String title;
    private String content;
    private User author;
    private LocalDate articleDate;

    public Article(Long articleId, String title, String content, User author, LocalDate articleDate) {
        this.articleId = articleId;
        this.title = title;
        this.content = content;
        this.author = author;
        this.articleDate = articleDate;
    }

    public Long getArticleId() {
        return this.articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
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

    public User getAuthor() {
        return this.author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public LocalDate getArticleDate() {
        return this.articleDate;
    }

    public void setArticleDate(LocalDate articleDate) {
        this.articleDate = articleDate;
    }
}
