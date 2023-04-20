package com.porkbelly.board.entity.report;

import com.porkbelly.board.entity.user.Member;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class MemberReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberReportId;

    @Column
    private String memberReportTitle;

    @Column
    private String memberReportContext;

    @ManyToOne
    private Member reportedMember;

    @ManyToOne
    private Member memberReporter;
}
