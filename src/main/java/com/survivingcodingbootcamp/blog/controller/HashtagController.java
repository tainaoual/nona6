package com.survivingcodingbootcamp.blog.controller;

import com.survivingcodingbootcamp.blog.model.Hashtag;
import com.survivingcodingbootcamp.blog.storage.HashtagStorage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HashtagController {
    private HashtagStorage hashtagStorage;

    public HashtagController(HashtagStorage hashtagStorage) {

        this.hashtagStorage = hashtagStorage;
    }

    @PostMapping("/hashtag/add")
    public String addHashtag(@ModelAttribute String title, Model model) {

        Hashtag hashtag = new Hashtag(title);
        hashtagStorage.save(hashtag);

        model.addAttribute("allHashtags", hashtagStorage.retrieveAllHashtags());

        //  model.addAttribute("hashtag", title);

        return "single-hashtag-template";
        // return "all-hashtags-template";
    }


    @GetMapping("/hashtag")
    public String showAllPostsPage(Model model) {
        model.addAttribute("allHashtags", hashtagStorage.retrieveAllHashtags());
        return "single-hashtag-template";
        // return "all-hashtags-template";
    }

    @GetMapping("/hashtag/{id}")
    public String displaySingleHashtagPage(Model model, @PathVariable long id) {
        model.addAttribute("hashTag", hashtagStorage.retrieveHashtagById(id));
        // return "single-hashtag-template";




        return "all-hashtags-template" ;
    }

}