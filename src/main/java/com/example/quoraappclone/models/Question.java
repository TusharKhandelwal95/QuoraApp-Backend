package com.example.quoraappclone.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Question extends BaseModel {

    private String title;
    private String content;

    @ManyToMany
    @JoinTable(
            name = "question_tags",
            joinColumns = @JoinColumn(name = "question_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    private java.util.Set<Tag> tags;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
