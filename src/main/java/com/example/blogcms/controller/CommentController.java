package com.example.blogcms.controller;

import com.example.blogcms.model.Comment;
import com.example.blogcms.model.Post;
import com.example.blogcms.repository.CommentRepository;
import com.example.blogcms.repository.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/comments")
public class CommentController {

    private final CommentRepository commentRepo;
    private final PostRepository postRepo;

    public CommentController(CommentRepository commentRepo, PostRepository postRepo) {
        this.commentRepo = commentRepo;
        this.postRepo = postRepo;
    }

    @PostMapping("/save")
    public String saveComment(@RequestParam Long postId,
                              @RequestParam String username,
                              @RequestParam String content) {
        Post post = postRepo.findById(postId).orElseThrow();
        Comment comment = new Comment();
        comment.setPost(post);
        comment.setUsername(username);
        comment.setContent(content);
        commentRepo.save(comment);
        return "redirect:/post/" + postId;
    }

    @GetMapping("/delete/{id}")
    public String deleteComment(@PathVariable Long id) {
        Comment comment = commentRepo.findById(id).orElseThrow();
        Long postId = comment.getPost().getId();
        commentRepo.deleteById(id);
        return "redirect:/post/" + postId;
    }
}