package com.example.quoraappclone.repositories;

import com.example.quoraappclone.models.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
}
