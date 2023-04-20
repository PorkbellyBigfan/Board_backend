package com.porkbelly.board.entity.report;

import com.porkbelly.board.entity.article.Article;
import com.porkbelly.board.entity.user.Member;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ArticleReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long articleReportId;

    @Column
    private String articleReportTitle;

    @Column
    private String articleReportContext;

    @ManyToOne
    private Article article;

    @ManyToOne
    private Member articleReporter;
}
