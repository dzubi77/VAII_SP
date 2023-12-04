package com.example.vaii.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Post {
    @Id
    @SequenceGenerator(name = "post_sequence", sequenceName = "post_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "post_sequence")
    private Long postID;
    private Long authorID;
    private String title;
    private String content;
    private LocalDate postDate;

    public Post() {
    }

    public Post(Long postID, Long authorID, String title, String content, LocalDate postDate) {
        this.postID = postID;
        this.authorID = authorID;
        this.title = title;
        this.content = content;
        this.postDate = postDate;
    }

    public Post(Long authorID, String title, String content, LocalDate postDate) {
        this.authorID = authorID;
        this.title = title;
        this.content = content;
        this.postDate = postDate;
    }

    public Long getPostID() {
        return this.postID;
    }

    public void setPostID(Long postID) {
        this.postID = postID;
    }

    public Long getAuthorID() {
        return this.authorID;
    }

    public void setAuthorID(Long authorID) {
        this.authorID = authorID;
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

    @Override
    public String toString() {
        return "Post{" +
                "postID=" + this.postID +
                ", authorID=" + this.authorID +
                ", title='" + this.title + '\'' +
                ", content='" + this.content + '\'' +
                ", postDate=" + this.postDate +
                '}';
    }
}
