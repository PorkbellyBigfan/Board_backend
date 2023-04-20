package com.porkbelly.board.entity.user;

import com.porkbelly.board.entity.article.Article;
import com.porkbelly.board.entity.article.ArticleLike;
import com.porkbelly.board.entity.article.Reply;
import com.porkbelly.board.entity.etc.DateEntity;
import com.porkbelly.board.entity.report.ArticleReport;
import com.porkbelly.board.entity.report.MemberReport;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Member extends DateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;

    @Column(unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column
    private String name;

    @Column(nullable = false)
    private String nickname;

    @Column(unique = true, nullable = false)
    private String mobile;

    @Column
    private String profileImg;
    //프로필
    @Column
    private String memberProfile;

    //게시글
    @Builder.Default
    @OneToMany(mappedBy = "member", fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Article> articles = new ArrayList<>();

    //댓글
    @Builder.Default
    @OneToMany(mappedBy = "member", fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Reply> reply = new ArrayList<>();

    //좋아요
    @Builder.Default
    @OneToMany(mappedBy = "liker", fetch = FetchType.LAZY, orphanRemoval = true)
    private List<ArticleLike> liker = new ArrayList<>();

    //게시글 신고함
    @Builder.Default
    @OneToMany(mappedBy = "articleReporter", fetch = FetchType.LAZY, orphanRemoval = true)
    private List<ArticleReport> articleReporter = new ArrayList<>();
    //멤버 신고함
    @Builder.Default
    @OneToMany(mappedBy = "memberReporter", fetch = FetchType.LAZY, orphanRemoval = true)
    private List<MemberReport> memberReporter = new ArrayList<>();
    //멤버 신고당함
    @Builder.Default
    @OneToMany(mappedBy = "reportedMember", fetch = FetchType.LAZY, orphanRemoval = true)
    private List<MemberReport> reportedMember = new ArrayList<>();
}
