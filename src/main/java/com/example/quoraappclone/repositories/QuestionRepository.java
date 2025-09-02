package com.example.quoraappclone.repositories;

import com.example.quoraappclone.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question,Long> {
}
