package com.survivingcodingbootcamp.blog.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Post {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String authorName;
    private String posts;
    @ManyToOne
    private Topic topic;
    @Lob
    private String content;
    @ManyToMany(mappedBy ="posts")
private Collection<HashTag>hashTags;

    public Post(Collection<HashTag> hashTags) {
        this.hashTags = hashTags;
    }

    public Collection<HashTag> getHashTags() {
        return hashTags;
    }

    protected Post() {
    }
    public Post(String title, Topic topic, String content, String authorName) {
        this.title = title;
        this.topic = topic;
        this.content = content;
        this.authorName = authorName;
    }

    public String getPosts() {
        return posts;
    }

    public Post(String posts) {
        this.posts = posts;
    }
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Topic getTopic() {
        return topic;
    }

    public String getContent() {
        return content;
    }

    public String getAuthorName() {
        return authorName;
    }
    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", topic=" + topic +
                ", content='" + content + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Post post = (Post) o;

        if (!id.equals(post.id)) return false;
        if (!title.equals(post.title)) return false;
        if (!topic.equals(post.topic)) return false;
        if (!content.equals(post.content)) return false;
        return authorName.equals(post.authorName);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + title.hashCode();
        result = 31 * result + topic.hashCode();
        result = 31 * result + content.hashCode();
        result = 31 * result + authorName.hashCode();
        return result;
    }
}