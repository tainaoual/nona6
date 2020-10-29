


package com.survivingcodingbootcamp.blog.storage;
import com.survivingcodingbootcamp.blog.model.HashTag;

public interface HashTagStorage {

    Iterable<HashTag> retrieveAllHashTags();

    Iterable<HashTag> retrieveAllHashTag();

HashTag retrieveHashTagById(long l);

  void save(HashTag hashtagToAdd);
}