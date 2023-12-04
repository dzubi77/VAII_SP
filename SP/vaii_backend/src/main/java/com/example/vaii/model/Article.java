package com.example.vaii.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Article {
    @Id
    @SequenceGenerator(name = "article_sequence", sequenceName = "article_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "article_sequence")
    private Long articleID;
    private String title;
    private String content;
    private String author;
    private LocalDate publishedDate;

    public Article() {
    }

    public Article(Long articleID, String title, String content, String author, LocalDate publishedDate) {
        this.articleID = articleID;
        this.title = title;
        this.content = content;
        this.author = author;
        this.publishedDate = publishedDate;
    }

    public Article(String title, String content, String author, LocalDate publishedDate) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.publishedDate = publishedDate;
    }

    public Long getArticleID() {
        return this.articleID;
    }

    public void setArticleID(Long articleID) {
        this.articleID = articleID;
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

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getPublishedDate() {
        return this.publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }

    @Override
    public String toString() {
        return "Article{" +
                "articleID=" + this.articleID +
                ", title='" + this.title + '\'' +
                ", content='" + this.content + '\'' +
                ", author='" + this.author + '\'' +
                ", publishedDate=" + this.publishedDate +
                '}';
    }
}
