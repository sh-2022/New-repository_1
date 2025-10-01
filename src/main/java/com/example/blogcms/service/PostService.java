//package com.example.blogcms.service;
//
//import com.example.blogcms.model.Post;
//import com.example.blogcms.repository.PostRepository;
//import org.springframework.stereotype.Service;
//import org.springframework.beans.factory.annotation.Value;
//import java.util.List;
//
//@Service
//public class PostService {
//    private final PostRepository postRepo;
//
//    public PostService(PostRepository postRepo) {
//        this.postRepo = postRepo;
//    }
//
//    public Post create(Post p) {
//        return postRepo.save(p);
//    }
//
//    public Post findById(Long id) {
//        return postRepo.findById(id).orElseThrow(() -> new RuntimeException("Post Not Found"));
//    }
//
//    public List<Post> findAll() {
//        return postRepo.findAll();
//    }
//
//    public void delete(Long id) {
//        postRepo.deleteById(id);
//    }
//}
