package com.example.blogcms.controller;

import com.example.blogcms.model.Post;
import com.example.blogcms.repository.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    private final PostRepository repo;

    public PostController(PostRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("posts", repo.findAll());
        return "index";
    }

    @GetMapping("/new")
    public String newPostForm(Model model) {
        model.addAttribute("post", new Post());
        return "form";
    }

    @PostMapping("/save")
    public String savePost(@ModelAttribute Post post) {
        repo.save(post);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String editPost(@PathVariable Long id, Model model) {
        model.addAttribute("post", repo.findById(id).orElseThrow());
        return "form";
    }

    @GetMapping("/delete/{id}")
    public String deletePost(@PathVariable Long id) {
        repo.deleteById(id);
        return "redirect:/";
    }
    @GetMapping("/post/{id}")
    public String showPostDetail(@PathVariable Long id, Model model) {
        Post post = repo.findById(id).orElseThrow();
        model.addAttribute("post", post);
        return "post_detail";
    }
}