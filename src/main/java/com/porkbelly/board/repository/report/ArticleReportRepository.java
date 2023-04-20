package com.porkbelly.board.repository.report;

import com.porkbelly.board.entity.report.ArticleReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleReportRepository extends JpaRepository<ArticleReport, Long> {
}
