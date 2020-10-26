package com.survivingcodingbootcamp.blog.controller;

import com.survivingcodingbootcamp.blog.storage.TopicStorage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HashTagController {
    private TopicStorage topicStorage;

    public HashTagController(TopicStorage topicStorage) {

        this.topicStorage = topicStorage;
    }

    @GetMapping("/hashtag")
    public String displayHashtagPage(Model model) {
       /// model.addAttribute("topics", topicStorage.retrieveAllTopics());
        return "all-hashtags-template";
    }
    @GetMapping("/hashtag/{id}")
    public String displaySingleHashtagPage(Model model) {
        /// model.addAttribute("topics", topicStorage.retrieveAllTopics());
        return "single-hashtag-template";
    }

    @GetMapping("/hashtag/new")
    public String newSingleHashtagPage(Model model) {
        /// model.addAttribute("topics", topicStorage.retrieveAllTopics());
        return "single-post-template";
    }

}
