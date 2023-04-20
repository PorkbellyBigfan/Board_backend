package com.porkbelly.board.entity.article;

import com.porkbelly.board.entity.etc.DateEntity;
import com.porkbelly.board.entity.user.Member;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Reply extends DateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long replyId;

    @Column(nullable = false)
    private String replyContext;

    @Column(nullable = false)
    private String replyGroup;

    @Column(nullable = false)
    private Long replySort;

    @Column
    private boolean hide;

    @ManyToOne
    private Article article;

    @ManyToOne
    private Member member;
}
