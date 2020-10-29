
package com.survivingcodingbootcamp.blog.controller;

import com.survivingcodingbootcamp.blog.model.Hashtag;
import com.survivingcodingbootcamp.blog.model.Post;
import com.survivingcodingbootcamp.blog.storage.PostStorage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/posts")
public class PostController {
    private PostStorage postStorage;

    public PostController(PostStorage postStorage) {
        this.postStorage = postStorage;
    }
    @GetMapping("/{id}")
    public String displaySinglePost(@PathVariable long id, Model model) {
        model.addAttribute("post", postStorage.retrievePostById(id));
        return "single-hashtag-template";
    }

    @PostMapping("/post/add")
    public String addPost(@ModelAttribute String title, Model model) {

        Post post = new Post(title);
        postStorage.save(post);

        model.addAttribute("posts", postStorage.retrieveAllPosts());

        //  model.addAttribute("hashtag", title);
        return "single-hashtag-template";
    }
}