package com.porkbelly.board.repository.report;

import com.porkbelly.board.entity.report.MemberReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberReportRepository extends JpaRepository<MemberReport, Long> {
}
