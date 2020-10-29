
package com.survivingcodingbootcamp.blog;

import com.survivingcodingbootcamp.blog.model.Hashtag;
import com.survivingcodingbootcamp.blog.model.Post;
import com.survivingcodingbootcamp.blog.model.Topic;
import com.survivingcodingbootcamp.blog.storage.HashtagStorage;
import com.survivingcodingbootcamp.blog.storage.PostStorage;
import com.survivingcodingbootcamp.blog.storage.TopicStorage;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Populator implements CommandLineRunner {

    private TopicStorage topicStorage;
    private PostStorage postStorage;
    // private Topic topic5;
    private HashtagStorage hashtagStorage;


    public Populator(TopicStorage topicStorage, PostStorage postStorage, HashtagStorage hashtagStorage) {

        this.topicStorage = topicStorage;
        this.postStorage = postStorage;
        this.hashtagStorage = hashtagStorage;
        // this.topic5 = topic5;
    }

    @Override
    public void run(String... args) throws Exception {
        Topic topic5 = new Topic("Author Name");
        topicStorage.save(topic5);
        Topic topic1 = new Topic("Learning TDD");
        topicStorage.save(topic1);

        Post post1 = new Post("TDD For Fun and Profit", topic1, "Lorem ipsum dolor sit amet, consectetur " +
                "adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim" +
                " veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis " +
                "aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
                "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id " +
                "est laborum.", "nona");
        postStorage.save(post1);
        Post post2 = new Post("Test the Fear Away", topic1, "Lorem ipsum dolor sit amet, consectetur " +
                "adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim" +
                " veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis " +
                "aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
                "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id " +
                "est laborum.", "nona");
        postStorage.save(post2);
        Post post3 = new Post("Unit Tests and You", topic1, "Lorem ipsum dolor sit amet, consectetur " +
                "adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim" +
                " veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis " +
                "aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
                "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id " +
                "est laborum.", "nona");
        postStorage.save(post3);
        // Topic topic5 = null;
        Post post5 = new Post("author name ",topic5, "MR Been ", "ben");
        postStorage.save(post5);
        // Topic topic5 =new Topic("Author Name");
        topicStorage.save(topic5);
        Topic topic2 = new Topic("Battling Imposter Syndrome");
        topicStorage.save(topic2);
        Topic topic3 = new Topic("Introductory Java");
        topicStorage.save(topic3);
        Topic topic4 = new Topic("Object Oriented Programming and You");
        topicStorage.save(topic5);
        // Topic topic5 = new Topic("nona ");

        Hashtag hashtag = new Hashtag("nona lost");

        hashtagStorage.save(hashtag);
        //  (new hashtag("#nona" ));



    }
}
//<ul class="hashtag-list"><li> <a th:each="post: ${post}" th:text="${post}"></a></li>  </ul>
//<for