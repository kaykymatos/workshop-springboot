package com.kaykymatos.workshopmongo.dto;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class CommentDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String text;
    private Date date;
    private AuthorDTO author;

    public CommentDTO() {

    }

    public CommentDTO(String text, Date date, AuthorDTO author) {
        super();
        this.text = text;
        this.date = date;
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public AuthorDTO getAuthor() {
        return author;
    }

    public void setAuthor(AuthorDTO author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CommentDTO that = (CommentDTO) o;
        return Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(text);
    }
}
