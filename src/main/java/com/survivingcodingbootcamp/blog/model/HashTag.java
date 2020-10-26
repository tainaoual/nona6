package com.survivingcodingbootcamp.blog.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class HashTag {
    @Id
    @GeneratedValue
    private Long id;

    private String title;
    @ManyToMany
    private Collection<Post> posts;



    public HashTag(Collection<Post> posts) {
        this.posts = posts;
    }
    public Collection<Post> getPosts() {
        return posts;
    }
    public HashTag(String title) {
        this.title = title;
    }
    protected HashTag() {
    }
    public Long getId()
    {
        return id;
    }
    public String getTitle() {
        return title;
    }


    @Override
    public String toString() {
        return "HashTag{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HashTag hashTag = (HashTag) o;

        if (id != null ? !id.equals(hashTag.id) : hashTag.id != null) return false;
        return title != null ? title.equals(hashTag.title) : hashTag.title == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        return result;
    }
}

