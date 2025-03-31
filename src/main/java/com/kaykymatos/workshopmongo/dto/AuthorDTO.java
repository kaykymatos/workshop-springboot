package com.kaykymatos.workshopmongo.dto;

import com.kaykymatos.workshopmongo.domain.User;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class AuthorDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String id;
    private String name;

    public AuthorDTO() {

    }

    public AuthorDTO(User user) {
        super();
        this.id = user.getId();
        this.name = user.getName();
    }

    public AuthorDTO(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AuthorDTO authorDTO = (AuthorDTO) o;
        return Objects.equals(id, authorDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
