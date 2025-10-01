//package com.example.blogcms.controller;
//
//import org.springframework.web.bind.annotation.*;
//import com.example.blogcms.model.Post;
//import com.example.blogcms.service.PostService;
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/posts")
//public class ApiPostController {
//    private final PostService postService;
//
//    public ApiPostController(PostService postService) {
//        this.postService = postService;
//    }
//
//    @GetMapping
//    public List<Post> getAllPosts() {
//        return postService.findAll();
//    }
//
//    @GetMapping("/{id}")
//    public Post getPost(@PathVariable Long id) {
//        return postService.findById(id);
//    }
//
//    @PostMapping
//    public Post createPost(@RequestBody Post post) {
//        return postService.create(post);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deletePost(@PathVariable Long id) {
//        postService.delete(id);
//    }
//
//    // 更新なども追加可能
//}
