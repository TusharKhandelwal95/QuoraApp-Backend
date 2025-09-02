package com.example.quoraappclone.repositories;

import com.example.quoraappclone.models.Answer;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Integer> {
    Page<Answer> findByQuestionId(Long questionId, Pageable pageable);

    Optional<Answer> findById(Long answerId);

    void deleteById(Long answerId);
}
