package com.example.quoraappclone.repositories;

import com.example.quoraappclone.models.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag,Long> {
}
