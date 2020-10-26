package com.survivingcodingbootcamp.blog.storage;

import com.survivingcodingbootcamp.blog.model.HashTag;

import com.survivingcodingbootcamp.blog.storage.repository.HashTagRepository;
import org.springframework.stereotype.Service;

@Service
public class HashTagStorageJpaImpl implements HashTagStorage {
    private HashTagRepository hashtagRepo;

    public HashTagStorageJpaImpl(HashTagRepository hashtagRepo) {
        this.hashtagRepo = hashtagRepo;
    }

    @Override
    public Iterable<HashTag> retrieveAllHashTags() {
        return hashtagRepo.findAll();
    }

    @Override
    public Iterable<HashTag> retrieveAllHashTag() {
        return hashtagRepo.findAll();
    }

    @Override
    public HashTag retrieveHashTagById(long id) {
        return hashtagRepo.findById(id).get();
    }

    @Override
    public void save(HashTag hashtagToAdd) {
        hashtagRepo.save(hashtagToAdd);
    }
}

