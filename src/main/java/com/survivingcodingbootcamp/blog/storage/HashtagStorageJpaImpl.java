


package com.survivingcodingbootcamp.blog.storage;

// import com.survivingcodingbootcamp.blog.model.Hashtag;

import com.survivingcodingbootcamp.blog.model.Hashtag;
import com.survivingcodingbootcamp.blog.storage.repository.HashtagRepository;
import org.springframework.stereotype.Service;

@Service
public class HashtagStorageJpaImpl implements HashtagStorage {

    private HashtagRepository hashtagRepo;

    public HashtagStorageJpaImpl(HashtagRepository hashtagRepo) {
        this.hashtagRepo = hashtagRepo;
    }

    @Override
    public Iterable<Hashtag> retrieveAllHashtags() {
        return hashtagRepo.findAll();
    }

    @Override
    public Iterable<Hashtag> retrieveAllHashTag() {
        return null;
    }

    @Override
    public Hashtag retrieveHashtagById(long id) {
        return hashtagRepo.findById(id).get();
    }

    @Override
    public void save(Hashtag hashtagtoAdd) {
        hashtagRepo.save(hashtagtoAdd);
    }

}