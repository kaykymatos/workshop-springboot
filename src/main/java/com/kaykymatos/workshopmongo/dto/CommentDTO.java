package com.kaykymatos.workshopmongo.dto;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String text;
    private Date date;

}
