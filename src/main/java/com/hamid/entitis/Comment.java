package com.hamid.entitis;

import javax.persistence.*;

@Entity
@Table(name = "COMMENT")

public class Comment {

    @Id
    @Column(name = "COMMENT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer commentId;

    @Column(name = "AUTHOR")
    private String author;

    @Column(name = "BODY")
    private String body;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
