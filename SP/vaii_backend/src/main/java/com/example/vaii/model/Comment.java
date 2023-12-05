package com.example.vaii.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "comment")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column
    private UUID commentID;
    @Column
    private Long postID;
    @Column
    private Long authorID;
    @Column
    private String content;
    @Column
    private LocalDate publishedDate;
}
