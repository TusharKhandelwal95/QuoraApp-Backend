package com.example.quoraappclone.repositories;

import com.example.quoraappclone.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
