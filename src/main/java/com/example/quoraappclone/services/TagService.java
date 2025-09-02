package com.example.quoraappclone.services;

import com.example.quoraappclone.dtos.TagDTO;
import com.example.quoraappclone.models.Tag;
import com.example.quoraappclone.repositories.TagRepository;
import com.example.quoraappclone.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TagService {

    private TagRepository tagRepository;

    public TagService(TagRepository tagRepository) {
        this.tagRepository = tagRepository;
    }

    public List<Tag> getAllTags() {
        return tagRepository.findAll();
    }

    public Tag createTag(TagDTO tagDTO){
        Tag tag = new Tag();
        tag.setName(tagDTO.getName());
        return tagRepository.save(tag);
    }

    public void deleteTag(Long id) {
        tagRepository.deleteById(id);
    }

    public Optional<Tag> getTagById(Long id) {
        return tagRepository.findById(id);
    }
}
