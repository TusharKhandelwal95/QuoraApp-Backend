package com.example.quoraappclone.services;

import com.example.quoraappclone.models.Question;
import com.example.quoraappclone.models.Tag;
import com.example.quoraappclone.models.User;
import com.example.quoraappclone.repositories.QuestionRepository;
import com.example.quoraappclone.repositories.UserRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class UserFeedService {

    UserRepository userRepository;
    QuestionRepository questionRepository;

    public UserFeedService(UserRepository userRepository, QuestionRepository questionRepository) {
        this.userRepository = userRepository;
        this.questionRepository = questionRepository;
    }

    public List<Question> getUserFeed(Long userId, int page, int size){
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
        Set<Long> followedUserIds = user.getFollowedTags().stream().map(Tag::getId).collect(Collectors.toSet());
        return questionRepository.findQuestionsByTags(followedUserIds, PageRequest.of(page, size)).getContent();
    }
}
