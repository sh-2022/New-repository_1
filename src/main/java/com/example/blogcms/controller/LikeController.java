//package com.example.blogcms.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//import com.example.blogcms.service.LikeService;
//
//import jakarta.servlet.http.Cookie; // ← 追加
//import jakarta.servlet.http.HttpServletResponse; // ← 追加
//import java.util.UUID; // ← すでにあるのでOK
//
//@Controller
//@RequestMapping("/likes")
//public class LikeController {
//    private final LikeService likeService;
//
//    public LikeController(LikeService likeService) {
//        this.likeService = likeService;
//    }
//
//    @PostMapping("/toggle")
//    public String toggleLike(
//            @RequestParam Long postId,
//            @RequestParam(required = false) Long userId,
//            @CookieValue(value = "anonId", required = false) String anonId,
//            HttpServletResponse response
//    ) {
//        // 匿名用 anonId cookie 生成・管理
//        if (anonId == null) {
//            anonId = generateRandomAnonId(); // UUIDで生成
//            Cookie cookie = new Cookie("anonId", anonId); // Cookie の利用
//            cookie.setPath("/");
//            cookie.setMaxAge(60 * 60 * 24 * 365); // 1年
//            response.addCookie(cookie);
//        }
//        likeService.toggle(postId, userId, anonId);
//        return "redirect:/post/" + postId;
//    }
//
//    // 👇 generateRandomAnonId メソッドを追加
//    private String generateRandomAnonId() {
//        return UUID.randomUUID().toString();
//    }
//}