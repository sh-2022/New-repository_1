//package com.example.blogcms.model;
//
//import jakarta.persistence.*;
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "likes")
//// 以下は「いいね」機能関連のコードですが、今は使わないのでコメントアウトします
//public class Like {
    /*
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="post_id")
    private Post post;

    @ManyToOne
    @JoinColumn(name="user_id", nullable = true)
    private User user;  // ログインユーザー向け（今は使わない）

    private String anonId; // 匿名ユーザー識別子

    private LocalDateTime createdAt;

    @PrePersist
    public void prePersist() {
        createdAt = LocalDateTime.now();
    }
    */
//}