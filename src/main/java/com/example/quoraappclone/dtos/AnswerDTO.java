package com.example.quoraappclone.dtos;

import lombok.Data;

import java.util.Set;

@Data
public class AnswerDTO {
    private String content;
    private Long userId;
    private Long questionId;
}
