

package com.survivingcodingbootcamp.blog.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Hashtag {
    @Id
    @GeneratedValue
    private Long id;

    private String title;
    @ManyToMany
    private Collection<Post> posts;



    public Hashtag(Collection<Post> posts) {
        this.posts = posts;
    }
    public Collection<Post> getPosts() {
        return posts;
    }

    public Hashtag(String title) {

        this.title = title;
    }
    protected Hashtag() {
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

        Hashtag hashTag = (Hashtag) o;

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
