package com.example.quoraappclone.repositories;

import com.example.quoraappclone.models.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
