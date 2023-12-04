package com.example.vaii.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Comment {
    @Id
    @SequenceGenerator(name = "comment_sequence", sequenceName = "comment_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "comment_sequence")
    private Long commentID;
    private Long postID;
    private Long authorID;
    private String content;
    private LocalDate publishedDate;

    public Comment() {
    }

    public Comment(Long commentID, Long postID, Long authorID, String content, LocalDate publishedDate) {
        this.commentID = commentID;
        this.postID = postID;
        this.authorID = authorID;
        this.content = content;
        this.publishedDate = publishedDate;
    }

    public Comment(Long postID, Long authorID, String content, LocalDate publishedDate) {
        this.postID = postID;
        this.authorID = authorID;
        this.content = content;
        this.publishedDate = publishedDate;
    }

    public Long getCommentID() {
        return this.commentID;
    }

    public void setCommentID(Long commentID) {
        this.commentID = commentID;
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

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getPublishedDate() {
        return this.publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentID=" + commentID +
                ", postID=" + postID +
                ", authorID=" + authorID +
                ", content='" + content + '\'' +
                ", publishedDate=" + publishedDate +
                '}';
    }
}
