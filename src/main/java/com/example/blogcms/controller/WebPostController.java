//package com.example.blogcms.controller;
//
//import com.example.blogcms.dto.PostDto;
//import com.example.blogcms.model.Post;
//import com.example.blogcms.service.PostService;
//import com.example.blogcms.service.FileStorageService;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.IOException;
//
//@Controller
//@RequestMapping("/posts")
//public class WebPostController {
//
//    private final FileStorageService fileStorageService;
//    private final PostService postService;
//
//    public WebPostController(FileStorageService fileStorageService, PostService postService) {
//        this.fileStorageService = fileStorageService;
//        this.postService = postService;
//    }
//
//    // 新規投稿画面を表示する GET メソッドなどがあるならここに
//    @GetMapping("/new")
//    public String showNewForm(@ModelAttribute("post") PostDto postDto) {
//        return "form";  // form.html を返す
//    }
//
//    // ←ここにあなたの savePost を入れます
//    @PostMapping("/save")
//    public String savePost(
//            @ModelAttribute PostDto postDto,
//            @RequestParam("imageFile") MultipartFile imageFile
//    ) {
//        try {
//            // ファイルの保存
//            String imageUrl = fileStorageService.store(imageFile);
//            // Post エンティティ作成
//            Post post = new Post();
//            post.setTitle(postDto.getTitle());
//            post.setContentMarkdown(postDto.getContent());
//            post.setImageUrl(imageUrl);
//            // 保存
//            postService.create(post);
//            // 投稿成功後は一覧などにリダイレクト
//            return "redirect:/";
//        } catch (Exception e) {
//            e.printStackTrace();
//            return "error";  // error.html テンプレートに飛ばす
//        }
//    }
//
//    // 他のメソッド（編集、表示、一覧など）もこのクラスにあるかもしれません
//}