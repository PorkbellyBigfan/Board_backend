package com.porkbelly.board.entity.article;

import com.porkbelly.board.entity.etc.DateEntity;
import com.porkbelly.board.entity.user.Member;
import com.porkbelly.board.entity.visitor.Visitor;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Article extends DateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long articleId;

    @Column
    private String title;

    @Column
    private String content;

    @Column
    private String articleImage;

    //작성자
    @ManyToOne
    private Member member;

    @Builder.Default
    @OneToMany(mappedBy = "article", fetch = FetchType.LAZY, orphanRemoval = true)
    @OrderBy("replyId asc")
    private Set<Reply> replies = new LinkedHashSet<>();

    @Builder.Default
    @OneToMany(mappedBy = "article", fetch = FetchType.LAZY, orphanRemoval = true)
    private Set<ArticleLike> liker = new LinkedHashSet<>();

    @Builder.Default
    @OneToMany(mappedBy = "article", fetch = FetchType.LAZY, orphanRemoval = true)
    private Set<Visitor> visitors = new LinkedHashSet<>();

}
